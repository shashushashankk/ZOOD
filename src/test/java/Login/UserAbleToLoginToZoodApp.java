package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zoodel.generic_android.BaseClassForloginUser;

@Listeners(com.zoodel.generic_android.Listners.class)
public class UserAbleToLoginToZoodApp extends BaseClassForloginUser {
	@Test
	public void userAbleToLoginToZood() throws InterruptedException {
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