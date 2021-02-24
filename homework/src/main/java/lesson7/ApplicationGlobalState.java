package lesson7;
//класс хранит все переменные
public class ApplicationGlobalState {
    private static ApplicationGlobalState INSTANCE;
    private String selectedCity=null;
    private final String API_KEY="0E2atmhXpOan3HqdvRFaAkTx0ceEJITT";
    public static ApplicationGlobalState getInstance(){
        if(INSTANCE ==null) {
            INSTANCE =new ApplicationGlobalState();
        }
        return INSTANCE;
    }

    public String getAPIKey()
    {
        return API_KEY;
    }
}