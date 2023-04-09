package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.StepDefinitions.Hooks.driver;
public class HomePage {


    private By englishButton = By.xpath("//span[@class='lang']");

    ////ul[@class='brandContainer-brands-list utag--brands']/li[6]
    private By appleIcon = By.xpath("//*[@id=\"shopByBrandCard\"]/div/img");



    public WebElement englishButtonFun(){
      return driver.findElement(englishButton);

   }

    public WebElement appleIconFun(){
       return driver.findElement(appleIcon);
    }



}
