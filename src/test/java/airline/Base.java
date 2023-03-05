package airline;

import utills.ReadJson;

import java.io.IOException;
import java.util.Map;

public class Base {
    public static Map<String, Object> datafromJsonFile;

    static {

        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        try {
            datafromJsonFile = ReadJson.getJsonDataAsMap("airline/" + env + "/AirlineApiData.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
