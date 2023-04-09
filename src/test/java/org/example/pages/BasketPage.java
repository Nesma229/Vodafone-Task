package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefinitions.Hooks.driver;


public class BasketPage {
    private By proceedToCheckoutButton = By.xpath("/html/body/app-root/div/app-shoping-cart/div/div[1]/div[2]/div[2]/div[2]/div/div[3]/button");

    public WebElement proceedCheckoutButtonFun(){
        return  driver.findElement(proceedToCheckoutButton);
    }

}
