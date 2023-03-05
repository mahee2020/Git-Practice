package utills;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ReadJson {

    static private ObjectMapper objectMapper = new ObjectMapper();

    public static Map<String, Object> getJsonDataAsMap(String jsonFileName) throws IOException {
        String completeJsonPath = System.getProperty("user.dir") + "/src/test/resources/" + jsonFileName;
        Map<String, Object> data = (Map<String, Object>) objectMapper.readValue(new File(completeJsonPath), new TypeReference<Object>() {
        });
        return data;


    }
}
