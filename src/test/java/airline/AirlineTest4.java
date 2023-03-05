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

public class AirlineTest4 extends  AirlineAPI{

    @Test
    public void createAirline1() throws IOException {
        Map<String,Object>Payload = CreateAirlinePayload.airLinePayloadUsingMap("654778","Sri Lankan Airways",
                "Sri Lanka","https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
                "From Sri Lanka","Katunayake, Sri Lanka","www.srilankaairways.com","1990");
        Response res= createAirline(Payload);
        Assert.assertEquals(res.statusCode(),200);
    }
    }



