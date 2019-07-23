package Testmeapp;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
	

	public class Stepdef {
		WebDriver driver;
		
		@Given("user opens the browser")
		public void Browser_opening() 
		{
		   System.out.println("Opening browser!!!");
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.05.05\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://10.232.237.143:443/TestMeApp/");
		 }
		@Then("click signup")
		public void click_signup() 
		{
			driver.findElement(By.linkText("SignUp")).click();
		}

		@Then("enter username")
		public void enter_username(String uname) 
		{
			driver.findElement(By.name("userName")).sendKeys(uname);
		}

		@Then("enter firstname")
		public void enter_firstname(String fname) 
		{
			driver.findElement(By.name("firstName")).sendKeys(fname);
		}

		@Then("enter lastname")
		public void enter_lastname(String lname) 
		{
			driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(lname);
		}

		@Then("enter password")
		public void enter_password(String pwd) 
		{
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
		}

		@Then("enter password for confirmation")
		public void enter_password_for_confirmation(String pwd) 
		{
			driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys(pwd);
		}

		@Then("choose the gender")
		public void choose_the_gender(int i) 
		{
			List <WebElement> allRadio=driver.findElements(By.name("gender"));
			  System.out.println(allRadio.size());
			  allRadio.get(i).click();
			  System.out.println(allRadio.get(i).getAttribute("selected")); 
		}

		@Then("enter e-mail address")
		public void enter_e_mail_address(String eaddress)
		{
			driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(eaddress);
		}

		@Then("enter mobile number")
		public void enter_mobile_number(String mnum) 
		{
			driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys(mnum);
		}

		@Then("enter date of birth")
		public void enter_date_of_birth(String dob) 
		{
			 driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(dob);
		}

		@Then("enter address")
		public void enter_address(String address) 
		{
			driver.findElement(By.xpath("//*[@id='address']")).sendKeys(address);
		}

		@Then("choose security question")
		public void choose_security_question(int i) 
		{
			 WebElement dropdown=driver.findElement(By.name("securityQuestion"));    
			 Select s=new Select(dropdown);                           
			 s.selectByIndex(i);
		}

		@Then("enter the answer for the security question")
		public void enter_the_answer_for_the_security_question(String ans) 
		{
			driver.findElement(By.xpath("//*[@id='answer']")).sendKeys(ans);
		}

		@Then("validate the regstration")
		public void validate_the_regstration() 
		{
			driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
			String msg=driver.getTitle();
			if(msg.equals("Login"))
			{
				System.out.println("Registration successful");
			}
			else
				System.out.println("Unsuccessful");
		}

		@When("entering username as string")
		public void entering_username_as_string() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		}

		@When("entering password as string")
		public void entering_password_as_string() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		}

		@When("user entering search product as \\{string}")
		public void user_entering_search_product_as() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		}



		@When("entering username as {string}")
		public void entering_username_as(String un) {
		 driver.findElement(By.name("userName")).sendKeys(un);
		}

		@When("entering password as {string}")
		public void entering_password_as(String psd) {
		  driver.findElement(By.name("password")).sendKeys(psd);
		}

		@Then("click Submit")
		public void click_Submit() {
			driver.findElement(By.name("login")).click();
		}

		@Then("Validate login success")
		public void validate_login_success() {
		   Assert.assertTrue(driver.getTitle().contains("Flight"));
		}

		@When("user entering search product as {string}")
		public void user_entering_search_product_as(String product) {
			System.out.println("user is searching - "+product);
		}

		@Then("application display search related items")
		public void application_display_search_related_items() {
		   System.out.println("application displays search related items");
		}

		@When("user click on Add to cart")
		public void user_click_on_Add_to_cart() {
		System.out.println("clicks on add to cart");
		}

		@When("The product should added to cart item")
		public void the_product_should_added_to_cart_item() {
		System.out.println("product added to cart");
		}

		@When("user performs payment through netbanking")
		public void user_performs_payment_through_netbanking() {
		    System.out.println("performs payment through netbanking");
		}

		@Then("close application")
		public void close_application() {
		 System.out.println("payment and closing....");
		}

		
		
		

	}

