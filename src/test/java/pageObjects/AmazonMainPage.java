package pageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMainPage {

  WebDriver driver;
  @FindBy(id = "twotabsearchtextbox")
  public WebElement searchField;

  @FindBy(id = "nav-search-submit-button")
  public WebElement searchButton;
  final static String URL_WEB_AMAZON = "https://www.amazon.es/";

  public AmazonMainPage(WebDriver driver) {
    this.driver = driver;
    this.driver = new ChromeDriver();
    PageFactory.initElements(driver, this);
  }

  public void openHomePage() {
    driver.get(URL_WEB_AMAZON);
    WebElement waiting = (new WebDriverWait(this.driver, Duration.ofSeconds(30)).until(
        ExpectedConditions.visibilityOf(searchField)));
  }

  public String getSearchFieldValue() {
    return searchField.getAttribute("value");
  }
}
