package com.cydeo.utilties;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public abstract class HrTestBase {

    @BeforeAll
    public static void init(){
        RestAssured.baseURI = "http://3.84.34.15:1000/ords/hr";
        //MyIpAddress:1000/ords/hr
    }
}
