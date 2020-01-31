package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDef.DriverUtil;

public class Cucumcase2 {
	WebDriver driver;

@When("user provides {string} and {string} as credentials")
public void user_provides_and_as_credentials(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
   //throw new io.cucumber.java.PendingException();
	driver=DriverUtil.getDriver("chrome");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By .linkText("SignIn")).click();
	driver.findElement(By .name("userName")).sendKeys(string);
	driver.findElement(By .name("password")).sendKeys(string2);
	driver.findElement(By .name("Cancel")).click();
	driver.quit();
}

@Then("Login is successful")
public void login_is_successful() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
}
