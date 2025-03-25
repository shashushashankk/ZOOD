package Login;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class RemoteWebDriverTest {
    @Test
    public void launchBrowser() throws URISyntaxException, MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setPlatform(Platform.WIN11);
        cap.setBrowserName("chrome");
        RemoteWebDriver driver = new RemoteWebDriver(new URI("http://localhost:4444/wd/hub").toURL(),cap);
//        RemoteWebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.20:5555/wd/hub").toURL(),cap);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.quit();
    }
}
