package com.example.amazoncom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AmazonTest {

  public WebDriver driver;
  AmazonMainPage mainPage;

  @BeforeAll
  public void setupBrowser() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("incognito");
    driver = new ChromeDriver(chromeOptions);
    mainPage = new AmazonMainPage(driver);
    mainPage.openHomePage();
  }

  @AfterAll
  public void teardown() {
    driver.quit();
  }

  @Test
  public void searchProductTest() {
    // 1 assertion
    mainPage.searchField.sendKeys("Selenium");
    mainPage.searchButton.click();
    Assertions.assertEquals("Selenium", mainPage.getSearchFieldValue());
  }
}
