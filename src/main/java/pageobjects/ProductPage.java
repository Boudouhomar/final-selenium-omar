package pageobjects;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;

    By quantityDropDown = By.name("quantity");
    By addToCartButton = By.cssSelector("#add-to-cart-button");
    By openCartButton = By.cssSelector("#attach-sidesheet-view-cart-button > span > input");
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage changeQuantity(String quantity){
        WebElement selectElement = driver.findElement(quantityDropDown);
        Select select = new Select(selectElement);
        select.selectByValue(quantity);
        return this;
    }

    public ProductPage addToCart(){
        driver.findElement(addToCartButton).click();
        return this;
    }

    public CartPage openCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(openCartButton)).click();
        return new CartPage(driver);
    }
}
