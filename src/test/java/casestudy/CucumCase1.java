package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDef.DriverUtil;

public class CucumCase1 {
	WebDriver driver;
	@Given("user will be able to see the login page")
	public void user_will_be_able_to_see_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver=DriverUtil.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enters {string},{string},{string},{string},{string},{string},{string},\"<mobile number\">,{string},{string},\"<Security Question\">,{string}")
	public void user_enters_mobile_number_Security_Question(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By .name("Submit")).click();
	}

	@Then("user will get successful registration")
	public void user_will_get_successful_registration() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}


}

