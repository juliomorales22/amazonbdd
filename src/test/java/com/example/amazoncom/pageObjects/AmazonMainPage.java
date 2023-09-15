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

  @FindBy(id = "nav-search-submit-button")
  public WebElement searchButton;
  final static String URL_WEB_AMAZON = "https://www.amazon.es/";

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
