package com.example.amazoncom.stepsDefs;

import com.example.amazoncom.pageObjects.AmazonMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
public class HomePageSteps {

  AmazonMainPage mainPage = new AmazonMainPage();

  @Given("Amazon Home page is opened")
  public void openAmazonHomePage() {
    mainPage.openHomePage();
    //mainPage.logoAmazon.click(); // to avoid load the second type webpage from amazon.
    mainPage.acceptCookies.click();
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
    // Assertions.assertEquals(searchValue, mainPage.getSearchFieldValue());
    Assertions.assertThat(mainPage.getSearchFieldValue())
        .as("Failure message: search button doesn't work")
        .containsIgnoringCase(searchValue);
  }


  //form to login
  @When("Click on the sign up button")
  public void clickSignUpButton() {
    mainPage.signUpButton.click();
  }

  @Then("Check page contain {string}")
  public void checkTitleLogin(String searchValue) {
    Assertions.assertThat(mainPage.titleLogin.getText())
        .as("Failure message: Login doesn't appear")
        .containsIgnoringCase(searchValue);
  }
  //
// post code city

  @When("Click on the location button")
  public void clickLocationtLink() {
    mainPage.locationLink.click();
  }

  @When("Write post code {string}")
  public void typeValueIntoThePostCodeInput(String searchValue) {
    mainPage.postCodeInput.sendKeys(searchValue);
  }


  @When("Click on the confirm Post Code button")
  public void clickLocationLink() {
    mainPage.confirmPostCode.click();
  }

  @Then("Check ciudad location is {string}")
  public void checkCartIsEmpty(String searchValue) {
    // Tá vac
    Assertions.assertThat(mainPage.cityLocation.getText())
        .as("Failure message: search button doesn't work")
        .containsIgnoringCase(searchValue);
  }

  // cart is empty
  @When("Click on the cartLink")
  public void clickCartLink() {
    mainPage.cartLink.click();
  }
  @Then("Check cart is empty")
  public void checkCartIsEmpty() {
    // Tá vac
    Assertions.assertThat(mainPage.cartTitle.getText())
        .as("Failure message: search button doesn't work")
        .containsIgnoringCase("de Amazon est").containsIgnoringCase("vac");
  }

}
