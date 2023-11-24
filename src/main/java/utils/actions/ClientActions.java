package utils.actions;

import dataModels.Client;
import pages.ClientPage;
import utils.Data;

public class ClientActions {
    private ClientPage clientPage;
    //private LoungeSearchPage loungeSearchPage;
    public Client getClientDetails(String user) throws Exception {
        return  Data.from(user).get(Client.class);
    }
}
