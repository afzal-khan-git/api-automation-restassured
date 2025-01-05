package com.ak.api.specbuilder;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static com.ak.api.restapi.Route.BASE_PATH;

public class SpecificationBuilder {



    public static RequestSpecification getRequestSpecification(){
        return new RequestSpecBuilder().
                setBaseUri("https://api.spotify.com").
                setBasePath(BASE_PATH).
                //addHeader("Authorization", "Bearer " + accessToken).
                setContentType(ContentType.JSON).
                log(LogDetail.ALL).
                build();
    }

    public static ResponseSpecification getResponseSpecification(){
        return new ResponseSpecBuilder().
                log(LogDetail.ALL).
                build();
    }

}

