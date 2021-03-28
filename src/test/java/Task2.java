import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.Test;

public class Task2 {

    @Test
    public void getResponse () {

       Response response = RestAssured.given().when().get("http://ergast.com/api/f1/2019/circuits.json").then().extract().response();

       if (response.getStatusCode() == 200)
           System.out.println("OK");

       if (response.headers().hasHeaderWithName("Content-Length"))
           System.out.println("\"Content-Length\" Header present");

        System.out.println("Value of \"Content-Length\" = " + response.headers().getValue("Content-Length"));

       }

    }
