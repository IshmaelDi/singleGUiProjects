package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.time.Duration;

public class HomePage  extends PageObject {


    String Url = "https://shambawebtest.clientele.co.za/shambaweb/login";

    String LoginBtn = "//*[@id=\"navbarSupportedContent\"]/div/div/button/span";
    String UserName = "//*[@id=\"i0116\"]";

    String NextBtn = "//*[@id=\"idSIButton9\"]";


    String Password = "//*[@id=\"i0118\"]";

    String SignIn = "//*[@id=\"idSIButton9\"]";

    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    String LeadBasketXpath = "//*[@id=\"navbarDropdown\"]/img";

    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);

        // Test updates
     }
    @Step("Login in using AD account")
    public void loginIn(String Username, String password){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        //WebDriverWait wait = new WebDriverWait(getClautyityutss()).until();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginBtn))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).sendKeys(Username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NextBtn))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Password))).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignIn))).click();

    }

    @Step("Navigate to sales page")
    public void captureSale() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ClienteleLogoXpath))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CaptureSaleXpath))).click();
        $(By.xpath(ClienteleLogoXpath)).click();
        $(By.xpath(CaptureSaleXpath)).click();
        Thread.sleep(20000);

    }
    @Step("Navigate to lead page")
    public void clickLeadBasket(){

        $(By.xpath(LeadBasketXpath)).click();
    }



}
