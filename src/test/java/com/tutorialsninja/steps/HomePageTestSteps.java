package com.tutorialsninja.steps;

import com.tutorialsninja.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {    }

    @And("^I pass selectMenu method name \"([^\"]*)\"$")
    public void iPassSelectMenuMethodName(String menu)  {
        new Homepage().selectMenu(menu);
    }
    @When("^I mouse hover and click on Desktops tab$")
    public void iMouseHoverAndClickOnDesktopsTab() {
        new Homepage().mouseHoverOnDesktopLinkAndClick();
    }

    @Then("^I should be able to verify Desktops text$")
    public void iShouldBeAbleToVerifyDesktopsText() {
       Assert.assertEquals(new Homepage().getDesktopsText(), "Desktops", "Not navigate to Desktop page");
    }

    @When("^I mouse hover and click on Laptops & Notebooks tab$")
    public void iMouseHoverAndClickOnLaptopsNotebooksTab() {
        new Homepage().mouseHoverOnLaptopAndNotebooksLinkAndClick();
    }

    @Then("^I should be able to verify Laptops & Notebooks text$")
    public void iShouldBeAbleToVerifyLaptopsNotebooksText() {
        Assert.assertEquals(new Homepage().getLaptopsAndNotebooksText(),"Laptops & Notebooks" , "Not navigate to Laptops & Notebooks page");
    }

    @When("^I mouse hover and click on Components tab$")
    public void iMouseHoverAndClickOnComponentsTab() {
        new Homepage().mouseHoverOnComponentsLinkAndClick();
    }

    @Then("^I should be able to verify Components text$")
    public void iShouldBeAbleToVerifyComponentsText() {
        Assert.assertEquals(new Homepage().getComponentsText(),"Components" , "Not navigate to components page");
    }

}
