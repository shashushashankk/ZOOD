package com.zoodel.generic_android;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.time.Duration;

//@Listeners(com.zoodel.generic_android.Listners.class)
public class BaseClass extends GlobalVariable {
	@BeforeClass
	public void openZoodAndroidApp() throws Exception, URISyntaxException {
		log = LogManager.getLogger(this.getClass());
		try {
			ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "appium -a 0.0.0.0 -p 4723 --base-path wd/hub");
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
		Thread.sleep(Duration.ofSeconds(10));
		log.info("Server started",true);
//		StepGroup.openZoodApp(noReset);
//		StepGroup.loginToZoodApp();
	}

	@BeforeMethod
	public void loginToTheApplication() {
	}

	@AfterMethod
	public void logoutFromTheApplication() {
		// TODO Auto-generated method stub

	}

	@AfterClass(alwaysRun = false)
	public void closeZoodApp() {
//		androidDriver.quit();

	}
}
