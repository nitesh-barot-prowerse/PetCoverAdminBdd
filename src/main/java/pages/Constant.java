package pages;

public class Constant {
    public static  String ENVIRONMENT=System.getProperty("environment");

    public static String url;
    static {
        if(ENVIRONMENT.equals("QA")){
            url="http://52.32.106.250:8889/";
        }
    }
}
