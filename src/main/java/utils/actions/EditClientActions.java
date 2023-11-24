package utils.actions;

import dataModels.EditClient;
import pages.ClientPage;
import utils.Data;

public class EditClientActions {
    private ClientPage clientPage;
    //private LoungeSearchPage loungeSearchPage;

    public EditClient getEditClientDetails(String user) throws Exception {
        return  Data.from(user).get(EditClient.class);
    }
}
