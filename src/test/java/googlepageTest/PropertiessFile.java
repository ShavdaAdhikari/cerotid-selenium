package googlepageTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import properties.PropertiesconfigTestNgDemo;

public class PropertiessFile {
	
	
	
	
	
static Properties pro=new Properties();
	
	//get system project path
	static String projectPath=System.getProperty("user.dir");
	
	
	public static void main(String[] args) {
		
		
		//get current properties
		getProperties();
		
		 //set custom properties
		
		setProperties();
		// get updated properties
		
		//getProperties();
		
		
		
}

//get all current configuration from the properties file
	public static void getProperties() {
		
		
		try {
			//create an object of inputstream to retrive value from config.properties
			InputStream input=new FileInputStream(projectPath+ "/Users/shavdaadhikari/eclipse-workspace/SeleniumGroup113/src/test/java/googlepageTest/config.propertie");
		
		pro.load(input);
		
		
		
		String browser=pro.getProperty("browser");
		String name=pro.getProperty("name");
		System.out.println(browser+ " is invoked");
		System.out.println(name+" is my name");
		
		HomepageTest.browserName=browser;//PropertiesconfigTestNgDemo.BrowserName=browser;
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
	
	}

//set all the configuration for the properties file
	public static void setProperties() {
		
		try{
			
		//create a object of output stream to write to the config file
			OutputStream output=new FileOutputStream(projectPath+ "/Users/shavdaadhikari/eclipse-workspace/SeleniumGroup113/src/test/java/googlepageTest/config.propertie");
			
			pro.setProperty("browser","firefox");
			pro.setProperty("result", "pass");
			pro.store(output, "storing to config.properties file");
			
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
