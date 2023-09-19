package com.example.amazoncom.hooks;

import com.example.amazoncom.utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

  @Before
  public void setUp() {
    HelperClass.setUpDriver();
  }

  @After
  public void tearDown(Scenario scenario) {

    //validate if scenario has failed
    if (scenario.isFailed()) {
    /*  final byte[] screenshot = ((TakesScreenshot) mainPageObject.getScreenshotAs(
          OutputType.BYTES));
      scenario.attach(screenshot, "image/png", scenario.getName());*/
    }

    HelperClass.tearDown();
  }
}