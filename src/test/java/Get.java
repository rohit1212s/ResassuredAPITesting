import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class Get {

    @Test
    public void getWeatherDetails(){
        given()
        .when()
                .get("http://localhost:8080/Product")
                .then()
                .statusCode(200)
                .assertThat().body("title", equalTo("Api testing"))
                .header("Content-Type", "application/json");



    }
}
