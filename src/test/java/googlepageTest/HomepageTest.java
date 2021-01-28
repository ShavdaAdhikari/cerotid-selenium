package googlepageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import GooglePages.HomePage;
import linearAutomation.ScreenShot;
import properties.PropertiesConfigaration;



public class HomepageTest {
	
public	WebDriver driver;

public static String browserName=null;
	
	//ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReport.html");  //file
	
	
	ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReport.html");
	
	@BeforeTest                     //typeit and hit contl space
	public void BeforeTest() {
		
		
		
PropertiessFile.getProperties();//PropertiesConfigaration.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");

		driver=new ChromeDriver();
		
		
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
		System.setProperty("webdriver.gecko.driver", "./libs/geckodriver");
		
		driver=new FirefoxDriver();
		}
		else {System.out.println("Invalid Browser Name");}
		}
		
		
//	            System.setProperty("webdriver.chrome.driver","./libs/chromedriver");
//	              driver=new ChromeDriver();
//              driver.manage().deleteAllCookies();
//           
	//}
	public void navigateToGoogleHomePage() {
		try {
		HomePage homePage=new HomePage(driver);	
		ScreenShot screenShot= new ScreenShot();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(homePage.IsPageOpened());
		//take snapshot
		screenShot.takeSnapShot(driver,"Google Homepage");
			
			
			
			
			
			
		}
		catch(Exception e) {
			e.getLocalizedMessage();
		}
	}
		
		
	
	@Test
	public void GoogleSearch() {
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1=extent.createTest("Google");
		
		test1.info("Executing googleTest");
		
		
		
		navigateToGoogleHomePage();
		
		test1.pass("successfully navigate to google page");
		
		
		
		try {
			HomePage homePage=new HomePage(driver);	
			ScreenShot screenShot= new ScreenShot();
			homePage.search("what is testNg");
			screenShot.takeSnapShot(driver, "what is TestNg result");
		}catch(Exception e) {
			e.getLocalizedMessage();
			e.getStackTrace();
		}
	extent.flush();	
	}
	
	
	@AfterTest
	public void AfterTest() {
		driver.close();
		driver.quit();
	}
}
	
////	
////	
////	
////	
////	
////	
//	
	
	
//	import org.openqa.selenium.WebDriver;
//	mport org.openqa.selenium.chrome.ChromeDriver;
//
//
//	import com.progressiveInsurance.AutohomePage;
//	import com.progressiveInsurance.HomePage;
//	import com.progressiveInsurance.MoreAboutOwnersInformation;
//	import com.progressiveInsurance.SnapShot;
//	import com.progressiveInsurance.StartQuotePage;
//	import com.progressiveInsurance.TellUsAboutVehicle;
//	import com.progressiveInsurance.TellUsaboutPreviousInsurance;
//
//	public class HomepageTest {
//		
//		public static WebDriver driver;
//
////		public static void main(String[] args) {
////			try { invokeBrowser();
////			 titleCheck();
////			 verifyHomePage();
////			 
////			 
////			 onlyAutoHomepage();
////			 Thread.sleep(5000);
////			 personalInformationForstartQuote();
////			 
////			 Thread.sleep(5000);
////			 vehiclesInformation();
////			 Thread.sleep(3000);
////			 moreInformationAboutOwner();
////			 Thread.sleep(2000);
////			 previousInsuranceInformation();
////			 Thread.sleep(2000);
////			 Nothanksauto();
////			//terminateBrowser();
////			}catch(Exception e) {
////				e.getLocalizedMessage();
////				e.getStackTrace();
////			}
////		}
//	   
//		public static void invokeBrowser() {
//	    	 System.setProperty("webdriver.chrome.driver","/Users/shavdaadhikari/Downloads/chromedriver");
//	         driver=new ChromeDriver();}
//	    
//	   
//	    public static void titleCheck() {
//	    	driver.get("https://www.progressive.com");
//	        driver.manage().window().maximize();
//	        driver.manage().deleteAllCookies();
//	        
//	        String title="Quote Auto Insurance, Home-Auto Bundles, & More | Progressive";
//	     if (driver.getTitle().equals(title)) {
//	    	 System.out.println("Successfully loaded Progressive Page");
//	     }else {
//	    	 System.out.println("Unsucessful to load page");
//	     }
//	     }
//		
//
//		public static void verifyHomePage() {
//			
//			HomePage home=new HomePage(driver);
//			
//			home.clickAutopicture();
//			}
//		
//		
//			public static void onlyAutoHomepage() {
//			try{AutohomePage auto=new AutohomePage(driver);
//			auto.enterZipCode("40515");
////			Thread.sleep(1000);
////			auto.bundleAddHome();
////			Thread.sleep(1000);
////			auto.bundleAddCondo();
////			Thread.sleep(1000);
////			auto.bundleAddRenter();
////			//auto.learnMoreOr();
//			
//			Thread.sleep(1000);
//			auto.getAQuote();
//			}catch(Exception e) {
//				e.getStackTrace();
//			}
//			                                                          //auto.enterZipCode();
//		}	
//		
//		
//		
//		public static void personalInformationForstartQuote() {
//			try {
//				Thread.sleep(2000);
//			
//			StartQuotePage letStart=new StartQuotePage(driver);
//			letStart.enterFirstName("Hari");
//			letStart.enterMiddleInitial();
//			letStart.enterLastName("Adhikari");
//			//letStart.chooseSuffix("SR");
//			//letStart.chooseSuffix(2);
//			letStart.DateOfBirth("11","12","1991");
//			letStart.streeeeeeeeet();
//			
//			//letStart.enterStreetName("513LucilleDr");
//			//letStart.choosestreet("128 covelake");
//			//letStart.Apteeeeeeeeet();
////			letStart.cityofMailing();
////			letStart.ZipcodeNo();
//			//letStart.city();
//			//letStart.zip();
//			//Thread.sleep(2000);
//			//letStart.P_O_Boxno();
//			Thread.sleep(2000);
//			letStart.OkStartQuoteButton();
//		
//			}catch(Exception e) {
//				e.getStackTrace();
//			}
//		}
//		
//		
//		public static void vehiclesInformation() throws InterruptedException {
//			
//			TellUsAboutVehicle about = new TellUsAboutVehicle(driver);
//			
//			about.selectYearOfVehicle("2017");
//			Thread.sleep(1000);
//			about.madeByVehicle("Hyundai");
//			Thread.sleep(1000);
//			about.modelofVehicle("Tucson");
//			Thread.sleep(1000);
//			about.orChooseByVin();
//			Thread.sleep(2000);
//			about.enterBodyType(1);
//			Thread.sleep(2000);
//			about.purposeOFUse(1);
//			//Thread.sleep(1000);
//			//about.rideSharing();
//			Thread.sleep(1000);
//			about.primaryZip();
//			Thread.sleep(1000);
//			about.selectLeaseOrOwn(2);
//			Thread.sleep(1000);
//			about.lengthofOwnership(3);
//			//Thread.sleep(2000);
//			//about.eQuipedAntiThef();
//			Thread.sleep(1000);
//			about.primaryGarageAddress();
//			Thread.sleep(1000);
//			about.emergencyBrakeAssistSystem();
//			Thread.sleep(1000);
//			about.blindAssistSystem();
//			
//			Thread.sleep(1000);
//			about.doneButttnclick();
//			
//			Thread.sleep(2000);
//			about.continueButttonclick();
//			
//			
//			//about.adanotherVehicle();
//			}
//		
//		public static void moreInformationAboutOwner() throws InterruptedException {
//			
//		MoreAboutOwnersInformation ownersinformation=new MoreAboutOwnersInformation(driver);
//		ownersinformation.clickGender();
//		Thread.sleep(2000);
//		ownersinformation.selectMaritalStatus(1);
//		Thread.sleep(2000);
//		ownersinformation.educationStatus(6);
//		Thread.sleep(2000);
//		ownersinformation.employmentStatus(2);
//		Thread.sleep(1000);
//		ownersinformation.socialSecurityNo("694122345");
//		Thread.sleep(2000);
//		ownersinformation.primaryResidentDuration(1);
//		Thread.sleep(2000);
//		ownersinformation.moveOutDuration(1);
//		Thread.sleep(2000);
//		ownersinformation.licenceStatus();
//		Thread.sleep(2000);
//		ownersinformation.YearofLicense(1);
//		Thread.sleep(2000);
//		ownersinformation.activeArmy();
//		Thread.sleep(2000);
//		ownersinformation.Accident_Claim_Damaage();;
//		Thread.sleep(2000);
//		ownersinformation.Ticket_Violation();
//		Thread.sleep(2000);
//		ownersinformation.continueButton();
//		Thread.sleep(2000);
//		ownersinformation.continueButton();
//		
//		}
//
//		public static void previousInsuranceInformation() throws Exception {
//			
//			
//	TellUsaboutPreviousInsurance info=new TellUsaboutPreviousInsurance(driver);
//			
//			
//			
//			info.insuranceofToday();
//			Thread.sleep(2000);
//			info.Duration_With_Other_Company(1);
//			Thread.sleep(2000);
//			info.nonOrLastMonthPolicy();
//			info.thirtyDaysLapse();
//			Thread.sleep(2000);
//			info.bodilyInjureLimit(2);
//			Thread.sleep(2000);
//			info.nonOrLastMonthPolicy();
//			Thread.sleep(1000);
//			info.emailAndPolicyStartDate("02022021","abc@gmail.com");
//			Thread.sleep(2000);
//			info.numberOfResidentinHome("5", "1");
//			Thread.sleep(2000);
//			info.clickbutton();
//		}
//		
//		
//		public static void Nothanksauto() throws Exception {
//			SnapShot shot=new SnapShot(driver);
//			Thread.sleep(2000);
//			 shot.SnapandContinue();
//			 Thread.sleep(3333);
//			 shot.no_Thanks_Just_Auto();
//			
//		}
//		
//		
//
//		
//		public static void terminateBrowser() {
//			try{
//				
//			Thread.sleep(10000);	
//			driver.close();
//			driver.quit();
//		}catch(Exception e) {
//			
//			e.getStackTrace();
//			
//		}
//			
//		
//		
//		}
//	}
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
	
	
	
	
	


