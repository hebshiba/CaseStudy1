package StepDef1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefCase1 {
	WebDriver driver;
	@When("user opens chrome user and opens apllication")
	public void user_opens_chrome_user_and_opens_apllication() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		 		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@Then("user clicks sigup button")
	public void user_clicks_sigin_button() {
		driver.findElement(By.xpath("//a[@href = 'RegisterUser.htm']")).click();
	
	}

	@When("user enter uname as {string} in uname field")
	public void user_enter_uname_as_in_uname_field(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("user enter fname as {string} in fname field And lname as {string}")
	public void user_enter_fname_as_in_fname_field_And_lname_as(String string, String string2) {
		driver.findElement(By.name("firstName")).sendKeys(string);
		driver.findElement(By.name("lastName")).sendKeys(string2);
	}

	@When("user provide password as {string} And confirm password as {string}")
	public void user_provide_password_as_And_confirm_password_as(String string, String string2) {
		driver.findElement(By.name("password")).sendKeys(string);
		driver.findElement(By.name("confirmPassword")).sendKeys(string2);
	}

	@Then("user selects Female")
	public void user_selects_Female() {
		
		driver.findElement(By.xpath("//input[@value='Female']")).click();

	}

	@When("user give mail id as {string} in field")
	public void user_give_mail_id_as_in_field(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@When("user give mobile number as {string}")
	public void user_give_mobile_number_as(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@Then("user provide DOB as {string}")
	public void user_provide_DOB_as(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@When("user enters Address as {string}")
	public void user_enters_Address_as(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@Then("user choose question as which birth place")
	public void user_choose_question_as_which_birth_place() {
		Select birthplace = new Select(driver.findElement(By.name("securityQuestion")));
		 
		birthplace.selectByVisibleText("What is your Birth Place?");
		 
		

	}

	@When("user enters as {string}")
	public void user_enters_as(String string) {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

	@Then("user click register")
	public void user_click_register() {
		driver.findElement(By.name("Submit")).click();
	}

	@When("user verify the register")
	public void user_verify_the_register() {
		Assert.assertTrue(driver.getTitle().contains("Login"));
		 
		driver.close();
	}


}
