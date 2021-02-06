import com.google.gson.Gson; 
import com.google.gson.GsonBuilder; 

// Δικά μου in imports  πάνω στις δοκιμές
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;




public class GsonTester { 
   public static void main(String[] args) {
      
      Writer writer = null;
              
      JsonObject jsonObject = new JsonObject();        
      JsonArray orders = new JsonArray();
      JsonObject stocks = new JsonObject();
      
      String jsonString = "{\"name\":\"Mahesh\", \"age\":21}"; 
      
      GsonBuilder builder = new GsonBuilder(); 
      builder.setPrettyPrinting(); 
      
      Gson gson = builder.create(); 
      Student student = gson.fromJson(jsonString, Student.class); 
      System.out.println(student);    
      
      jsonString = gson.toJson(student); 
      System.out.println(jsonString);  
   } 
} 



//    private static void generateJSonReport() {
//        Writer writer = null;
//                
//        JsonObject jsonObject = new JsonObject();        
//        JsonArray orders = new JsonArray();
//        JsonObject stocks = new JsonObject();
//        
//        
//        for(Order o : e.getPendingOrders()){
//            orders.add(o.getId());
//                        
//            
//            System.out.println("Country:" + o.getId());
//            for(Product p : o.getProducts().keySet()){
//                if(p instanceof SimpleProduct){
//                    System.out.println("id:"+p.getId() +" Name:" + p.getName() + " Price:"+p.getPrice(o)+ " Category:"+p.getCategory().getName() + " producttype: Simple");
//                }
//                else{                                        
//                    System.out.println("id:"+p.getId() +" Name:" + p.getName() + " Price:"+p.getPrice(o)+ " Category:"+p.getCategory().getName() + " producttype: compositeproduct");
//                    System.out.println("###########################################");
//                    for(Product cp : ((CompositeProduct) p).getComponents().keySet()){
//                        System.out.println("id:"+cp.getId() +" Name:" + cp.getName() + " Price:"+cp.getPrice(o)+ " Category:"+cp.getCategory().getName() + " component");
//                    }
//                    System.out.println("###########################################");
//                    
//                }
//            }
//            System.out.println("-------------end order-----------------------");
//        }
//        
//        Iterable<Map.Entry<SimpleProduct,Integer>> stock = e.getStock();
//        
//                  
//        for (Map.Entry<SimpleProduct, Integer> stockproduct : stock){                                    
//            stocks.addProperty(stockproduct.getKey().getName(), stockproduct.getValue());
//        }        
//        
//        
//        jsonObject.add("pendingOrders", orders);
//        jsonObject.add("stock", stocks);
//
//        try {
//            FileWriter file = new FileWriter("stats.json");
//            file.write(jsonObject.toString());
//            file.close();
//         } catch (IOException err) {
//            // TODO Auto-generated catch block
//            err.printStackTrace();
//         }
//         System.out.println("JSON file created: "+jsonObject);
     
