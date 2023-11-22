package utils;

import interfaces.IDataLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import session.Session;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Data {


    public static IDataLoader from(String filePath) throws IOException {

        if(filePath.endsWith(".json")) {
            JSONObject json = openJson(filePath);
            return new JsonDataLoader(json, getAbsoluteFilePath(filePath));
        } else {
            return new GenericDataLoader(getAbsoluteFilePath(filePath));
        }
    }

    public static IDataLoader arrayFrom(String filePath, String arrayName) throws IOException {
        if(filePath.endsWith(".json")) {
            JSONArray jsonArray = openJsonArray(filePath, arrayName);
            return new JsonDataLoader(jsonArray,getAbsoluteFilePath(filePath));
        } else {
            throw new RuntimeException(filePath + "file type not supported");
        }
    }

    protected static JSONObject openJson(String fileName) throws IOException {
        String filePath = getRelativeFilePath(fileName);
        JSONObject json = JsonUtils.readJsonObjectFromFile(filePath);
        return json;
    }

    protected static JSONArray openJsonArray(String fileName, String arrayName) throws IOException {
        String filePath = getRelativeFilePath(fileName);
        JSONObject jsonObject = JsonUtils.readJsonObjectFromFile(filePath);
        return jsonObject.getJSONArray(arrayName);
    }

    protected static String getRelativeFilePath(String fileName) {
        String dataset = getDataset();
        String path =  dataset + "/" + fileName;
        return path;
    }

    protected static Path getAbsoluteFilePath(String fileName) throws FileNotFoundException {
        String filepath =  getDataset() + "/" + fileName;
        URL url = Data.class.getClassLoader().getResource(filepath);
        if(url == null) {
            throw new FileNotFoundException("no such file at " + filepath);
        }
        try {
            return Paths.get(url.toURI());
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }

    protected static String getDataset() {
        return Session.getInstance().getDataSet();
    }
}
