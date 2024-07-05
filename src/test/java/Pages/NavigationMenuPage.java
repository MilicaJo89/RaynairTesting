package Pages;

import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationMenuPage {

    public By logoForRyanAir = By.xpath("//div[@class='common-header__logo']");
    public By clickHelp = By.xpath("//span[@class='ng-star-inserted' and contains(.,'Help ')]");
    public By myBooking = By.xpath("//button[@class='ry-button--anchor-white ry-button--anchor']");
    public By signUp = By.xpath("//button[@class='ry-button--anchor-white ry-button--anchor' and contains(.,' Sign up')]");
    public By xMarksTheSpot = By.xpath("//button//icon[@iconid='glyphs/close-takeover']");
    public By logIn = By.xpath("//button[@class='ry-button--anchor-white ry-button--anchor' and contains(.,' Log in')]");
    public By query = By.xpath("//input[@id='query']");
    public By emailElement = By.xpath("//div[@class='titles']");
    public By signInElement = By.xpath("//input[@class='body-l-lg body-l-sm date-placeholder invisible-background']");


    WebDriver driver;
    Methods methods = new Methods();

    public NavigationMenuPage navigationMenuPage(WebDriver driver) {
        this.driver=driver;
        return this;
    }
    public NavigationMenuPage clickOnLogoForRyanAirInTheUpperLeftCorner() {
        Methods.logger.info("Click on the Ryanair logo");
        methods.clickOnElement(logoForRyanAir);
        return this;
    }

    public void clickHelpButton() throws InterruptedException {
        Methods.logger.info("Click Help");
        methods.clickOnElement(clickHelp);
        Thread.sleep(3000);
        methods.driverSwitch();
        Methods.logger.info("Help page element is present");
        methods.elementIsPresent(query);
        methods.driverSwitchBack();
        methods.closeTab();
    }

    public void clickOnMyBooking() throws InterruptedException {
        Methods.logger.info("Click on the myBooking element");
        methods.clickOnElement(myBooking);
        Thread.sleep(5000);
        Methods.logger.info("Email element is present");
        methods.elementIsPresent(emailElement);
        methods.goBack();
    }

    public void clickOnSignUpButton() throws InterruptedException {
        Methods.logger.info("Click sign up element");
        methods.clickOnElement(signUp);
        Methods.logger.info("Element is present");
        methods.elementIsPresent(signInElement);
        Thread.sleep(3000);
        Methods.logger.info("Click X to close the pop up window");
        methods.clickOnElement(xMarksTheSpot);
    }

    public void clickOnLoginButton() throws InterruptedException {
        Methods.logger.info("Click Login button");
        methods.clickOnElement(logIn);
        Methods.logger.info("Login element is present");
        methods.elementIsPresent(signInElement);
        Thread.sleep(3000);
        Methods.logger.info("Click X to close the pop up window");
        methods.clickOnElement(xMarksTheSpot);
    }


}



