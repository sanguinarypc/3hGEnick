/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.TimeSeriesCase;
import models.CountryTimeSeries;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.CountriesList;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author panti
 */
public class APIController {

    //Κλήση του Rest API
    private String BaseCall(String endpoint, String... parameters) {
        //Προσθέτουμε στην url της υπηρεσίας την λειτουργία που μας ενδιαφέρει
        String urlToCall = "https://covid2019-api.herokuapp.com/" + endpoint;
        //Προσθέτουμε και τις παραμέτρους
        for (String parameter : parameters) {
            urlToCall += "/" + parameter;
        }
        //Φτιάχνουμε τον client για την υπηρεσία
        OkHttpClient client = new OkHttpClient();
        //Δτιάχνουμε το request για την λειτουργία που μας ενδιαφέρει
        Request request = new Request.Builder().url(urlToCall).build();
        //Κάνουμε την κλήση του REST API
        try (Response response = client.newCall(request).execute()) {
            //Αν η κληση ήταν επιτυχημένη, μας επιστρέφει το json ως string
            if (response.isSuccessful() && response.body() != null) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    //Ζήτα απο το API την λίστα των χωρών
    public CountriesList GetCountriesList() {
        // φτιάχνουμε το endpoint και κάνουμε την κλήση του API
        String restPoint = "countries";
        String stringResults = BaseCall(restPoint);
        //Μετατρέπουμε το jsonstring σε αντικείμενο με την βοήθεια τoυ gson 
        CountriesList cl = new Gson().fromJson(stringResults, CountriesList.class);
        return cl;
    }

//    private String GetCountryTimeSeriesNameFromData(String data){
//        Gson gson = new Gson();
//        Type keyPair = new TypeToken<Map<String, String>>() {}.getType();
//        Map<String, String> countryData = gson.fromJson(data, keyPair);
//        for(Map.Entry item : countryData.entrySet()){
//            if(item.getKey().toString().equals("Country/Region")) 
//                return item.getValue().toString();
//        }
//        return null;
//    }
    
    
    //Ζητάει απο το API μια κατηγορίας timeseries
    public List<CountryTimeSeries> GetTimeSeries(TimeSeriesCase tmCase) {
        
        //inner class με χρήσημες μεθόδος για την μετατροπή του jsonstring σε λίστα αντικειμένων
        class ConvertMethods {
            //Ζητά απο το API τα timeseries μιας κατηγορίας
            private String GetTimeSeriesJson(TimeSeriesCase tmCase) {
                String restPoint = "timeseries/";
                String stringResults = BaseCall(restPoint + tmCase.toString());
                return stringResults;
            }
            //Σπάει το jsonString του timeseries σε λίστα απο jsonstrings ανα χώρα
            private ArrayList<String> ExtractEachCountryString(String text) {
                ArrayList<String> countries = new ArrayList<String>();
                int left = text.indexOf("[");
                int right = text.indexOf("]");
                text = text.substring(left, right);
                //παίρνουμε κάθε substring μεταξύ { και }
                while (text.length() > 1) {
                    left = text.indexOf("{");
                    right = text.indexOf("}");
                    if (left < 0 || right < 0) {
                        break;
                    }
                    String cnt = text.substring(left, right + 1);
                    //αποθηκεύουμε κάθε substring στην λίστα με τα jsonsubstrings
                    countries.add(cnt);
                    text = text.substring(right + 1, text.length() - 1);
                }
                return countries;
            }

            //Μετατρέπουμε το jsonstring σε CountryTimeSeries αντικείμενο
            private CountryTimeSeries ConvertDataToCountry(CountryTimeSeries country, String data, TimeSeriesCase tmCase) {
                Gson gson = new Gson();
                Type keyPair = new TypeToken<Map<String, String>>() {}.getType();
                //To gson μετατρέπει την λίστα των jsonstring σε ζεύγος κλειδιού τιμών
                Map<String, String> countryData = gson.fromJson(data, keyPair);
                //Παίρνουμε τα δεδομένα απο το ζεύγος τιμών και τα αντιστοιχούμε στο αντικείμενο CountryTimeSeries 
                for (Map.Entry item : countryData.entrySet()) {
                    String key = item.getKey().toString();
                    String value = item.getValue().toString();
                    if (key.equals("Country/Region")) {
                        country.country = value;
                    } else if (key.equals("Province/State")) {
                        country.state = value;
                    } else if (key.equals("Lat")) {
                        country.Lat = value;
                    } else if (key.equals("Long")) {
                        country.Long = value;
                    } else {
                        int val = Integer.parseInt(value);
                        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yy");
                        Date date = null;//Date.from(Instant.now());
                        try {
                            date = formatter1.parse(key);
                        } catch (ParseException ex) {
                            Logger.getLogger(APIController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        country.data.put(date, val);
                    }
                }
                return country;
            }

        }
        //Φτιάχνουμε την βοηθητική κλάση
        ConvertMethods cm = new ConvertMethods();
        
        //Η λίστα με τα covid data της κατηγορίας
        List<CountryTimeSeries> countryTimeSeries = new ArrayList<>();
        //Παίρνουμε απο το API τα timeseries μιας κατηγορίας
        String data = cm.GetTimeSeriesJson(tmCase);
        //Το αντικείμενο στο οποίο θα αποθηκεύσουμε τα δεδομένα απο το API
        CountryTimeSeries country;
        //Σπάμε το jsonString του timeseries σε λίστα απο jsonstrings ανα χώρα
        for (String singleCountryString : cm.ExtractEachCountryString(data)) {
            country = new CountryTimeSeries();
            //Μετατρέπουμε το jsonstring σε CountryTimeSeries αντικείμενο
            CountryTimeSeries item = cm.ConvertDataToCountry(country, singleCountryString, tmCase);
            //Το προσθέτουμε στην λίστα με τα covid data της κατηγορίας
            countryTimeSeries.add(item);
        }
        //Επιστρέφουμε την λίστα με τα covid data
        return countryTimeSeries;
    }

}
