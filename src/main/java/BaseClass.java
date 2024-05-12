import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class BaseClass {

    private Response response;
    private JsonPath jsonPath;
    private final String PREFIX_URL = "https://api.chucknorris.io/jokes/";

    public Response getJoke(String value) {
        Response response = given()
                .get(PREFIX_URL+ value)
                .then()
                .statusCode(200)
                .extract()
                .response();
        return response;
    }

    public void getRandomJoke(boolean showFullInformation) {
        response = getJoke("random");
        jsonPath = response.jsonPath();
        if (showFullInformation) {
            jsonPath.prettyPrint();
        } else {
            System.out.println(jsonPath.getString("value"));
        }
    }

    public void getRandomCategorisedJoke() {
        Response categoryResponse = getJoke("categories");
        jsonPath = categoryResponse.jsonPath();
        List<String> categoryResponseList = jsonPath.get();
        Random rand = new Random();
        String category = categoryResponseList.get(rand.nextInt(categoryResponseList.size()));
        response = getJoke("random?category=" + category);
        jsonPath = response.jsonPath();
        jsonPath.prettyPrint();
    }
}
