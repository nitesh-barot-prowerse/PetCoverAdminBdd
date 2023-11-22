package actions;

import dataModels.LogIn;
import pages.LogInPage;
import utils.Data;

import java.io.IOException;

public class LoginActions {
    private LogInPage login;
    //private LoungeSearchPage loungeSearchPage;

    public LogIn  getAccountDetails(String user) throws Exception {
      return  Data.from(user).get(LogIn.class);
    }

    /*public void loginAsAdmin() throws Exception {
        loginAs("admin");
    }*/


}
