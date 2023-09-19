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
    HelperClass.tearDown();
  }
}