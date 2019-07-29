package com.test.screens;
import com.test.Configurations.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class AccountScreen {

    private AndroidDriver driver;
    private AndroidElement title;
    private List<MobileElement> listOfElem;

    public AccountScreen() {
        this.driver = new Hooks().getAndroidDriver();
        this.listOfElem = this.driver.findElementsByXPath("//android.widget.TextView");
        this.title = (AndroidElement) listOfElem.get(0);
    }

    public AndroidElement getTitle() {
        return title;
    }

}