package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefinitions.Hooks.driver;


public class CheckOutPage {

    private By cityDropDown = By.xpath("//div[@class='col-md-4 col-sm-12 checkout-dropdownCity checkoutDeleiveryOptionsPhase2EditWidth']/select");
    private By districtDropDown = By.xpath("//div[@class='col-md-4 col-sm-12 checkoutDeleiveryOptionsPhase2EditWidth']/select");

    private By deliveryToMyAddressButton = By.xpath("//div[@class='checkout-DelivaryOptionsInfo checkout-DelivaryToAddress open firstOpen']");

    private By streetNameField = By.xpath("//input[@placeholder='Street Name']");
    private By buildingNoField = By.xpath("//input[@formcontrolname='buildingNumber']");

    private By floorNoField = By.xpath("//input[@formcontrolname='floorNumber']");
    private By apartmentNoField = By.xpath("//input[@formcontrolname='appartmentNumber']");
    private By landMarkField = By.xpath("//input[@placeholder='Landmark']");
    private By addressNameField = By.xpath("//input[@placeholder='Address Name']");
    private By addressContinueButton = By.xpath("//button[@class='btn checkout-btn btn-red delievry--btn--checkout']");

    private By personalInfoContinueButton = By.xpath("//button[@class='btn checkout-btn btn-red checkoutDeliveryFamilyFont']");

   private By errorMsgContainer = By.xpath("//*[@id=\"collapseTwo\"]/form/div/div/div[1]/div[1]/app-alert/div/div/div/div[2]/div/div/div");



    public WebElement cityDropDownFun(){
        return  driver.findElement(cityDropDown);
    }

    public WebElement districtDropDownFun(){
        return  driver.findElement(districtDropDown);
    }

    public WebElement deliveryToMyAddressFun(){
        return  driver.findElement(deliveryToMyAddressButton);
    }

    public WebElement streetNmeFun() {
        return driver.findElement(streetNameField);
    }
        public WebElement buildingNoFun(){
            return  driver.findElement(buildingNoField);
        }

        public WebElement floorNoFun(){
            return  driver.findElement(floorNoField);
        }
        public WebElement apartmentNoFun() {
            return driver.findElement(apartmentNoField);
        }

         public WebElement landMarkFun() {
                return driver.findElement(landMarkField);
            }

         public WebElement addressNameFun() {
                    return driver.findElement(addressNameField);
                }

         public WebElement addressContinueButtonFun(){
             return  driver.findElement(addressContinueButton);

 }
    public WebElement personalInfoContinueButtonFun(){
        return  driver.findElement(personalInfoContinueButton);

    }

    public WebElement fullNameErrorMsgFun(){
        return  driver.findElement(errorMsgContainer);

    }







}
