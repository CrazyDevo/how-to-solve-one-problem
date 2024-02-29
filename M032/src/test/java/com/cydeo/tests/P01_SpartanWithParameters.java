package com.cydeo.tests;


import com.cydeo.utilties.SpartanTestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class P01_SpartanWithParameters extends SpartanTestBase {

     /*   Given accept type is Json
        And Id parameter value is 24
        When user sends GET request to /api/spartans/{id}
        Then response status code should be 200
        And response content-type: application/json
        And "Julio" should be in response payload(body)
     */

    @DisplayName("GET Spartan /api/spartans/{id} path param with 24")
    @Test
    public void test1() {
        Response response = given().
                accept(ContentType.XML)
                .and()
                .pathParam("id", 24)
                .when()
                .get("/api/spartans/{id}");

        response.prettyPrint();
        //Then response status code should be 200
        assertEquals(200,response.statusCode());
        //And response content-type: application/json
        assertEquals("application/json",response.contentType());
        //And "Julio" should be in response payload(body)
        assertTrue(response.body().asString().contains("Julio"));

    }






}
