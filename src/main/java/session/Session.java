package session;

public class Session {
    private  static Session instance;

    public static synchronized Session getInstance() {
        if(instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public String getDataSet() {
        return ("dataset");
    }
}
