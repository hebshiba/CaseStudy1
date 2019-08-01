package StepDef1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefCase2 {
	WebDriver driver;
	@Given("opens testme application")
	public void opens_testme_application() {
	 System.setProperty("webdriver.chrome.driver","C:\\seleniumdrivers\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("http://10.232.237.143:443/TestMeApp/");
	 driver.findElement(By.xpath("//a[@href = 'login.htm']")).click();
	}
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	 driver.findElement(By.name("userName")).sendKeys(string);
	 driver.findElement(By.name("password")).sendKeys(string2);
	}
	@When("click on Login button")
	public void click_on_Login_button() {
	 driver.findElement(By.name("Login")).click();
	}
	@Then("verify it displays Home page")
	public void verify_it_displays_Home_page() {
	 Assert.assertTrue(driver.getTitle().contains("Home"));
	 driver.close();
	}
}
