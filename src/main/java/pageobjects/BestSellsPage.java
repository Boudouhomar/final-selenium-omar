package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BestSellsPage {

    WebDriver driver;

    By highTechButton = By.cssSelector("div._p13n-zg-nav-tree-all_style_zg-browse-group__88fbz > div:nth-child(20) > a");
    By productButton = By.cssSelector("#gridItemRoot");
    public BestSellsPage(WebDriver driver) {
        this.driver = driver;
    }

    public BestSellsPage showHighTechProducts(){
        driver.findElement(highTechButton).click();
        return this;
    }

    public ProductPage openProduct(int index){
        List<WebElement> listOfProduct = driver.findElements(productButton);
        listOfProduct.get(index).click();
        return new ProductPage(driver);
    }



}
