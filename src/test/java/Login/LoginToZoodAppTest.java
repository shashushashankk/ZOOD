package Login;

import com.zoodel.StepGroup.StepGroup;
import com.zoodel.generic_android.BaseClass;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class LoginToZoodAppTest extends BaseClass {
    @Test
    public void userAbleToLoginToZoodTest() {

    }

    @Test
    public void userAbleToLoginToZoodTest2() {
        log.info("Start to execute 2nd test cases", true);
        StepGroup.logout();

    }

    public static void main() throws InterruptedException {

        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "appium -a localhost -p 4723 --base-path wd/hub");
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

    }
}