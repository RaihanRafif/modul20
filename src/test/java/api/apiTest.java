package api;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class apiTest {
    @Test
    public void testGetListUsers() {
        given().when()
                .get("https://reqres.in/api/users?page=2").
                then().log().all()
                .assertThat().statusCode(200);
    }

    //positive case
    @Test
    public void testPostCreateUser() {
        String name = "raihan";
        String job = "QA";

        JSONObject bodyobj = new JSONObject();

        bodyobj.put("name", name);
        bodyobj.put("job", job);

        given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(bodyobj.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then().log().all()
                .assertThat().statusCode(201)
                .assertThat().body("name", Matchers.equalTo(name));
    }

    //negative case
    @Test
    public void testPostCreateUserWithMissingName() {
        System.out.println("negative create case");
    }

    //boundary case
    @Test
    public void testPostCreateUserWithMaxLengthName(){
        System.out.println("boundary create case");
    }

    //positive update case
    @Test
    public void updateUserTest() {
        RestAssured.baseURI = "https://reqres.in/";

        int userId = 2;
        String newName = "updatedUser";

        String fname = given().when().get("api/users/" + userId).getBody().jsonPath().get("data.first_name");
        String lname = given().when().get("api/users/" + userId).getBody().jsonPath().get("data.last_name");
        String avatar = given().when().get("api/users/" + userId).getBody().jsonPath().get("data.avatar");
        String email = given().when().get("api/users/" + userId).getBody().jsonPath().get("data.email");
        System.out.println("name before = " + fname);

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", userId);
        bodyMap.put("email", email);
        bodyMap.put("first_name", newName);
        bodyMap.put("last_name", lname);
        bodyMap.put("avatar", avatar);
        JSONObject jsonObject = new JSONObject(bodyMap);

        given().log().all().header("Content-type", "application/json")
                .body(jsonObject.toString())
                .put("api/users/" + userId)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("first_name", Matchers.equalTo(newName));
    }
    //negative update case
    @Test
    public void updateUserWithInvalidIdTest() {
        System.out.println("negative update case");
    }
//boundary update case
    @Test
    public void updateUserWithMaxLengthNameTest() {
        System.out.println("Boundary update case");
    }

}
