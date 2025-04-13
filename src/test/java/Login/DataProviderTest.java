package Login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "loginCredentilas", dataProviderClass = Login.test.class)
	public void flipKartLogin(String userName, String pwd) {
		System.out.println("userName is " + userName);
		System.out.println("pwd is " + pwd);
	}

}
class test {	
	@DataProvider
	public static String[][] loginCredentilas() {
		String[][] cred = { { "Shashank", "Shashank@123" }, { "Thejaswini", "Thejaswini@123" },
				{ "Sachin", "Sachin@123" } };
		return cred;
	}
}