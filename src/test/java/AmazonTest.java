import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.CartPage;
import pageobjects.HomePage;

import java.util.ArrayList;

public class AmazonTest {

    WebDriver driver;


    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
    }

  /*  @AfterMethod
    public void teardown() {
        driver.quit();
    }*/

    @Test
    public void testAmazon(){
        String productTitle = "Tapo Caméra Surveillance WiFi intérieure 1080P C200, détection de mouvement, audio bidirectionnel, compatible avec Alexa et Google Assistant, pour Bébé/Animaux";
        String quantity = "Sous-total (2 articles):";
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.closeCookiePopup()
                .openBestSellsPage()
                .showHighTechProducts()
                .openProduct(2)
                .changeQuantity("2")
                .addToCart()
                .openCart();

        ArrayList<String> titleAndQuantity = cartPage.getProductTitleAndQuantity();

        Assert.assertEquals(productTitle,titleAndQuantity.get(0),"Le produit dans le panier ne correspond pas");
        Assert.assertEquals(quantity,titleAndQuantity.get(1),"La quantité dans le panier ne correspond a la quantité choisie");







    }

}
