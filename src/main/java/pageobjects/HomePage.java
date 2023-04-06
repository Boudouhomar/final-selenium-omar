package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    By cookieAcceptButtonLocator = By.cssSelector("#sp-cc-accept");

    By bestSellButton = By.cssSelector("#nav-xshop > a:nth-child(3)");

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage closeCookiePopup() {
        driver.findElement(cookieAcceptButtonLocator).click();
        return this;
    }

    public BestSellsPage openBestSellsPage(){
        driver.findElement(bestSellButton).click();
        return new BestSellsPage(driver);
    }

}
