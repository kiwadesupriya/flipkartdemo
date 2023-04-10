package org.example.pageActions;

import org.example.StepDefinations.CommonSteps;
import org.example.pageElements.LoginElements;
import org.openqa.selenium.WebDriver;

public class LoginActions {

    WebDriver driver;
    LoginElements loginElements;

    public LoginActions(CommonSteps commonSteps, LoginElements loginElements) {
        this.driver = commonSteps.getDriver();
        this.loginElements = loginElements;
    }
    }


