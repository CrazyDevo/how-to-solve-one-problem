package com.cydeo.tests;


import com.cydeo.utilties.SpartanTestBase;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P02_SpartanPOST extends SpartanTestBase {
    /**
     Given accept type is JSON
     And Content type is JSON
     And request json body is:
     {
     "gender":"Male",
     "name":"John Doe",
     "phone":8877445596
     }
     When user sends POST request to '/api/spartans'
     Then status code 201
     And content type should be application/json
     And json payload/response/body should contain:
     verify the success value is 'A Spartan is Born!'
     "name": "John Doe",
     "gender": "Male",
     "phone": 8877445596
     */

    @Test
    public void test1(){
        String requestBody = "   {\n" +
                "     \"gender\":\"Male\",\n" +
                "     \"name\":\"John Doe\",\n" +
                "     \"phone\":8877445596\n" +
                "     }";

       JsonPath jsonPath = given().log().body()
                .accept(ContentType.JSON) //hey api, please send me JSON RESPONSE BODY
                .and()
                .contentType(ContentType.JSON) // hey api, I am sending you JSON REQUEST BODY
                .body(requestBody)
        .when()
                .get("/api/spartans").jsonPath();



        assertEquals("John Doe",jsonPath.getString("data.name"));
        assertEquals("Male",jsonPath.getString("data.gender"));
        assertEquals(8877445596l,jsonPath.getLong("data.phone"));

        //I want to get id out of the response body, to delete or send get request later on
        int id = jsonPath.getInt("data.id");
        System.out.println("id = " + id);


    }


}
