package org.example.StepDefinations;

import io.cucumber.java.en.Given;
import org.example.pageActions.LoginActions;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;

    LoginActions loginActions;

    public LoginSteps(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver = commonSteps.getDriver();
        this.loginActions = loginActions;

    }
    @Given("I lunch the application URL")
    public void i_lunch_the_application_url() {

        driver.get("https://demowebshop.tricentis.com/");
    }
    }


