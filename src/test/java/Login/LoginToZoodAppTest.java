package Login;

import com.zoodel.StepGroup.StepGroup;
import com.zoodel.generic_android.BaseClass;
import org.testng.annotations.Test;

public class LoginToZoodAppTest extends BaseClass {
    @Test
    public void userAbleToLoginToZoodTest() {

    }

    @Test
    public void userAbleToLoginToZoodTest2() {
        log.info("Start to execute 2nd test cases", true);
        StepGroup.logout();

    }

}