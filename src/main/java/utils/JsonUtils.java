package utils;


import org.json.JSONObject;
import utils.FileUtils;

import java.io.IOException;

public class JsonUtils {

    public static JSONObject readJsonObjectFromFile(String filePath) throws IOException {
        String fileContents = FileUtils.loadFileAsString(filePath);
        JSONObject json = new JSONObject(fileContents);
        return json;
    }
}
