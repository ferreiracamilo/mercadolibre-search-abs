package resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DriverFactory{
    public static WebDriver driver;

    public void startDriver(String browserName){
        browserName = getParameter(browserName).toLowerCase();
        if(browserName.equals("chrome")){
            initializeChrome();
        }
        if(browserName.equals("firefox")){
            initializeMozilla();
        }
        if(browserName.equals("opera")){
            initializeOpera();
        }
        driver.manage().window().maximize();
        driver.get("https://www.mercadolibre.com.uy/");
    }

    public void initializeChrome(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver();
    }

    public void initializeOpera(){
        WebDriverManager.operadriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver();
    }

    public void initializeMozilla(){
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(new FirefoxProfile());
        options.addPreference("dom.webnotifications.enabled", false);

        driver = new FirefoxDriver(options);
    }

    public String getParameter(String name) {
        String value = System.getProperty(name);
        if (value == null)
            throw new RuntimeException(name + " is not a parameter!");

        if (value.isEmpty())
            throw new RuntimeException(name + " is empty!");

        return value;
    }
}
