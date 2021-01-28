package linearAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver","/Users/shavdaadhikari/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cerotid.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		if(driver.getTitle().equals("Cerotid")) {
			System.out.println("this page loads sucess");
		}
		else {
			System.out.println("the page didnot loada sucessful");
		}
		
		
		
		
		}
		
		
		
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
