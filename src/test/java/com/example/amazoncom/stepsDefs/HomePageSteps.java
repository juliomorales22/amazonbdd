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
  }

  @When("Type {string} into the search field")
  public void typeValueIntoTheSearchField(String searchValue) {
    mainPage.searchField.sendKeys(searchValue);
  }

  @When("Click on the search button")
  public void clickSearchButton() {
    mainPage.searchButton.click();
  }

  @When("Click on the sign up button")
  public void clickSignUpButton() {
    mainPage.signUpButton.click();
  }

  @When("Click on the login button")
  public void clickLoginButton() {
    mainPage.loginButton.click();
  }

  @When("Click on the cartLink")
  public void clickCartLink() {
    mainPage.cartLink.click();
  }

  //
  @Then("Check search result contains {string}")
  public void checkSearchResultContainsValue(String searchValue) {
    // Assertions.assertEquals(searchValue, mainPage.getSearchFieldValue());
    Assertions.assertThat(mainPage.getSearchFieldValue())
        .as("Failure message: search button doesn't work")
        .containsIgnoringCase(searchValue);
  }

  @Then("Check page contain {string}")
  public void checkTitleLogin(String searchValue) {
    Assertions.assertThat(mainPage.titleLogin.getText())
        .as("Failure message: Login doesn't appear")
        .containsIgnoringCase(searchValue);
    //Assertions.assertEquals(searchValue, mainPage.titleLogin.getAttribute("innerHTML"));
  }

  @Then("Check cart is empty")
  public void checkCartIsEmpty() {
    // Tá vac
    Assertions.assertThat(mainPage.cartTitle.getText())
        .as("Failure message: search button doesn't work")
        .containsIgnoringCase("de Amazon est").containsIgnoringCase("vac");
  }
}
