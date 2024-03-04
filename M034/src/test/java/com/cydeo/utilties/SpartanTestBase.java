package com.cydeo.utilties;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public abstract class SpartanTestBase {


    @BeforeAll
    public static void init(){
        RestAssured.baseURI = "http://3.84.34.15:8000";
    }

}
