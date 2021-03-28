import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Task4 {

    @Test
    public void getResponse() {

        Response response = RestAssured.given().when().get("http://ergast.com/api/f1/2017/circuits.json").then().extract().response();

        response.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));

    }

}
