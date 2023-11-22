package utils;

import  interfaces.IDataLoader;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Path;

public class JsonDataLoader implements IDataLoader {

    private final JSONObject json;

    private final JSONArray jsonArray;

    private final Path filePath;

    public JsonDataLoader(JSONObject json) {
        this.json = json;
        this.filePath = null;
        this.jsonArray = null;

    }

    public JsonDataLoader(JSONObject json, Path filePath) {
        this.json = json;
        this.filePath = filePath;
        this.jsonArray = null;
    }

    public JsonDataLoader(JSONArray jsonArray) {
        this.json = null;
        this.filePath = null;
        this.jsonArray = jsonArray;
    }

    public JsonDataLoader(JSONArray jsonArray, Path filePath) {
        this.json = null;
        this.filePath = filePath;
        this.jsonArray = jsonArray;
    }

    @Override
    public Path getFilePath() {
        return filePath;
    }

    @Override
    public JSONObject get() {
        return json;
    }

    @Override
    public JSONObject get(String key) {
        try {
            return json == null ? null : json.getJSONObject(key);
        } catch (JSONException ex) {
            throw  new JSONException("Error reading JSON from file " + filePath,ex);
        }

    }

    @Override
    public <T> T get(Class<T> type) {
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,true);
        try {
            return objectMapper.readValue(json.toString(),type);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override

    public <T> T get(String key, Class<T> type) {
        JSONObject value = get(key);
        ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        try {
            return objectMapper.readValue(json.toString(), type);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public JSONArray getJsonArray() {
        return jsonArray;
    }

    @Override
    public JSONObject getFromArray(int index) {
        try {
            return jsonArray == null ? null : jsonArray.getJSONObject(index);
        } catch (JSONException ex) {
            throw new JSONException("Error reading JSON from file " + filePath, ex);
        }
    }


    public <T> GenericArray<T> getGenericArray(Class<T> type) {

        if(jsonArray == null) {
            return null;
        }
        GenericArray<T> ga = new GenericArray<>(type, jsonArray.length());

        for(int index = 0; index < jsonArray.length(); index++){
            JSONObject value  = jsonArray.getJSONObject(index);
            ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,true);
            try {
                ga.set(index,objectMapper.readValue(value.toString(),type));
            } catch (IOException ex) {
                throw new RuntimeException();
            }
        }
        return ga;
    }


}
