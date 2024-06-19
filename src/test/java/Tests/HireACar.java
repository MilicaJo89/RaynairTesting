package Tests;

import Pages.CarHirePage;
import Pages.HomePage;
import org.testng.annotations.Test;

import java.io.IOException;

public class HireACar {

    @Test
    public void hireACarTest() throws InterruptedException, IOException {
        HomePage homePage = new HomePage();
        CarHirePage carHirePage = new CarHirePage();



        homePage.siteLoading();
        homePage.clickHireCarButton();
        Thread.sleep(4000);
        carHirePage.inputInToINeedACarTextFieldDublin();

    }

}
