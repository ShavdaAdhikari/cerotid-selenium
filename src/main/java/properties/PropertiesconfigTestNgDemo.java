package properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertiesconfigTestNgDemo {
	public WebDriver driver;
	
	//store value of browser
	public static String BrowserName=null;
	
	
	
	@BeforeTest
	public void setUpTest() {
		//read config File and invoke browser based on the configuration
		
		
		PropertiesConfigaration.getProperties();
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");

		driver=new ChromeDriver();
		
		
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
			
		System.setProperty("webdriver.gecko.driver", "./libs/geckodriver");
		
		driver=new FirefoxDriver();
		}
		else {System.out.println("Invalid Browser Name");}
		}
	
	public void navigateTOHomePage() {
		String title=driver.getTitle();
		driver.get("https://www.google.com/");
		if(title.contains("Google")) {
			System.out.println(title+ " .....was lanuch");
		}
		else {
			System.out.println("failed");
		}
	
	}
	
	
	@Test(priority=0)
	public void googleTest1() {
		System.out.println("google test 1 is started");
	}
	
	@Test(priority=1)
	public void googleTest2() {
		System.out.println("google test 2 is started");
	}
	
	@AfterTest
	public void after_Test1() {
		System.out.println("terminating the browser");
		//driver.close();

	}
	
	
	
	
	
	
	
	

}
