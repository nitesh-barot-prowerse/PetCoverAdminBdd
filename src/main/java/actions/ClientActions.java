package actions;

import dataModels.Client;
import dataModels.ClientDetails;
import dataModels.LogIn;
import pages.ClientPage;
import pages.LogInPage;
import utils.Data;

public class ClientActions {
    private ClientPage clientPage;
    //private LoungeSearchPage loungeSearchPage;
    public Client getClientDetails(String user) throws Exception {
        return  Data.from(user).get(Client.class);
    }
}
