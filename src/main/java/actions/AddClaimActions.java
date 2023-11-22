package actions;

import dataModels.Claim;
import dataModels.Horse;
import utils.Data;

public class AddClaimActions {

    public Claim getClaimDetails(String user) throws Exception {
        return  Data.from(user).get(Claim.class);
    }
}
