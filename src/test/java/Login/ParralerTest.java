package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParralerTest {
	@Test(groups = {"sanity","regression"})
	public void laungoogle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); driver.quit(); 
	}

	@Test(groups = {"sanity","regression"})
	public void laungoogle2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); driver.quit();
	}

	@Test
	public void laungoogle3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); driver.quit();
	}

	@Test
	public void laungoogle4() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); driver.quit();
	}

	@Test
	public void laungoogle5() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); driver.quit();
	}

	@Test
	public void laungoogle6() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); driver.quit();
	}

	@Test
	public void laungoogle7() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); driver.quit();
	}

	@Test
	public void laungoogle8() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); driver.quit();
	}

	@Test
	public void laungoogle9() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); driver.quit();
	}

	@Test
	public void laungoogle10() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
