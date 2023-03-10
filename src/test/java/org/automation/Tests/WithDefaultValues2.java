package org.automation.Tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class WithDefaultValues2 {



    @Test
    public void createBooking1()
    {
        System.out.println(Thread.currentThread().getId());
        RestAssured
                .given()
                .log()
                .all()
                .basePath("auth")
                .body("{\r\n" +
                        "    \"username\" : \"admin\",\r\n" +
                        "    \"password\" : \"password123\"\r\n" +
                        "}")
                .contentType(ContentType.JSON)
                .post()
                .then()
                .log()
                .all()
                .statusCode(200);
    }

}
