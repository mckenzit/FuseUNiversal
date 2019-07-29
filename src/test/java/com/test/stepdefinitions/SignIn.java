package com.test.stepdefinitions;

import com.test.screens.DomainScreen;
import com.test.screens.SignInScreen;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SignIn {

    public SignInScreen signIn;

    @Given("^I am on the sign in page$")
    public void iAmOnTheSignInPage() {
        this.signIn = new SignInScreen();
    }

    @And("^I add \"([^\"]*)\" as username$")
    public void iAddAsUsername(String arg0) throws Throwable {
        this.signIn.getUsernameField().sendKeys(arg0);
    }

    @And("^I add \"([^\"]*)\" as password$")
    public void iAddAsPassword(String arg0) throws Throwable {
        this.signIn.getPasswordField().sendKeys(arg0);
    }

    @When("^I sign-in$")
    public void iSignIn() throws InterruptedException {
        this.signIn.getSubmit().click();
        Thread.sleep(10000);
    }
}
