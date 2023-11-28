package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

//* Enter “standard_user” username
sendTextToElement(By.xpath("//input[@id='user-name']"),"standard_user");
//* Enter “secret_sauce” password
sendTextToElement(By.id("password"),"secret_sauce");
//* Click on ‘LOGIN’ button
clickOnElement(By.xpath("//input[@id='login-button']"));
//* Verify the text “PRODUCTS”
verifyText("products","//span[@class='title']");

}
@Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

//*Enter“standard_user”username
sendTextToElement(By.xpath("//input[@id='user-name']"),"standard_user");
//* Enter “secret_sauce”password
sendTextToElement(By.id("password"),"secret_sauce");
//* Click on ‘LOGIN’button
clickOnElement(By.xpath("//input[@id='login-button']"));
//* Verify that six products are displayed on page
List<WebElement> elementList =driver.findElements(By.className("inventory_item"));
System.out.println("Total Products are: "+elementList.size());
//verifyElementsFromWebPage(By.className("inventory_item"),6);


}
@After
    public void tearDown(){
        closedBrowser();
}
}
