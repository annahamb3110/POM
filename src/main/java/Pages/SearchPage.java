package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

      private By product = By.cssSelector("[data-key]");
      private HomePage homePage = new HomePage(driver);
      private By checkBox = By.xpath("//input[@checked='checked']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public int productCounts()
    {
        List<WebElement> productELements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product));


        int totalCount = productELements.size();
        System.out.println("Total size is : " + totalCount);
        return totalCount;
    }


    public boolean getcheckboxvalue()
    {
        WebElement webElement=driver.findElement(checkBox);
        return webElement.isSelected();
    }

}
