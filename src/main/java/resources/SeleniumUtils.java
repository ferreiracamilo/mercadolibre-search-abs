package resources;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils extends DriverFactory{

    private static JavascriptExecutor js = (JavascriptExecutor) driver;
    private static WebDriverWait wait = new WebDriverWait(driver, 8);
    
    public static WebElement waitUntilIsVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void scrollToBottom(){
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public static void moveToButtonAndClick(WebElement element){
        js.executeScript("arguments[0].scrollIntoView();", element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }


}
