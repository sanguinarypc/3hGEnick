import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHTTPTest {

    public static void main(String[] args) {
        
        //Το αρχικό String μας δώσανε στην εκφώνηση
        //String urlToCall = "https://covid2019-api.herokuapp.com/timeseries/confirmed";
        
        // String που τοποθετώ εγώ στον κώδικα μόνο και μόνο για να κάνω δοκιμές
        
        // v1 Simply FAST API for COVID-19 cases exploration COVID-19 API
        
        // Εντολή 1 του API
        // /current        Current Status
        // No parameters
        //String urlToCall = "https://covid2019-api.herokuapp.com/current";
        
        // Εντολή 2 του API  
        // /current_list  Current Status List
        // Coutries are kept in a List
        //String urlToCall = "https://covid2019-api.herokuapp.com/current_list";
        
        // Εντολή 3 του API
        // /total       Total
        // No parameters
        //String urlToCall = "https://covid2019-api.herokuapp.com/total";
        
        // // Εντολή 4 του API
        //   /confirmed       Confirmed Cases
        // No parameters
        //String urlToCall = "https://covid2019-api.herokuapp.com//confirmed";
        
        // Εντολή 5 του API
        // /deaths         Deaths
        // No parameters
        // String urlToCall = "https://covid2019-api.herokuapp.com//death";
        
        // Εντολή 6 του API
        // /recovered      Recovered
        // No parameters
        //String urlToCall = "https://covid2019-api.herokuapp.com/recovered";
        
        // Εντολή 7 του API
        //    /countries                  Affected Countries
        // No parameters
        String urlToCall = "https://covid2019-api.herokuapp.com/countries";
        
        // Εντολή 8 του API
        //  /country/{country_name}       Country
        // Search by name or ISO (alpha2)
        //String urlToCall = "https://covid2019-api.herokuapp.com/country/{Greece}";
        
        // Εντολή 9 του API
        //  /timeseries/{case}       Timeseries
        // Get the time series based on a given case: confirmed, deaths, recovered
        //String urlToCall = "https://covid2019-api.herokuapp.com//timeseries/{case}";
        
        // v2 Simply FAST API for COVID-19 cases exploration COVID-19 API
        
        // Εντολή 1 του API
        // Get the current situation data from all reported countries
        //location: a country's name
        //confirmed: confirmed cases
        //deaths: death cases
        //recovered: recovered cases
        //active: active cases
        // /current       Get Current
        // No parameters
        //String urlToCall = "https://covid2019-api.herokuapp.com/v2/current";
        
        // Εντολή 2 του API
        // Get all data from USA's current situation
        //Province_State: State's name
        //Confirmed: confirmed cases
        //Deaths: death cases
        //Recovered: recovered cases
        //Active: active cases
        //People_Tested: a total number of tested people
        //People_Hospitalized: a total number of hospitalised people
        //      /v2/current/US  Get Current Us
        //String urlToCall = "https://covid2019-api.herokuapp.com/v2/current/US";
        
        // Εντολή 3 του API
        // Get the total numbers of all cases
        // confirmed: confirmed cases
        //deaths: death cases
        //recovered: recovered cases
        //active: active cases
        // /v2/total Get Total
        //String urlToCall = "https://covid2019-api.herokuapp.com/v2/total";
        
        // Εντολή 4 του API
        // Get the total numbers of confirmed cases
        // confirmed: confirmed cases
        // /v2/comfirmed Get Comfirmed
        //String urlToCall = "https://covid2019-api.herokuapp.com/v2/comfirmed";
        
        // Εντολή 5 του API
        // Get the total numbers of confirmed cases
        // deaths: death cases
        // /v2/deaths   Get Deaths
        //String urlToCall = "https://covid2019-api.herokuapp.com/v2/deaths";
        
        // Εντολή 6 του API
        // Get the total numbers of recovered cases
        // recovered: recovered case
        // /v2/recoverd   Get Recovered
        //String urlToCall = "https://covid2019-api.herokuapp.com/v2/recovered";
        
        // Εντολή 7 του API
        // Get the total numbers of active cases
        // active: active case
        // /v2/active     Get Active
        //String urlToCall = "https://covid2019-api.herokuapp.com/v2/active";
        
        // Εντολή 8 του API
        // the data based on a county's name or its ISO code
        // location: a country's name
        // confirmed: confirmed cases
        // deaths: death cases
        // recovered: recovered cases
        // active: active cases
        // Parameters   country_name required string
        // /v2/country/{country_name}   Get Country
        //String urlToCall = "https://covid2019-api.herokuapp.com/v2/country/{country_name}";
        
        // Εντολή 9 του API        
        // Get the time series based on a given case: global, confirmed, deaths, recovered
        //
        // global
        //
        //     key: datetime
        //     confirmed: confirmed cases
        //     deaths: death cases
        //     recovered: recovered case
        // 
        // confirmed, deaths, recovered
        //
        //     Province/State: State's name
        //     Country/Region: Country's name
        //     Coordinates: {"Lat": int, "Long": int}
        //     TimeSeries: [{"date": datetime, "value": int}]
        // /v2/timeseries/{case}   Get Time Series
        //String urlToCall = "https://covid2019-api.herokuapp.com//v2/timeseries/{case}";
        
        // Εντολή 10 του API
        // Get the USA time series based on a given case:
        //confirmed, deaths
        //
        //Province_State: State's name
        //Country_Region: Country's name
        //  Info:{
        //     UID: UID
        //     iso2: ISO2
        //     iso3: ISO3
        //     code3: CODE3
        //     FIPS: FIPS
        //     Admin2: Admin2 }
        // Coordinates: {
        //     Lat: int
        //     Long: int }
        //  TimeSeries: [
        //     {"date: datetime, "value": int} ]       
        // /v2/timeseries/US/{case}   Get Deaths
        //String urlToCall = "https://covid2019-api.herokuapp.com/v2/timeseries/US/{case}";
        
        OkHttpClient client=new OkHttpClient();
        
        Request request = new Request.Builder().url(urlToCall).build();
        
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                String responseString=response.body().string();
                System.out.println(responseString);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }           

    }
}
