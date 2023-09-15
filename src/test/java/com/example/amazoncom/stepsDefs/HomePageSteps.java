package com.example.amazoncom.stepsDefs;

import com.example.amazoncom.pageObjects.AmazonMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HomePageSteps {

  AmazonMainPage mainPage = new AmazonMainPage();

  @Given("Amazon Home page is opened")
  public void openAmazonHomePage() {
    System.out.println("openened");
    mainPage.openHomePage();
  }

  @When("Type {string} into the search field")
  public void typeValueIntoTheSearchField(String searchValue) {
    mainPage.searchField.sendKeys(searchValue);
  }

  @When("Click on the search button")
  public void clickSearchButton() {
    mainPage.searchButton.click();
  }

  @Then("Check search result contains {string}")
  public void checkSearchResultContainsValue(String searchValue) {
    Assertions.assertEquals(searchValue, mainPage.getSearchFieldValue());
  }
}
