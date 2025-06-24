package Login;

//import com.zoodel.StepGroup.StepGroup;
import com.zoodel.generic_android.BaseClass;
import com.zoodel.pom_android.LoginScreen;
import com.zoodel.pom_android.ZMHomeScreen;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class LoginToZoodAppTest extends BaseClass {
    @Test(dependsOnGroups = "userAbleToLoginToZoodTest2", priority = -5)
    public void userAbleToLoginToZoodTest() {
    	
    }
    String  arr= "";
    @Test (priority = -5, alwaysRun = true, enabled = false,successPercentage = 10)
    public void userAbleToLoginToZoodTest2() {
        log.info("Start to execute 2nd test cases", true);
//        StepGroup.logout();
    }

//    @ BeforeClass - org.testng.annotation
//    @ BeforeGroups - org.testng.annotations
//    @BeforeMethod - org.testng.annotations
//    @ BeforeSuite - org.testng.annotations
//   @ BeforeTest - org.testng.annotations
//    @ AfterClass - org.testng.annotations
//    @ AfterGroups - org.testng.annotations
//    @ AfterMethod - org.testng.annotations
//    @ AfterSuite - org.testng.annotations
//    @ After Test - org.testng.annotations
    public static void main() throws InterruptedException {

        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "appium -a localhost -p 4723 --base-path wd/hub");
            pb.redirectErrorStream(true);
            Process process=pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line= null;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
                if(line.contains("Appium REST http interface listener started on")){
                    break;
                }
            }

            System.out.println("Appium server started...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}