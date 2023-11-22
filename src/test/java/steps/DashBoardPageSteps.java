package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DashBoardPage;
import pages.LogInPage;
import utils.ScreenRecorderUtil;

public class DashBoardPageSteps {
    DashBoardPage dbp=new DashBoardPage(DriverFactory.getDriver());

    @Then("Dash board page displays with total and monthly numbers of client,quote,policy and claim")
    public void dash_board_page_displays_with_total_and_monthly_numbers_of_client_quote_policy_and_claim() {
        String itemsDetails = dbp.verifyClientDetails();
        String itemDetail[] = itemsDetails.split("\s");
        int aLength = itemDetail.length;
        for (int i = 0; i < aLength; i++) {
            if (itemDetail[i].length()>0) {
                System.out.println(itemDetail[i]);
            } else if (itemDetail[i].length()>0) {
                System.out.println(itemDetail[i]);
            } else if (itemDetail[i].length()>0) {
                System.out.println(itemDetail[i]);

            } else {
                Assert.fail();
            }
        }
        String quoteDetails = dbp.verifyQuote();
        System.out.println(quoteDetails);
        String quoteDetail[] = quoteDetails.split("\s");
        int qLength = quoteDetail.length;
        for (int i = 0; i < qLength; i++) {
            if (quoteDetail[i].length() > 0) {
                System.out.println(quoteDetail[i]);
            } else if (quoteDetail[i].length() > 0) {
                System.out.println(quoteDetail[i]);
            } else if (quoteDetail[i].length() > 0) {
                System.out.println(quoteDetail[i]);

            } else {
                Assert.fail();
            }
        }

        String policyDetails = dbp.verifyPolicy();
        String policyDetail[] = policyDetails.split("\s");
        int pLength = policyDetail.length;
        for (int i = 0; i < pLength; i++) {
            if (policyDetail[i].length()>0) {
                System.out.println(policyDetail[i]);
            } else if (policyDetail[i].length()>0) {
                System.out.println(policyDetail[i]);
            } else if (policyDetail[i].length()>0) {
                System.out.println(policyDetail[i]);

            } else {
                Assert.fail();
            }
        }

        String claimDetails = dbp.verifyClaims();
        String claimDetail[] = claimDetails.split("\s");
        int cLength = claimDetail.length;
        for (int i = 0; i < cLength; i++) {
            if (claimDetail[i].length()>0) {
                System.out.println(claimDetail[i]);
            } else if (claimDetail[i].length()>0) {
                System.out.println(claimDetail[i]);
            } else if (claimDetail[i].length()>0) {
                System.out.println(claimDetail[i]);

            } else {
                Assert.fail();
            }
        }

    }

}
