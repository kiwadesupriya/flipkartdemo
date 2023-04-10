package org.example.pageElements;

import org.example.StepDefinations.CommonSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
    WebDriver driver;

    public LoginElements(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        PageFactory.initElements(driver, this);
    }
}

