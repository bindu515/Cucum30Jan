package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtil {
 public static WebDriver getDriver(String browser) {
	 if(browser.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.09.22\\Desktop\\New folder\\selenium browsers\\chromedriver_win32\\chromedriver.exe");
	return new ChromeDriver();
	 }
	 else if(browser.equalsIgnoreCase("ie")) {
		 System.setProperty("webdriver.ie.driver","C:\\Users\\training_h2a.09.22\\Desktop\\New folder\\selenium browsers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
	 return new  InternetExplorerDriver();
	 }
	 else if(browser.equalsIgnoreCase("ff")) {
		 System.setProperty("webdriver.ff.driver","\"C:\\Users\\training_h2a.09.22\\Desktop\\New folder\\selenium browsers\\geckodriver-v0.26.0-win64\"");
		 return new  FirefoxDriver();
				
	 }
	 else
	 {
		 return null;
	 
	 }
	 
	 }
	
}
