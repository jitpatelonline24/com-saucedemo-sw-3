package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BaseTest {
    /**
     * This method will click on any element whatever locator we pass
     */
    public void clickOnElement(By by)                                                       //To avoid code duplicacy , helps for code reusability
    {
        driver.findElement(by).click();                                                   //Find, locate , action altogether in single line
    }

    /**
     * This method will send text to element
     */

    public void sendTextToElement(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by)                                   //one argument only
    {
        return  driver.findElement(by).getText();
    }
    public List<WebElement> verifyElementsFromWebPage(By by,int size){
        return driver.findElements(by);

    }
    public void verifyText(String expectedText, String actualText) {}
    //************************* Alert Methods *****************************************************

    /**
     * This method will switch to alert
     */
    public void switchToAlert()
    {
        driver.switchTo().alert();
    }
    /**
     * This method will accept alert
     */
    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
    /**
     * This method will dismiss alert
     */
    public void dismissAlert()
    {
        driver.switchTo().alert().dismiss();
    }
    /**
     * This method will get text from alert
     */
    public String getTextFromAlert()
    {
        return driver.switchTo().alert().getText();
    }

    //*************************** Select Class Methods ***************************************//

    /**
     * This method will select by value from drop down
     */
    public void selectByValueFromDropDown(By by, String value)
    {
        WebElement dropDown = driver.findElement(by);
        Select s1 = new Select(dropDown );
        s1.selectByValue(value);
    }
    /**
     * This method will select by Visible text  from drop down
     */
    public void selectByVisibleTextFromDropDown(By by, String text)
    {
        WebElement dropDown = driver.findElement(by);
        Select s1 = new Select(dropDown );
        s1.selectByVisibleText(text);
    }
    /**
     * This method will select by index from drop down
     *
     */
    public void selectByIndexFromDropDown(By by, int index)
    {
        WebElement dropDown = driver.findElement(by);
        Select s1 = new Select(dropDown );
        s1.selectByIndex(index);
    }

    //*************************** Action Methods ***************************************//

    /**
     * This method will use to hover mouse on element
     */
    public void mouseHoverToElement(By by)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }


}
