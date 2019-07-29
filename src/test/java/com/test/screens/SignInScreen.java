package com.test.screens;
import com.test.Configurations.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class SignInScreen {
    private AndroidDriver driver;
    private AndroidElement submit;
    private AndroidElement usernameField;
    private AndroidElement passwordField;
    private List<MobileElement> listOfFields;

    public SignInScreen() {
        this.driver = new Hooks().getAndroidDriver();
        this.submit = (AndroidElement) this.driver.findElementByXPath("//*[@text=\"Sign In\"]");
        this.listOfFields = this.driver.findElementsByXPath("//android.widget.EditText");
        this.usernameField = (AndroidElement) this.listOfFields.get(1);
        this.passwordField = (AndroidElement) this.listOfFields.get(2);
    }

    public AndroidElement getSubmit() {
        return submit;
    }

    public AndroidElement getUsernameField() {
        return usernameField;
    }

    public AndroidElement getPasswordField() {
        return passwordField;
    }

    public List<MobileElement> getListOfFields() {
        return listOfFields;
    }
}