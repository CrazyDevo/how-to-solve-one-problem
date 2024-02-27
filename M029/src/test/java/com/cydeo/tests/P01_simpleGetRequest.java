package com.cydeo.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P01_simpleGetRequest {

    String url ="http://54.237.226.155:8000/api/spartans";

    /*
        When users send request to /api/spartans endpoint
        Then user should be abel to see status code is 200
        and Print out response body into screen
     */

    @Test
    public void simpleGetRequest(){
        //send request to url and get response as Response interface
        Response response = RestAssured.get(url);

        //both same no difference, they get the response status code
        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.getStatusCode() = " + response.getStatusCode());

        //verify that status code is 200
        int actualStatusCode = response.statusCode();

        //assert that it is 200
        Assertions.assertEquals(200,actualStatusCode);

        //how to print json response body on console
        response.prettyPrint();

    }


}
