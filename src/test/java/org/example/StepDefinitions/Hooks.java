package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    private Properties props = new Properties();


    public Hooks() throws FileNotFoundException {
       try {
           File filePath = new File("src/main/resources/Properties/configData.properties");
           FileInputStream fileStream = new FileInputStream(filePath);
           props.load(fileStream);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }

    @Before
    public void userLunchBrowser() throws IOException {

       if(props.getProperty("Browser").equalsIgnoreCase("chrome")){
           driver = new ChromeDriver();
       } else if (props.getProperty("Browser").equalsIgnoreCase("firefox")) {
           driver = new FirefoxDriver();
       }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(props.getProperty("Url"));
    }

    @After
    public  void tearDown() throws InterruptedException{
       Thread.sleep(3000);
        driver.quit();
    }

}
