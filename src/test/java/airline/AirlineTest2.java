package airline;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payload.CreateAirlinePayload;
import Restutills.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class AirlineTest2 {

    @Test
    public void createAirline(){
        String endpoint="https://api.instantwebtools.net/v1/airlines";
        String payload= CreateAirlinePayload.airLinePayload("3264","Sri Lankan Airways");
        System.out.println("payload"+payload);
        Response res= RestUtils.performPost(endpoint,payload,new HashMap<>());
        Assert.assertEquals(res.statusCode(),200);
    }

    @Test
    public void createAirline1(){
        String endpoint="https://api.instantwebtools.net/v1/airlines";
        Map<String,Object>ss1 = CreateAirlinePayload.airLinePayloadUsingMap("23623","Sri Lankan Airways",
                "Sri Lanka","https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
                "From Sri Lanka","Katunayake, Sri Lanka","www.srilankaairways.com","1990");
        System.out.println("payload"+ss1);
        Response res= RestUtils.performPostBYMap(endpoint,ss1,new HashMap<>());

        Assert.assertEquals(res.statusCode(),200);
    }
}
