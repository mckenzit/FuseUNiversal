package com.test.screens;
import com.test.Configurations.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class ProfileHeroScreen {

    private AndroidDriver driver;
    private AndroidElement domainField;

    public ProfileHeroScreen() {
        this.driver = new Hooks().getAndroidDriver();
        this.domainField = (AndroidElement) this.driver.findElementByXPath("//*[@text=\"tom.mck@fakemail.com\"]");
    }

    public AndroidElement getDomainField() {
        return domainField;
    }
}