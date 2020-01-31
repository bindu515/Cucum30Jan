package casestudy;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDef.DriverUtil;

public class CucumCase4 {
	WebDriver driver;

@Given("Alex has registered in to TestMeApp")
public void alex_has_registered_in_to_TestMeApp() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver=DriverUtil.getDriver("chrome");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By .linkText("SignIn")).click();
	driver.findElement(By .name("userName")).sendKeys("Lalitha");
	driver.findElement(By .name("password")).sendKeys("password123");
	driver.findElement(By .name("Login")).click();
	
}

@When("Alex search a particular product like headphones")
public void alex_search_a_particular_product_like_headphones() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By .id("myInput")).sendKeys("head");
	driver.findElement(By .xpath("//input[@value='FIND DETAILS']")).click();
	
}

@When("try to proceed to payment without adding to the cart")
public void try_to_proceed_to_payment_without_adding_to_the_cart() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	Assert.assertNotSame("View Cart", driver.getTitle());
	
	
}

@Then("TestMe App doesn't display the cart icon")
public void testme_App_doesn_t_display_the_cart_icon() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	System.out.println("cart is empty...please add atleast one item");
	Assert.assertEquals("Search" ,driver.getTitle());
	System.out.println("user is in search page");
}



}
