package com.test.stepdefinitions;

import com.test.screens.DomainScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Domain {

    public DomainScreen domain;

    @Given("^I am on the domain page$")
    public void iAmOnTheDomainPage() {
        this.domain = new DomainScreen();
    }

    @And("^I add \"([^\"]*)\" as my domain$")
    public void iAddAsMyDomain(String arg0) throws Throwable {
        this.domain.getDomainField().sendKeys(arg0);
        this.domain.getSubmit().click();
    }
}
