package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.SeleniumUtils;

public class HomePage {
    /**
     * Region Variables
     */
    private WebDriver driver;

    @FindBy(id = "cb1-edit")
    private WebElement inputSearch;

    /**
     * Region Constructor
     */
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Region Methods
     */

    /**
     * Write item to search to retrieve a new page listing matches
     * @param item text to send to input
     */
    public SearchPage searchItem (String item){
        SeleniumUtils.waitUntilIsVisible(inputSearch).sendKeys("remeras");
        inputSearch.sendKeys(Keys.ENTER);
        return new SearchPage(driver);
    }
}
