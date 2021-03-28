import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Task3 {

    @Test
    public void getResponse() {

        Response response = RestAssured.given().when().get("http://md5.jsontest.com/?text=test").then().extract().response();

        response.then().body("md5", equalTo("098f6bcd4621d373cade4e832627b4f6"));
    }

}

