package com.test.stepdefinitions;
import com.test.screens.AccountScreen;
import com.test.screens.LandingScreen;
import com.test.screens.ProfileHeroScreen;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Landing {
    public LandingScreen landing;
    public AccountScreen accountScreen;
    public ProfileHeroScreen profileHeroScreen;

    @Then("^the bottom right button displays \"([^\"]*)\" address at the top$")
    public void theBottomRightButtonDisplaysAddressAtTheTop(String arg0) throws Throwable {
        this.landing = new LandingScreen();
        WebDriverWait wait = new WebDriverWait(this.landing.getDriver(), 30);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup[5]")));
        this.landing.getProfile().click();
        this.accountScreen = new AccountScreen();
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView")));
        this.accountScreen.getTitle().click();
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text=\"tom.mck@fakemail.com\"]")));
        this.profileHeroScreen = new ProfileHeroScreen();
        Assert.assertEquals(this.profileHeroScreen.getDomainField().getText(), arg0);
    }
}
