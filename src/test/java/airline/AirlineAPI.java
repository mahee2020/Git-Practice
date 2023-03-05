package airline;

import Restutills.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class AirlineAPI {

    public Response createAirline(Map<String,Object>createAirlinePaylod){

           String  endpoint= (String) Base.datafromJsonFile.get("createAirLineEndPoint");
           return RestUtils.performPostBYMap(endpoint,createAirlinePaylod,new HashMap<>());

    }



}
