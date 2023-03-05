package airline;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import Restutills.RestUtils;

import java.util.HashMap;

public class AirlineTest1 {

    @Test
    public void createAirline(){
        String endpoint="https://api.instantwebtools.net/v1/airlines";
        String payload="{\n" +
                "    \"id\": 535,\n" +
                "    \"name\": \"Sri Lankan Airways\",\n" +
                "    \"country\": \"Sri Lanka\",\n" +
                "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                "    \"slogan\": \"From Sri Lanka\",\n" +
                "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
                "    \"website\": \"www.srilankaairways.com\",\n" +
                "    \"established\": \"1990\"\n" +
                "}";
Response res= RestUtils.performPost(endpoint,payload,new HashMap<>());

        Assert.assertEquals(res.statusCode(),200);
    }
}
