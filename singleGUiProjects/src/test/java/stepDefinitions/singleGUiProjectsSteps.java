package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.*;
import org.openqa.selenium.WebDriver;
import PageObjects.HomePage;
import PageObjects.LeadPage;
import PageObjects.ProductPage;
import PageObjects.*;


public class singleGUiProjectsSteps extends PageObject {




    @Steps
    HomePage homePage;
    @Steps
    LeadPage leadPage;
    @Steps
    ProductPage productPage;
    @Steps
    memberPage memberPage;


    @Given("a consultant is logged in to single GUI, captures {string} clicks next button , captures {string} and clicks sign in button.")
    public void a_consultant_is_logged_in_to_single_gui_captures_clicks_next_button_captures_and_clicks_sign_in_button(String UserName, String Password) throws InterruptedException {
        homePage.OpenWebsite();
        homePage.loginIn(UserName, Password);
        homePage.captureSale();
        homePage.clickLeadBasket();
        leadPage.ActionSale();

        productPage.SelectHELP();
        productPage.selectPlanType("YG");
        productPage.clickOkBtn();
        productPage.GetRates();
    }
    @Given("a consultant starts an individual cover.")
    public void a_consultant_starts_an_individual_cover(String Individual) {
        productPage.selectPlanType(Individual);
        productPage.mainLifeDOB();
        productPage.ClickView();
        productPage.InitiateSale();
        productPage.clickContinueOnFaisDiscl();
    }
    @Given("a consultant enters all the necessary required member details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void a_consultant_enters_all_the_necessary_required_member_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("a consultant enters required payer details  {string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string}")
    public void a_consultant_enters_required_payer_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("a consultant enters required beneficiary details {string}, {string}, {string},{string} and Save Beneficiary Information.")
    public void a_consultant_enters_required_beneficiary_details_and_save_beneficiary_information(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("a consultant enters FICA declarations.")
    public void a_consultant_enters_fica_declarations() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("a consultant confirms captured information on summary page.")
    public void a_consultant_confirms_captured_information_on_summary_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("a consultant selects desired rewards.")
    public void a_consultant_selects_desired_rewards() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("a correct policy number should be generated for te client.")
    public void a_correct_policy_number_should_be_generated_for_te_client() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
