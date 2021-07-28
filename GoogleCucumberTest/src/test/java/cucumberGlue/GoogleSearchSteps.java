package cucumberGlue;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {

	WebDriver driver;

	@Given("the Chrome browser is open")
	public void the_chrome_browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@And("user is on the Google search page")
	public void user_is_on_the_google_search_page() {
		driver.get("https://www.google.com");
		Assert.assertEquals("Google",driver.getTitle());
	}

	@When("user enters a text {string} in the Search Box")
	public void user_enters_a_text_in_the_search_box(String string) {
		driver.findElement(By.name("q")).sendKeys(string);
	}

	@And("user clicks on the visible Google Search button")
	public void user_clicks_on_the_visible_google_search_button() {
		driver.findElement(By.name("q")).sendKeys("\t");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	}

	@And("user presses the Enter key")
	public void user_presses_the_enter_key() {
		driver.findElement(By.name("q")).sendKeys("\n");
	}

	@Then("user is taken to the search results page")
	public void user_is_taken_to_the_search_results_page() {
		System.out.println(driver.findElement(By.xpath("//div[@id='result-stats']")).getText());
	}

	@And("page title shows the search text as {string}")
	public void page_title_shows_the_search_text_as(String string) {
		Assert.assertEquals(string, driver.getTitle());
	}

	@And("browser is closed")
	public void browser_is_closed() {
		driver.quit();
	}
}
