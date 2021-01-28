package linearAutomation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {                    //     <!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
                                               //<dependency>
                                                     //    <groupId>commons-io</groupId>
                                                   //    <artifactId>commons-io</artifactId>
                                                    //    <version>2.8.0</version>
                                                                 //</dependency>
public void takeSnapShot(WebDriver driver, String screenShotName) {

try {

File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(src, new File("./Snapshot/ " +screenShotName+ ".jpeg"));



Thread.sleep(2000);
System.out.println(" snap shot is taken");

}catch(Exception e) {
e.getStackTrace();
}
}}


