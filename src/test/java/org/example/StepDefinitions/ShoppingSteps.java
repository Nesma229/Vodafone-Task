package org.example.StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.example.StepDefinitions.Hooks.driver;


public class ShoppingSteps {
HomePage homePage =  new HomePage();
ApplePage applePage = new ApplePage();
SelectedProductPage selectedProductPage = new SelectedProductPage();
BasketPage basketPage = new BasketPage();
CheckOutPage checkOutPage = new CheckOutPage();

    @Given("User select english language")
    public void selectEnglish(){
        homePage.englishButtonFun().click();
    }


    @When("User select iphone from shop by brand section")
    public  void selectIphoneFromBrandSection()  throws InterruptedException {
        // wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(homePage.appleIconFun())));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,250);");

        homePage.appleIconFun().click();
    }

    @And("User select one of the products")
    public void selectAppleProduct(){

       applePage.appleProductFun().click();
    }

    @And("User add product into basket")
    public void addProductIntoBasket()  throws InterruptedException{

        Thread.sleep(2000);
        selectedProductPage.addToBasketButtonFun().click();
    }

    @And("User click on basket icon")
    public void clickOnBasketIcon() throws InterruptedException{

        Thread.sleep(2000);
        selectedProductPage.miniBasketIconFun().click();
    }

    @And("User click on proceed to checkout")
    public void clickOnProceedToCheckout() throws InterruptedException {

        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,250);");
        basketPage.proceedCheckoutButtonFun().click();
        Thread.sleep(2000);
    }

    @And("User select city cairo and district ain shams from delivery options")
    public void SelectCityAndDistrictFromDeliveryOptions(){
        Select selectCity = new Select(checkOutPage.cityDropDownFun());
        selectCity.selectByVisibleText("Cairo");
        Select selectDistrict = new Select(checkOutPage.districtDropDownFun());
        selectCity.selectByVisibleText("Ain Shams");
    }

    @And("User press deliver to my address")
    public void pressDeliveryToMyAddress(){
        checkOutPage.deliveryToMyAddressFun().click();

    }

    @And("User fill address fields with details")
    public void fillAddressFieldWithDetails(){
     checkOutPage.streetNmeFun().sendKeys("street");
     checkOutPage.buildingNoFun().sendKeys("50");
     checkOutPage.floorNoFun().sendKeys("4");
     checkOutPage.apartmentNoFun().sendKeys("2");
     checkOutPage.landMarkFun().sendKeys("Heliopolis obelisk");
     checkOutPage.addressNameFun().sendKeys("address");

    }

    @And("User press address continue button")
    public void pressAddressContinueButton(){
    checkOutPage.addressContinueButtonFun().click();
    }

    @And("User skip personal information and press continue")
    public void skipPersonalInfoAndPressContinue(){
     checkOutPage.personalInfoContinueButtonFun().click();
    }

    @Then("User shown an error message returned from full name field")
    public void errorMessageFromFullName(){
      String actualErrorMessage = checkOutPage.fullNameErrorMsgFun().getText();
      String expectedErrorMsg = "Please enter a valid name";
      Assert.assertTrue(actualErrorMessage.contains(expectedErrorMsg));

    }



}
