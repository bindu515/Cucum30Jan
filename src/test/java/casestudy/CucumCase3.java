package casestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDef.DriverUtil;

public class CucumCase3 {
	WebDriver driver;
	@Given("user will be able to login")
	public void user_will_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver=DriverUtil.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys("Lalitha");
		driver.findElement(By .name("password")).sendKeys("password123");
		driver.findElement(By .xpath("//input[@name='Login']")).click();
		
	}
	

	@When("user searches for products in the search field")
	public void user_searches_for_products_in_the_search_field(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By .id("myInput")).sendKeys("head");
		driver.findElement(By .xpath("//input[@value='FIND DETAILS']")).click();
	}
	

	@Then("user verifies the product availability")
	public void user_verifies_the_product_availability() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}



}
	
	