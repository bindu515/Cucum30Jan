package stepDef;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumDefine {
	WebDriver driver;
	@When("larry searches for products in the search field")
	public void larry_searches_for_products_in_the_search_field(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new io.cucumber.java.PendingException();
		List<String> pro_list=dataTable.asList();
		System.out.println(pro_list.size());
		for(String plist: pro_list) {
			driver.findElement(By .name("products")).sendKeys(plist);
			String str=driver.findElement(By .xpath("/html/body/div[1]/b")).getText();
			System.out.println(str);
			driver.findElement(By .name("products")).clear();
		}
	}

	@Then("Larry verifies the product availability")
	public void larry_verifies_the_product_availability() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


	
	
	 @Given("sales executive logged into the machine")
	public void sales_executive_logged_into_the_machine() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=DriverUtil.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("Sales Executive provides {string} and {string} as credentials")
	public void sales_Executive_provides_and_as_credentials(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys(string);
		driver.findElement(By .name("password")).sendKeys(string2);
		driver.findElement(By .name("Cancel")).click();
		driver.quit();
	}

	@Then("login Successful")
	public void login_Successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}



	@Given("user should be at the signup page")
	public void user_should_be_at_the_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver=DriverUtil.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("");
	}

	@When("user provides {string},{string} and {string}")
	public void user_provides_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
	}

	@Then("registration successful")
	public void registration_successful() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}



}
	
	