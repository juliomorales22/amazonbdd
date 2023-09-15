package com.example.amazoncom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {

  public final static int TIMEOUT = 10;
  private static HelperClass helperClass;
  private static WebDriver driver;
  private static WebDriverWait wait;

  private HelperClass() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(chromeOptions);
    wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    driver.manage().window().maximize();
  }

  public static WebDriver getDriver() {
    return driver;

  }

  public static void setUpDriver() {
    if (helperClass == null) {
      helperClass = new HelperClass();
    }
  }

  public static void tearDown() {
    if (driver != null) {
      driver.close();
      driver.quit();
    }
    helperClass = null;
  }
}