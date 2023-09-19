package com.example.amazoncom.pageObjects;

import com.example.amazoncom.utils.HelperClass;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMainPage {

  @FindBy(id = "twotabsearchtextbox")
  public WebElement searchField;
  final static String URL_WEB_AMAZON = "https://www.amazon.es/gp/bestsellers/?ref_=nav_cs_bestsellers";

  @FindBy(id = "nav-search-submit-button")
  public WebElement searchButton;
  @FindBy(id = "nav-bb-logo")
  public WebElement logoAmazon;
  @FindBy(css = "a[class= \"nav-action-signin-button\"]")
  public WebElement loginButton;
  @FindBy(css = "h1[class=\"a-spacing-small\"]")
  public WebElement titleLogin;
  @FindBy(id = "nav-orders")
  public WebElement signUpButton;
  @FindBy(id = "nav-cart")
  public WebElement cartLink;
  @FindBy(css = "h2")
  public WebElement cartTitle;
  @FindBy(id = "nav-hamburguer-menu")
  public WebElement todoLink;
  @FindBy(id = "nav-global-location-popover-link")
  public WebElement locationLink;
  @FindBy(id = "GLUXZipUpdateInput")
  public WebElement postCodeInput;
  @FindBy(css = "input[  aria-labelledby=\"GLUXZipUpdate-announce\"]")
  public WebElement confirmPostCode;
  @FindBy(id = "glow-ingress-line2")
  public WebElement cityLocation;
  @FindBy(id = "sp-cc-rejectall-link")
  public WebElement acceptCookies;


  public AmazonMainPage() {
    PageFactory.initElements(HelperClass.getDriver(), this);
  }

  public void openHomePage() {
    HelperClass.openPage(URL_WEB_AMAZON);

    new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30)).until(
        ExpectedConditions.visibilityOf(searchField));


  }

  public String getSearchFieldValue() {
    return searchField.getAttribute("value");
  }
}
