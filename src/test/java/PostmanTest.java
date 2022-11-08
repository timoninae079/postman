import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

    @Test
    void shouldReturnTestData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("PostmanTest data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("PostmanTest data"))
        ;
    }

}
