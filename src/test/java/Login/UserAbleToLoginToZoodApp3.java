package Login;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

@Listeners(com.zoodel.generic_android.Listners.class)
public class UserAbleToLoginToZoodApp3  {
	@Parameters("browser")
	@Test(retryAnalyzer = com.zoodel.generic_android.ReExecuteFailledTestCases.class)
	public void userAbleToLoginToZood(String browser) throws InterruptedException {
		Reporter.log("Start to execute test cases");
		new Assertion().fail();
//		switch (browser.toLowerCase()){
//			case "chrome":{
//				WebDriver driver = new ChromeDriver();
//				break;
//			}case "edge":{
//				WebDriver driver = new EdgeDriver();
//				break;
//			}
//		}
	}
}