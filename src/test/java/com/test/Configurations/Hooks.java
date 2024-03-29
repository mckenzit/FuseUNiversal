package com.test.Configurations;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Hooks {

    public static AndroidDriver androidDriver;

    @Before
    public void createDriver() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 28");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability("appActivity", "com.fuse.MainActivity");
        caps.setCapability("appPackage", "com.fuseuniversal.fuse");
        this.androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        this.androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public AndroidDriver getAndroidDriver() {
        return androidDriver;
    }

    @After
    public void breakDown() {
        if (this.androidDriver != null) {
            androidDriver.quit();
        }
    }
}