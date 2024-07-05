package Utils;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Logger;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Methods {


    public static WebDriver driver;
    public static WebDriverWait wait;

    String FilePath = "C:\\Users\\milicaj\\IdeaProjects\\TestingRyanair\\src\\test\\java\\Utils\\Data.properties";

    public static final Logger logger = Logger.getLogger("MyLogger");

    public void clickOnElement(By xpath) {
        try {
            wait.until(visibilityOf(driver.findElement(xpath))).click();
        } catch (Exception e) {
            wait.until(presenceOfElementLocated(xpath)).click();
        }
    }
    public void elementIsPresent(By xpath) {
        wait.until(visibilityOf(driver.findElement(xpath))).isDisplayed();
    }
    //firefox testing
    public WebDriver setup() {
        System.setProperty("webdriver.geckodriver", "\"C:\\Users\\milicaj\\Downloads\\geckodriver.exe\"");
        driver = new FirefoxDriver();
        driver.get("https://www.ryanair.com/gb/en");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        return driver;
    }
    public void scrollIntoViewAndClick(By xpath, String text) {
        logger.info("Scroll in to view and click on " + text);
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("arguments[0].click();",element);
        driver.switchTo().defaultContent();
    }
    public void closeTab(){
        logger.info("Close the tab window");
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        driver.close();
        driver.switchTo().window(tab.get(0));
    }
    public void driverSwitch(){
        logger.info("Driver switches pages");
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
    }
    public void checkUrlLink(){
        driver.getCurrentUrl().matches("https://help.ryanair.com/hc/en-gb/categories/12489466690833");
    }
    public void driverSwitchBack(){
        logger.info("Driver switches back");
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(0));
    }
    public void goBack(){
        logger.info("Go back to home page");
        driver.navigate().to("https://www.ryanair.com/gb/en");
    }
    public void scrollIntoViewAndClickIt(By xpath, String text) {
        logger.info("Scroll in to view and click on "+text);
        WebElement element = driver.findElement(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("arguments[0].click();",element);
    }
    public void scrollIntoViewAndClickItUnreachableElement(By xpath, String text) {
        logger.info("Scroll in to view and click on the " + text);
        WebElement element = driver.findElement(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }
    public void scrollDown() {
        logger.info("Scroll down");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).click().perform();
    }
    public String getFromProperties(String property) throws IOException {
        logger.info("Take from properties file connected assigned value");
        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream(FilePath);
        prop.load(ip);
        String item = prop.getProperty(property);
        ip.close();
        prop.clear();
        return item;
    }
    public void type(By textbox, String text) {
        Methods.logger.info("In to the text field write corresponding properties data");
        WebElement element = driver.findElement(textbox);
        element.isDisplayed();
        element.isEnabled();
        element.sendKeys(text);
        element.click();
    }
    public WebDriver setUp() {
        System.setProperty("webdriver.chromedriver", "\"C:\\Users\\milicaj\\Downloads\\chromedriver.exe\"");
        Methods.driver = new ChromeDriver();
        Methods.driver.get("https://www.ryanair.com/gb/en");
        Methods.driver.manage().window().maximize();
        wait = new WebDriverWait(Methods.driver, Duration.ofMillis(30000));
        return driver;
    }
    public void clearTextBox(By xpath){
        logger.info("Clear the text field");
        driver.findElement(xpath).click();
        driver.findElement(xpath).clear();
    }
}