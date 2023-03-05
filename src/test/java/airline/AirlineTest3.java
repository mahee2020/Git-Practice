package airline;

import Restutills.RestUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payload.CreateAirlinePayload;
import utills.ReadJson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlineTest3 {

    @Test
    public void createAirline() throws IOException {
        String env= System.getProperty("env")==null? "qa":System.getProperty("env");
        Map<String,Object>data= ReadJson.getJsonDataAsMap("airline/"+env+"/AirlineApiData.json");
        String endpoint= (String) data.get("createAirLineEndPoint");
        String payload= CreateAirlinePayload.airLinePayload("5698","Sri Lankan Airways");
        System.out.println("payload"+payload);
        Response res= RestUtils.performPost(endpoint,payload,new HashMap<>());
        Assert.assertEquals(res.statusCode(),200);
    }


}
