package StepDef1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefCase4 {
	WebDriver driver;
	@Given("user has registered in to TestMeApp")
	public void user_has_registered_in_to_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
 		driver.get("http://10.232.237.143:443/TestMeApp");
 		driver.findElement(By.xpath("//a[@href = 'login.htm']")).click();
 		driver.findElement(By.name("userName")).sendKeys("manoshine");
		driver.findElement(By.name("password")).sendKeys("manoshinee");
		driver.findElement(By.name("Login")).click();

	}

	@When("user search a particular product like headphones")
	public void user_search_a_particular_product_like_headphones() {
		WebElement search = driver.findElement(By.id("myInput"));
		   search.sendKeys("h");
		   search.sendKeys("e");
		   search.sendKeys("a");
		   search.sendKeys("d");
		   Actions act1 = new Actions(driver);
		   act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click().build().perform();
		   driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();

	
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Application doesn't display the cart icon")
	public void application_doesn_t_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
