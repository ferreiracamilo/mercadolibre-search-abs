package search;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import resources.DriverFactory;
import resources.Utilities;

import java.util.ArrayList;
import java.util.List;

public class SearchItemsValidations extends DriverFactory {

    @BeforeMethod
    public void openBrowserAndHitMainpage(){
        startDriver("browser");
    }

    @Test
    public void searchRemeras(){
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = homePage.searchItem("camisetas");
        List<String> itemsPage1 = searchPage.getItemsInformation();
        searchPage.clickNextPage();
        List<String> itemsPage2 = searchPage.getItemsInformation();
        searchPage.clickNextPage();
        List<String> itemsPage3 = searchPage.getItemsInformation();

        //Mix the string list obtained previously
        List<String> itemsAllPages = new ArrayList<>();
        itemsAllPages.addAll(itemsPage1);
        itemsAllPages.addAll(itemsPage2);
        itemsAllPages.addAll(itemsPage3);
        Utilities.writeTextFile(itemsAllPages);
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
