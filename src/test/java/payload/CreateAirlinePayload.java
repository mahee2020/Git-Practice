package payload;

import java.util.HashMap;
import java.util.Map;

public class CreateAirlinePayload {

   public static String airLinePayload(String id , String name ){

       String payload="{\n" +
               "    \"id\": "+id+",\n" +
               "    \"name\": \""+name+"\",\n" +
               "    \"country\": \"Sri Lanka\",\n" +
               "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
               "    \"slogan\": \"From Sri Lanka\",\n" +
               "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
               "    \"website\": \"www.srilankaairways.com\",\n" +
               "    \"established\": \"1990\"\n" +
               "}";
return payload;
   }
    public static Map<String, Object> airLinePayloadUsingMap(String id , String name , String country, String logo, String slogan
    , String head_quaters, String website, String established){

       Map<String,Object> payload = new HashMap<>();
       payload.put("id",id);
        payload.put("name",name);
        payload.put("country",country);
        payload.put("logo",logo);
        payload.put("slogan",slogan);
        payload.put("head_quaters",head_quaters);
        payload.put("website",website);
        payload.put("established",established);

      return payload;



    }


}
