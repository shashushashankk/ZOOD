package com.zoodel.generic_android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import com.zoodel.StepGroup.StepGroup;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

//@Listeners(com.zoodel.generic_android.Listners.class)
public class BaseClass extends GlobalVariable {
	@BeforeClass
	public void openZoodAndroidApp() throws MalformedURLException, URISyntaxException {
		log = LogManager.getLogger(this.getClass());
		log.info("Starting server",true);
		ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "appium -a 0.0.0.0 -p 4723 --base-path wd/hub");
		try {
			Process process = processBuilder.start();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String result=null;
			while ((result=bufferedReader.readLine())!=null){
				log.info(result,true);
				if(result.contains("AndroidUiautomator2Driver has been successfully")){
					break;
				}
			}
			log.info("Appium server started", true);
		} catch (IOException e) {
			log.info("Failed to start Appium server " + e.getLocalizedMessage(), true);
		}
		StepGroup.openZoodApp(noReset);
		StepGroup.loginToZoodApp();
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
