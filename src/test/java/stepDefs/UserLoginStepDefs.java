package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDefs {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	    
	}
//	@When("User enters Credentials")
//	public void user_enters_credentials() {
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();		
//	    }

	//@When("User enters {string} and {string}")
	//public void user_enters_credentials(String strUser, String strPwd) {
//		driver.get("http://the-internet.herokuapp.com/login");
	//	driver.findElement(By.id("username")).sendKeys(strUser);
		//driver.findElement(By.name("password")).sendKeys(strPwd);
	//	driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();		
	  //  }
	
	//using data table as list
//	@When("User enters Credentials")
//	public void user_enters_credentials(DataTable userCred) {
//		driver.get("http://the-internet.herokuapp.com/login");
//		//user1- id, pwd
//		//user - id, pwd
//		List<List<String>> data = userCred.asLists();
//		data.get(0).get(0);
//		String strUser = data.get(0).get(0);
//		String strPwd = data.get(0).get(1);
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.name("password")).sendKeys(strPwd);
//		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();		
//	    }
	
	//using data table as list of maps
	@When("User enters Credentials")
	public void user_enters_credentials(DataTable userCred) {
		driver.get("http://the-internet.herokuapp.com/login");
		//user1- id, pwd
		//user - id, pwd
		List<Map<String,String>> data = userCred.asMaps();
		
		String strUser = data.get(0).get("username");
		String strPwd = data.get(0).get("password");
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();		
	    }

	@Then("should display success Msg")
	public void should_display_success_msg() {
	    boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed()	;
	    Assert.assertTrue(isDisp);
	}
}
