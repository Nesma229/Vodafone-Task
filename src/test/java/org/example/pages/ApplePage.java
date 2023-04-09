package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefinitions.Hooks.driver;

public class ApplePage {

    private By appleProduct = By.xpath("//div[@class='productList-cardImg']");

    public WebElement appleProductFun(){
        return  driver.findElement(appleProduct);
    }


}
