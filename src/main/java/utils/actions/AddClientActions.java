package utils.actions;

import dataModels.ClientDetails;
import pages.LogInPage;
import utils.Data;

public class AddClientActions {
    private LogInPage login;
    ClientDetails clientDetails;
   // AddClientPage addClientPage;

    //private LoungeSearchPage loungeSearchPage;



    public ClientDetails getClientDetails(String user) throws Exception {
        return  Data.from(user).get(ClientDetails.class);
    }


}
