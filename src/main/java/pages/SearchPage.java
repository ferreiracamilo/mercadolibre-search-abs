package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.SeleniumUtils;

import java.util.ArrayList;
import java.util.List;

public class SearchPage{
    /**
     * Region Variables
     */
    private WebDriver driver;

    private static final String xp_ItemCard_Price = ".//span[@class='price-tag-text-sr-only' and not(contains(text(),'Antes'))]"; //Add . to assure will go into child element, instead of going back to first element
    private static final String xp_ItemCard_URL = ".//a"; //Add . to assure will go into child element, instead of going back to first element

    private static final String xp_ItemCard_Name = ".//a /h2"; //Add . to assure will go into child element, instead of going back to first element

    @FindBy(xpath = "//a[@title='Siguiente']")
    private WebElement btnSiguiente;

    @FindBy(xpath = "//div[@class='ui-search-result__content']")
    private List<WebElement> itemCards;

    /**
     * Region Constructor
     */
    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        SeleniumUtils.waitUntilIsVisible(btnSiguiente); //Wait until page displays the pages buttons at the bottom
    }

    /**
     * Region Methods
     */

    public void clickNextPage (){
        SeleniumUtils.moveToButtonAndClick(btnSiguiente);
    }

    public List<String> getItemsInformation(){
        SeleniumUtils.scrollToBottom();
        List<String> itemsInfo = new ArrayList<>();
        for(WebElement itemCard : itemCards){
            String itemName = itemCard.findElement(By.xpath(xp_ItemCard_Name)).getText();
            String itemPrice = itemCard.findElement(By.xpath(xp_ItemCard_Price)).getText();
            String itemURL = itemCard.findElement(By.xpath(xp_ItemCard_URL)).getAttribute("href");
            String itemLine = String.format("Item: Nombre > %s - Precio > %s - Enlace > %s", itemName, itemPrice, itemURL);
            itemsInfo.add(itemLine);
        }
        return itemsInfo;
    }

}
