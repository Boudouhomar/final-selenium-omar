package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class CartPage {

    WebDriver driver;
    By titleProductCart = By.cssSelector("span.sc-grid-item-product-title > span");
    By quantity = By.cssSelector("#sc-subtotal-label-activecart");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public ArrayList<String> getProductTitleAndQuantity(){
        ArrayList<String> titleAndQuantity = new ArrayList<>();
        titleAndQuantity.add(driver.findElement(titleProductCart).getText());
        titleAndQuantity.add(driver.findElement(quantity).getText());
        return titleAndQuantity;
    }
}
