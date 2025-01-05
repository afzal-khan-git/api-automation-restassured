package com.ak.api.tokenmanager;

import com.ak.api.restapi.RestResource;
import io.restassured.response.Response;

import java.time.Instant;
import java.util.HashMap;

import static com.ak.api.util.PropertiesFileReader.getProperty;

public class TokenManager {
    private static String access_token;
    private static Instant expiry_time;

    public static String getToken(){
        try {
            if (access_token == null || Instant.now().isAfter(expiry_time)){
                System.out.println("Renewing token.......");
                Response response = renewToken();
                access_token = response.path("access_token");
                int expiryDurationInSeconds = response.path("expires_in");
                expiry_time = Instant.now().plusSeconds(expiryDurationInSeconds - 300);
            }else {
                System.out.println("Token is good to use");
            }
        }catch (Exception e){
            throw new RuntimeException("Failed to get token");
        }

        return access_token;
    }

    private static Response renewToken(){
        HashMap<String, String> formParam = new HashMap<>();
            formParam.put("client_id", getProperty("config.properties","client_id"));
            formParam.put("client_secret", getProperty("config.properties","client_secret"));
            formParam.put("refresh_token", getProperty("config.properties","refresh_token"));
            formParam.put("grant_type", getProperty("config.properties","grant_type"));
        Response response = RestResource.postAccount(formParam);
        if (response.statusCode() != 200){
            throw  new RuntimeException("Renew token method failed");
        }

       return response;
    }


}
