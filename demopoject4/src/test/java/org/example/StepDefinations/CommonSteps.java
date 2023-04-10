package org.example.StepDefinations;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.w3c.dom.html.HTMLImageElement;

import java.util.concurrent.TimeUnit;

public class CommonSteps {
     WebDriver driver;

    public WebDriver getDriver() {
        return (driver);
    }

    @Before
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }

}

