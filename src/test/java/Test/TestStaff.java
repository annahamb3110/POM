package Test;

import Pages.HomePage;
import Pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestStaff {
    private HomePage homePage;
    private SearchPage page;
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void Setup() {
            System.setProperty("webdriver.chrome.driver",
            "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.get("https://staff.am/");
         homePage = new HomePage(driver);
         page=new SearchPage(driver);
    }
    @Test
    public void CheckboxTest()
    {
        homePage.searchJobCategory();
        System.out.println(page.getcheckboxvalue());


        Assert.assertTrue(page.getcheckboxvalue(),"Checkbox is not selected");

    }

}
