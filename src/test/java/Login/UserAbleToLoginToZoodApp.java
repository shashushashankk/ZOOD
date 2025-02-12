package Login;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zoodel.generic_android.BaseClassForloginUser;

@Listeners(com.zoodel.generic_android.Listners.class)
public class UserAbleToLoginToZoodApp extends BaseClassForloginUser {
	@Test
	public void userAbleToLoginToZood() throws InterruptedException {
		Reporter.log("Succcessfully logged in to the application", true);
		Thread.sleep(10000);
		WebElement settingIcon=baseScreen.accountScreen.getSettingIcon();
		baseUtility.elementFunctions.clickOnElement(settingIcon);
		WebElement accountSettingText=baseScreen.accountSettingScreen.getAccountSettingText();
		baseUtility.waitUntill.elementToBeVisible(accountSettingText);
		baseUtility.elementFunctions.swipeTillTheElement("//android.widget.TextView[@text='Sign Out']","up",2);
		WebElement signOutbutton=baseScreen.accountSettingScreen.getSignOutbutton();
		baseUtility.waitUntill.elementToBeCLickable(signOutbutton);
		baseUtility.elementFunctions.clickOnElement(signOutbutton);
	}
}