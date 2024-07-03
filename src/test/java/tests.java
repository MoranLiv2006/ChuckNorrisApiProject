import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tests extends BaseClass {

    @Test(description = "sdsds")
    public void randomJoke() {
        getRandomJoke(true);
        getRandomJoke(false);
        Assert.assertEquals(1, 1, "yes!");
    }

    @Test(priority = 1)
    public void categorisedJoke() {
        getRandomCategorisedJoke();
//        Assert.fail();
        Allure.label("sdsds", "sds");
    }
}
