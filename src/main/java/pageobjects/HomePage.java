package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    By cookieAcceptButtonLocator = By.cssSelector("#sp-cc-accept");

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage closeCookiePopup() {
        driver.findElement(cookieAcceptButtonLocator).click();
        return this;
    }

}
