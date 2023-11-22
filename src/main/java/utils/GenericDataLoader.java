package utils;

import interfaces.IDataLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.GenericArray;

import java.nio.file.Path;

public class GenericDataLoader implements IDataLoader {

    private Path filePath;

    public GenericDataLoader(Path filePath) {
        this.filePath =  filePath;
    }

    @Override
    public JSONObject get() {
        throw new UnsupportedOperationException("not supported for class GenericDataLoader");
    }

    @Override
    public JSONObject get(String key) {
        return null;
    }

    @Override
    public <T> T get(Class<T> type) {
        throw new UnsupportedOperationException("not supported for class GenericDataLoader");
    }

    @Override
    public <T> T get(String key, Class<T> type) {
        throw new UnsupportedOperationException("not supported for class GenericDataLoader");
    }

    public JSONArray getJsonArray() {
        throw new UnsupportedOperationException("not supported for class GenericDataLoader");
    }

    @Override
    public JSONObject getFromArray(int index) {
        throw new UnsupportedOperationException("not supported for class GenericDataLoader");
    }

    @Override
    public <T> GenericArray<T> getGenericArray(Class<T> type) {
        throw new UnsupportedOperationException("not supported for class GenericDataLoader");
    }

    @Override
    public Path getFilePath() {
        return filePath;
    }
}
