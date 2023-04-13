package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.ClickElement;
import starter.search.ClickXpath;
import starter.search.LookForInformation;
import starter.search.DashboardPage;





public class SearchStepDefinitions {


    @Given("{actor} wants to access the Homepage")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theODNxtHomePage());
    }

    @When("{actor} clicks the element with ID {string}")
    public void whenIClickElementWithId(Actor actor, String elementId) {
                ClickElement.withId(elementId).performAs(actor);
    }

    @When("{actor} selects the option with ID {string} in the dropdown {string}")
    public void whenISelectOptionWithId(Actor actor, String elementId, String dropdownId) {
        actor.attemptsTo(
                ClickElement.withId(elementId),
                ClickXpath.withXpath("//option[contains(text(),\'" + dropdownId + "\')]")

        );
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }



    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String reviewKey) {
        actor.attemptsTo(
                Ensure.that(DashboardPage.RK1001).containsElements("//div[contains(text(),\'" + reviewKey + "\')]")
        );
    }

    @Then("{actor} should see the option {string} selected in the dropdown with ID {string}")
    public void thenOptionShouldBeSelected(Actor actor, String expectedOption, String option) {
        actor.attemptsTo(
                Ensure.that(DashboardPage.Y2023).containsElements("//option[contains(text(),\'" + option + "\')]")
        );
    }
}
