package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ScreenPlay {

    protected static WebDriver driver;
    public static WebDriverWait wait;

    //Webdriver declaration
    static{
        System.setProperty("webdriver.chrome.driver", "C:/Users/ramon/Documents/chromedriver_win32/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,10);  
    }

    //Open the Navigator
    public ScreenPlay(WebDriver driver){
        ScreenPlay.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, 10);

    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    //Close the Navigator
    public static void closeBrowser(){
        driver.quit();
    }

    //Explicit Wait
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    //Click on a Locator
    public void clickElement(String locator){
        Find(locator).click();
    }

    //Write in a Locator
    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    //Select a Text from a dropdown list 
    public void selectFromDropdownByText(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));

        dropdown.selectByVisibleText(valueToSelect);
    }
}
