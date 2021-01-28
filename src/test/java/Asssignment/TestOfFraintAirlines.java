package Asssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class TestOfFraintAirlines {
  public static WebDriver driver;

    public static void main(String[] args) {
    	try {
        invoketheBrowser();
        fillTheForm();
        terminateTheBrowser();
        }catch(Exception e) {
        	e.getStackTrace();
        }
    	
   
    }



    public static void invoketheBrowser() {
            try {
            System.setProperty("webdriver.chrome.driver","/Users/shavdaadhikari/Downloads/chromedriver");
              driver=new ChromeDriver();
            driver.get("https://www.flyfrontier.com ");
            driver.manage().window().maximize();
            if (driver.getTitle().equals("Low Fares Done Right | Frontier Airlines")){
                System.out.println("successfully loaded the page.");}
                else{
                    System.out.println("the page is not loaded");
                }

            }
        catch(Exception e) {
            e.getStackTrace();}}


    public static void fillTheForm() {
        try{
            driver.manage().deleteAllCookies();

             WebElement element=driver.findElement(By.xpath("//input[@id='kendoDepartFrom_input']"));
             element.click();
           Thread.sleep(2000);
             WebElement fromDestination=driver.findElement(By.xpath("(//li[@data-offset-index='23']//div[@class='city'])[1]"));
            fromDestination.click();
            
            
            Thread.sleep(2000);
            WebElement element1=driver.findElement(By.xpath("//input[@id='kendoArrivalTo_input']"));
            element1.click();
            element1.sendKeys("LAX");
           Thread.sleep(2000);
           element1.sendKeys(Keys.RETURN);
           Thread.sleep(6000);
           
//            WebElement arrivalTo=driver.findElement(By.xpath("(//li[@data-offset-index='31']//div[@class='state'])[2]"));
//            arrivalTo.click();
//            Thread.sleep(2000);
            WebElement fromDate=driver.findElement(By.xpath("//img[@id='departureDateIcon']"));
            fromDate.click();
            
            Thread.sleep(2000);
            WebElement fromDatearrow=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
            fromDatearrow.click();
            Thread.sleep(2000);
            
//            fromDatearrow.click();
//            Thread.sleep(2000);
//            
//            fromDatearrow.click();
//            Thread.sleep(2000);
//            
//            fromDatearrow.click();
//            Thread.sleep(2000);
//           
//            fromDatearrow.click();





            WebElement exactDate=driver.findElement(By.xpath("//a[@id='7-15-2021']"));
            exactDate.click();

            WebElement fromreturnDatearrow=driver.findElement(By.xpath("//img[@id='returnDateIcon']]"));
            fromDatearrow.click();
            Thread.sleep(2000);

            WebElement exactDatereturn=driver.findElement(By.xpath("//a[@id='7-22-2021']"));
            exactDatereturn.click();
            WebElement passenger=driver.findElement(By.xpath("//input[@id='passengersInput']"));
            exactDatereturn.click();

            WebElement addpassenger=driver.findElement(By.xpath("//img[@class='add-adult']"));
            addpassenger.click();
            WebElement search=driver.findElement(By.xpath("(//img[@class='SearchSVG'])[1]"));
            exactDatereturn.click();

            WebElement roundTripFare=driver.findElement(By.xpath("//div[@class='ibe-roundtrip-header-text']"));
            if (roundTripFare.isDisplayed()){
                System.out.println("RoundTripFare is displayed");
            }else {
                System.out.println("Fare is not displayed");
            }

            WebElement dallasTOLax=driver.findElement(By.xpath("(//div[@class='ibe-flight-header-col1 w-col w-col-8 w-col-medium-6 w-col-small-6'])[1]"));
            if (dallasTOLax.isDisplayed()){
                System.out.println("Dallas to Lax is displayed");
            }else{
                System.out.println("Dallas to lax is not displayed");
            }
        }catch (Exception e){
            e.getStackTrace();
        } }


    public static void terminateTheBrowser() {
        try {Thread.sleep(10000);
            driver.close();
        }catch (Exception e){
            e.getStackTrace();
        }}}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


