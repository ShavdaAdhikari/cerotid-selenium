package GooglePages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//creating an object of webdriver
	public WebDriver driver;
	//constructor to create an object of the class 
	public HomePage(WebDriver driver) {
		this.driver=driver;

		//initialize the webElement of this class.
	
	PageFactory.initElements(driver, this);}
	
	@FindBy(xpath ="//input[@name='q']")
	WebElement searchField;
	//method that utilize the webelement from this page
	public void search(String search) {
		searchField.sendKeys(search);
		searchField.sendKeys(Keys.RETURN);
		
	}
	public boolean IsPageOpened() {
		return driver.getTitle().contains("Google");
	}
	
	
	

	
	
	
	
	

	}
