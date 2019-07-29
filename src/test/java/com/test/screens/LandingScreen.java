package com.test.screens;
import com.test.Configurations.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LandingScreen {

    private AndroidDriver driver;
    private AndroidElement profile;

    public LandingScreen() {
        this.driver = new Hooks().getAndroidDriver();
        this.profile = (AndroidElement) this.driver.findElementByXPath("//android.view.ViewGroup[2]/android.view.ViewGroup[5]");
    }

    public AndroidElement getProfile() {
        return profile;
    }

    public AndroidDriver getDriver() {
        return driver;
    }
}