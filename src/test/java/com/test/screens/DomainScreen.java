package com.test.screens;
import com.test.Configurations.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class DomainScreen {

    private AndroidDriver driver;
    private AndroidElement submit;
    private AndroidElement domainField;

    public DomainScreen() {
        this.driver = new Hooks().getAndroidDriver();
        this.submit = (AndroidElement) this.driver.findElementByXPath("//*[@text=\"Go\"]");
        this.domainField = (AndroidElement) this.driver.findElementByXPath("//*[@text=\"companydomain\"]");
    }

    public AndroidElement getSubmit() {
        return submit;
    }

    public AndroidElement getDomainField() {
        return domainField;
    }
}