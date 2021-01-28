package Asssignment;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Assignment.ObjectandMethodOFFrainterAir;


import java.util.List;

public class TestMethodandObjectFrainterAir {

public static WebDriver driver;

    public static void main(String[] args) {
        invoketheBrowser();
        fillTheForm();
        terminateTheBrowser();
    }



    public static void terminateTheBrowser() {
		try{
			Thread.sleep(20000);
			driver.close();
		
    }
    catch(Exception e) {
        e.getStackTrace();}}

		
	



	public static void invoketheBrowser() {
            try {
            System.setProperty("webdriver.chrome.driver","/Users/shavdaadhikari/Downloads/chromedriver");
              driver=new ChromeDriver();
              driver.manage().deleteAllCookies();
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
           
        	ObjectandMethodOFFrainterAir dotobject=new ObjectandMethodOFFrainterAir(driver);
        	dotobject.selectOnDepartFrom();
        	Thread.sleep(2000);
        	
        	dotobject.selectDepartCity();
        	
        	Thread.sleep(2000);
        	
        //	dotobject.selectDepartCity(24);
        	
        	Thread.sleep(2000);
        	
        	dotobject.selectArrival();
        	Thread.sleep(2000);
        	//dotobject.selectArrivalCity("California (LAX)");
        	dotobject.selectArrivalCity(31);
        	
        	
        	
        	
        }
        catch(Exception e) {
            e.getStackTrace();}}}

    		

            