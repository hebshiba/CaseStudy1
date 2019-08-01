package StepDef1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefCase3 {
	WebDriver driver;
	@When("user opens testmeapp in browser")
	public void user_opens_testmeapp_in_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		 		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@Then("user click sigin button")
	public void user_click_sigin_button() {
		driver.findElement(By.xpath("//a[@href = 'login.htm']")).click();
	}

	@When("user provide uname as {string} and password as {string}")
	public void user_provide_uname_as_and_password_as(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}

	@Then("user click Login button")
	public void user_click_Login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@When("user searches for a particular product like headphones")
	public void user_search_product_by_giving_four_word_as_And_click_products() {
		//driver.findElement(By.id("myInput")).sendKeys(string);
		//driver.findElement(By.xpath("//input[@value='Headphone']")).click();
		WebElement search = driver.findElement(By.id("myInput"));
		   search.sendKeys("h");
		   search.sendKeys("e");
		   search.sendKeys("a");
		   search.sendKeys("d");
		   Actions act1 = new Actions(driver);
		   act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click().build().perform();
	}
	@Then("user click find details button")
	public void user_click_find_details_button() {
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}
	@When("user proceed to payment by addding product to the cart and clicks the Add To Cart button")
	public void user_proceed_to_payment_by_addding_product_to_the_cart_and_clicks_the_Add_To_Cart_button() {
	driver.findElement(By.linkText("Add to cart")).click();
	driver.findElement(By.partialLinkText("Cart")).click();
	}
}
