package Login;

import org.apache.poi.wp.usermodel.CharacterRun;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.zoodel.generic_android.ExtentReportListner.class)
public class ReportTest {
    @Test
    public void test() {
        try {
//            new ChromeDriver();
            System.out.println("Current os name: " + System.getProperty("os.name"));
            System.out.println("Current os Version: " + System.getProperty("os.version"));
            System.out.println("Current os Version: " + System.getProperty("java.version"));
            System.out.println("Current machine name: " + System.getProperty("user.name"));
            System.setProperty("webDriver.chrome.driver","chrome");
            WebDriver driver = new ChromeDriver();
            System.out.println("Browser name is " + driver.getClass().getSimpleName());
            ;
            System.out.println("Browser name is " + driver.getClass().getName());
        } catch (Exception e) {
            System.err.println("Error fetching directory: " + e.getMessage());
        }
    }
}
