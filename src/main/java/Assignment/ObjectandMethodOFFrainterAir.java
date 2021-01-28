package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ObjectandMethodOFFrainterAir {
	
	

	    //creating a empty instance of webdriver
	     WebDriver driver;
	    //locating elements using by object
	    By selectDepartFrom=By.xpath("//input[@id='kendoDepartFrom_input']");
	    
	    
	    By fromDestination =By.xpath("(//li[@data-offset-index='23']//div[@class='city'])[1]");
	    
	    
	    
	    By selectArrivalTo=By.xpath("//input[@id='kendoArrivalTo_input']");
	    
	    
	    By arrivalTo=By.xpath(" (//li[@data-offset-index='31']//div[@class='state'])[2]");
	    
	    
	  
       
           

             ////img[@id='departureDateIcon']
//                //span[@class='ui-icon ui-icon-circle-triangle-e']
//              //a[@id='7-15-2021']
//              //img[@id='returnDateIcon']
//a[@id='7-22-2021']
//             //input[@id='passengersInput']
//                  //img[@class='add-adult']
////img[@class='SearchSVG'])[1]
//      //div[@class='ibe-roundtrip-header-text']
////div[@class='ibe-flight-header-col1 w-col w-col-8 w-col-medium-6 w-col-small-6'])[1]
                       
// By selectFlightFrom=By.xpath("//input[@name='kendoDepartFrom_input']");*/

//public void selectTheFromDestination(int index) {
//   WebElement element = driver.findElement(chooseTravellerFrom);
//Select chooseFromDestination = new Select(element);
//   chooseFromDestination.selectByIndex(index);
//}


	    public ObjectandMethodOFFrainterAir(WebDriver driver){

	        this.driver=driver;
	    }
//	    //creating a method that   intract with elements
    public void selectOnDepartFrom(){
        WebElement element=driver.findElement(selectDepartFrom);
        element.click();
       
	    }
//	    public void DeparturestateName(String DaptName) {
//	        List<WebElement> stateList = driver.findElements(fromDestination);
//
//	        for (int i = 0; i < stateList.size(); i++)
//	            if (stateList.get(i).getText().equals(DaptName)) {
//	                stateList.get(i).click();
//	                break;
//	            }}
	    
	    public void selectDepartCity(){
        WebElement element=driver.findElement(fromDestination);
	       // Select chooseTheCity =new Select(element);
	       // chooseTheCity.deselectByVisibleText(string);
        element.click();
	        }
    
	    
	    
	    
//	    public void selectOnCourse(int index){
//	        WebElement element=driver.findElement(selectCourse);   // By selectCourse=By.xpath("//select[@id='classType']");
//	        Select chooseTheCourse =new Select(element);
//	        chooseTheCourse.selectByIndex(index);
//	    }
//	    
	    
	    
	    
	    public void selectArrival(){
	        WebElement element=driver.findElement(selectArrivalTo);
	        element.click();
	       
	    }
	    
	    
	    public void selectArrivalCity(int index){
	        WebElement element=driver.findElement(arrivalTo);
		        Select chooseTheCity =new Select(element);
		        chooseTheCity.selectByIndex(index);
		        }
	    
	    
	    
//	    public void arrivalstateName(String arrivalstName) {
//	        List<WebElement> stateList = driver.findElements(arrivalTo);
//
//	        for (int i = 0; i < stateList.size(); i++)
//	            if (stateList.get(i).getText().equals(arrivalstName)) {
//	                stateList.get(i).click();
//	                break;
	            
	    }
	    
	    
	    
//	    public void enterfulName(String name){
//
//	        driver.findElement(fulName).sendKeys(name);
//	    }
//	    public void enterAddress(String theAddress){
//
//	        driver.findElement(address).sendKeys(theAddress);
//	    }
//	    public void theCityName(String city){
//
//	        driver.findElement(cityName).sendKeys(city);
//	    }
////	    public void selectTheState(int index){
////	        WebElement element=driver.findElement(selectState);
////	        Select choosetheState =new Select(element);
////	        choosetheState.selectByIndex(index);
////	    }
//
//	  public void stateName(String stName) {
//	        List<WebElement> stateList = driver.findElements(stateNameis);
//
//	        for (int i = 0; i < stateList.size(); i++)
//	            if (stateList.get(i).getText().equals(stName)) {
//	                stateList.get(i).click();
//	                break;
//	            }
//	    }
//
//
//	  public void theZipCode(){
//
//	        driver.findElement(zipCode).sendKeys();
//
//
//
//
//	   }
//
//	    public void theEmail(String oneemail){
//	        driver.findElement(email).sendKeys(oneemail);
//	    }
//	public void thePhone(String givePhno){
//	      driver.findElement(phone).sendKeys(givePhno);
//	  }
//	    public void theVisaStatus(int index){
//	        WebElement element=driver.findElement(visaStatus);
//	        Select chooseThestatus =new Select(element);
//	        chooseThestatus.selectByIndex(index);
//	    }
//	    public void hearingAbout(int index){
//	        WebElement element=driver.findElement(hearingAbout);
//	        Select choseeee =new Select(element);
//	        choseeee.selectByIndex(index);
//	    }
//
//
//	   public void relocateRadioButton(String Response){
//	        String respose="yes";
//	        if (Response.equals(respose) ){
//	            driver.findElement(radioButton2).click();}
//	       else{
//	            driver.findElement(radioButton).click(); }
//	    }
//
//
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
	
	


