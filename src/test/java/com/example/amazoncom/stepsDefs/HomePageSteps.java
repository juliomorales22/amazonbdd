package com.example.amazoncom.stepsDefs;
import com.example.amazoncom.pageObjects.AmazonMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
public class HomePageSteps {

  AmazonMainPage mainPage = new AmazonMainPage();

  @Given("Amazon page is opened")
  public void openAmazonHomePage() {
    mainPage.openHomePage();
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
    Assertions.assertThat(mainPage.getSearchFieldValue())
        .containsIgnoringCase(searchValue);
  }

  @When("Click on the sign up button")
  public void clickSignUpButton() {
    mainPage.signUpButton.click();
  }

  @Then("Check page contains {string}")
  public void checkTitleLogin(String searchValue) {
    Assertions.assertThat(mainPage.titleLogin.getText())
        .containsIgnoringCase(searchValue);
  }

  @When("Click on the location button")
  public void clickLocationtButton() {
    mainPage.locationLink.click();
  }

  @When("Type post code {string}")
  public void typeValueIntoThePostCodeInput(String searchValue) {
    mainPage.postCodeInput.sendKeys(searchValue);
  }


  @When("Click on the confirm Post Code button")
  public void clickLocationButton() {
    mainPage.confirmPostCode.click();
  }

  @Then("Check city is {string}")
  public void checkCartIsEmpty(String searchValue) {
    Assertions.assertThat(mainPage.cityLocation.getText())
        .containsIgnoringCase(searchValue);
  }

  @When("Click on the cartLink")
  public void clickCartLink() {
    mainPage.cartLink.click();
  }
  @Then("Check cart is empty")
  public void checkCartIsEmpty() {
    Assertions.assertThat(mainPage.cartTitle.getText())
        .containsIgnoringCase("Tu cesta de Amazon está vacía");
  }

}

