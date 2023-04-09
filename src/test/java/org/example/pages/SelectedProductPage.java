package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefinitions.Hooks.driver;


public class SelectedProductPage {

    private By basketButton = By.xpath("//button[@class='btn btn-red btn-block fontLightEnAr']");
    private By miniBasketIcon = By.xpath("//div[@class='icon-container-mini']/a/div");

    public WebElement addToBasketButtonFun(){
        return  driver.findElement(basketButton);
    }

    public WebElement miniBasketIconFun(){
        return driver.findElement(miniBasketIcon);
    }
}
