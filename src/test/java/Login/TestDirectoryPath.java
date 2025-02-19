package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.zoodel.generic_android.ExtentReportListner.class)
public class TestDirectoryPath {
	@Test
	public void main1() {
		try {
			System.out.println("Current os name: " + System.getProperty("os.name"));
			System.out.println("Current os Version: " + System.getProperty("os.version"));
			System.out.println("Current os Version: " + System.getProperty("java.version"));
			System.out.println("Current machine name: " + System.getProperty("user.name"));

			WebDriver driver= new FirefoxDriver();
			System.out.println("Browser name is "+driver.getClass().getSimpleName());;
			System.out.println("Browser name is "+driver.getClass().getName());
		} catch (Exception e) {
			System.err.println("Error fetching directory: " + e.getMessage());
		}
	}
}
