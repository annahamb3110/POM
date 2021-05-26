package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By Category = By.id("jobsfilter-category");
    private By Job = By.xpath("//*[contains(text(), 'Finance Management')]");
    private By searchButton = By.xpath("//*[@data-url='/en/site/search']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void searchJobCategory() {

        WebElement jobCategoryElement = driver.findElement(Category);
        WebElement jobElement = driver.findElement(Job);
        WebElement SearchElement = driver.findElement(searchButton);
        SearchElement.click();
    }
}


