import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tests extends BaseClass {

    @Test(invocationCount = 5, description = "sdsds")
    public void randomJoke() {
        getRandomJoke(true);
        getRandomJoke(false);
        Assert.assertEquals(1, 1, "yes!");
    }

    @Test(invocationCount = 5, priority = 1)
    public void categorisedJoke() {
        getRandomCategorisedJoke();
        Assert.fail();
    }
}
