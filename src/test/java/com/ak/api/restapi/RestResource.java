package com.ak.api.restapi;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static com.ak.api.restapi.Route.API;
import static com.ak.api.restapi.Route.TOKEN;
import static com.ak.api.specbuilder.SpecificationBuilder.getRequestSpecification;
import static com.ak.api.specbuilder.SpecificationBuilder.getResponseSpecification;
import static io.restassured.RestAssured.given;

public class RestResource {

    public static Response post(String path, String accessToken, Object requestObject){
        return given(getRequestSpecification()).
                body(requestObject).
                header("Authorization", "Bearer " + accessToken).
                when().post(path).
                then().spec(getResponseSpecification()).
                extract().
                response();
    }
    public static Response postAccount(HashMap<String, String> formParam){
        return given().
                baseUri("https://accounts.spotify.com").
                formParams(formParam).
                contentType(ContentType.URLENC).
                log().all().
                when().post(API + TOKEN).
                then().spec(getResponseSpecification()).
                extract().
                response();
    }
    public static Response get(String path, String accessToken){
        return given(getRequestSpecification()).
                header("Authorization", "Bearer " + accessToken).
                when().get(path).
                then().spec(getResponseSpecification()).
                extract().
                response();
    }
    public static Response update(String path, String accessToken, Object requestObject){
        return given(getRequestSpecification()).
                body(requestObject).
                header("Authorization", "Bearer " + accessToken).
                when().put(path).
                then().spec(getResponseSpecification()).
                extract().
                response();
    }



}
