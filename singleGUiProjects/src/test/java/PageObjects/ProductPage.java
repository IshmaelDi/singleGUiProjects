package PageObjects;

import net.serenitybdd.core.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends PageObject {

    String HELPProductXpath = "//img[@src=\"assets/Help.png\"]";

    String PlanTypeDropdown = "//select[@formcontrolname=\"plan\" ]";

     String OKBtn = "//button[@class=\"btn btn-success\"]";

     String GetRatesXpath = "//span[@class=\"title\"]";

     String PlanOptionXpath = "//select[@formcontrolname=\"planOption\"]";

     String ViewXpath = "//span[@class=\"title\"]";

     String InitiateSaleXpath = "//i[@class=\"fa fa-edit\"]";

     String ContinueOnFAISDiscls = "//button[normalize-space()='Continue']";

    String CloseOnFAISDiscls = "//*[@id=\"mat-dialog-9\"]/app-confirmation-dialog/div/div[3]/div/div[1]/button";
    String DOBXapth = "//input[@formcontrolname=\"mainLifeDOB\"]";
    String ClipBoardXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/div/div[4]/div/a/i";

    public void SelectHELP(){
        $(By.xpath(HELPProductXpath)).click();

    }
    public void selectPlanType(String HELPplanType){

        Select plan = new Select(getDriver().findElement(By.xpath(PlanTypeDropdown)));
        plan.selectByValue(HELPplanType);

//        WebElement productType = $(By.xpath(ProductTypeDropdown));
//        selectFromDropdown(productType, HELPproductType);

    }

    public void clickOkBtn(){
        $(By.xpath(OKBtn)).click();

    }

    public void GetRates(){
        $(By.xpath(GetRatesXpath)).click();

    }
    public void SelectPlanOption(String planOption){

        WebElement plan = $(By.xpath(PlanOptionXpath));
        selectFromDropdown(plan, planOption);

    }

    public void mainLifeDOB(){

        $(By.xpath("//input[@formcontrolname=\"mainLifeDOB\"]")).click();
        $(By.xpath(DOBXapth)).click();
        $(By.xpath(DOBXapth)).sendKeys("1978/05/07" + Keys.ENTER);
    }

    public void  ClickView(){
        $(By.xpath(ViewXpath)).click();

    }

    public void InitiateSale(){
        $(By.xpath(InitiateSaleXpath)).click();
    }

    public void  clickContinueOnFaisDiscl(){
        WebDriverWait wait =  new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement  element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ContinueOnFAISDiscls)));
        element.click();
    }



    public void clickCloseOnFaisDiscl(){
        $(By.xpath(CloseOnFAISDiscls)).click();
    }







}
