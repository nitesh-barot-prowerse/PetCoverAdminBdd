package interfaces;

import utils.GenericArray;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Path;

public interface IDataLoader {

    public JSONObject get();

    public JSONObject get(String key);

    public <T> T get(Class<T> type);

    public  <T> T get(String key, Class<T> type);

    public JSONArray getJsonArray();

    public JSONObject getFromArray(int index);

    public <T> GenericArray<T> getGenericArray(Class<T> type);

    public Path getFilePath();
}
