package cucumberGlue;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	@Given("the Chrome browser is open")
	public void the_chrome_browser_is_open() {
	    System.out.println("Inside - Given");
	}

	@And("user is on the Google search page")
	public void user_is_on_the_google_search_page() {
	    System.out.println("Inside - Given-AND");
	}

	@When("user enters a text in the Search Box")
	public void user_enters_a_text_in_the_search_box() {
	    System.out.println("Inside - When");
	}

	@And("user clicks on the visible Google Search button")
	public void user_clicks_on_the_visible_google_search_button() {
	    System.out.println("Inside - Given-AND");
	}

	@Then("user is taken to the search results page")
	public void user_is_taken_to_the_search_results_page() {
	    System.out.println("Inside - Then");
	}

	@And("user presses the Enter key")
	public void user_presses_the_enter_key() {
	    System.out.println("Inside - Given-AND");
	}
}
