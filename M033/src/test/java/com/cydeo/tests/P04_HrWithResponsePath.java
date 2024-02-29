package com.cydeo.tests;


import com.cydeo.utilties.HrTestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P04_HrWithResponsePath extends HrTestBase {

    @DisplayName("GET Request to countries with using Response Path")
    @Test
    public void test1() {

        Response response = given().accept(ContentType.JSON)
                .queryParam("q", "{\"regio_id\":2}")
                .when().get("/countries");

        //response.prettyPrint();

        //print limit
        System.out.println("response.path(\"limit\") = " + response.path("limit"));
        //print hasMore
        System.out.println("response.path(\"hasMOre\") = " + response.path("hasMore"));
        //print second country name
        System.out.println("response.path(\"items[1].country_name\") = " + response.path("items[1].country_name"));
        //print 4th element country name
        System.out.println("response.path(\"items[3].country_name\") = " + response.path("items[3].country_name"));
        //print 3rd element href
        System.out.println("response.path(\"items[2].links[0].href\") = " + response.path("items[2].links[0].href"));

        //get all countries names
        List<String> allCountryNames = response.path("items.country_name");
        System.out.println("allCountryNames = " + allCountryNames);

        //verify all region_ids equals to 2
        List<Integer> allRegionsIDs = response.path("items.region_id");

        for (Integer id : allRegionsIDs) {
            assertEquals(2,id);
            System.out.println("id = " + id);
        }


    }
}
