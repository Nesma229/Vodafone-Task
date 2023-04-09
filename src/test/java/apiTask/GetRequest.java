package apiTask;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class GetRequest {

@Test
    public void getPostById(){
    given().baseUri("https://jsonplaceholder.typicode.com/posts/1")
            .when()
            .get()
            .then()
            .log().all()
            .statusCode(200)
            .assertThat().body("title" , equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
}

}
