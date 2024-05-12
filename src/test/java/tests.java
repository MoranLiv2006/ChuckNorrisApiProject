import org.testng.annotations.Test;

public class tests extends BaseClass {

    @Test(invocationCount = 5)
    public void randomJoke() {
        getRandomJoke(true);
        getRandomJoke(false);
    }

    @Test(invocationCount = 5)
    public void categorisedJoke() {
        getRandomCategorisedJoke();
    }
}
