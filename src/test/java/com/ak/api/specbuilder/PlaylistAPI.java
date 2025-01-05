package com.ak.api.specbuilder;

import com.ak.api.pojo.PlaylistDTO;
import com.ak.api.restapi.RestResource;
import io.restassured.response.Response;

import static com.ak.api.restapi.Route.PLAYLISTS;
import static com.ak.api.restapi.Route.USERS;
import static com.ak.api.tokenmanager.TokenManager.getToken;
import static com.ak.api.util.PropertiesFileReader.getProperty;

public class PlaylistAPI {

    public static Response post(PlaylistDTO playlistDTO){
        return RestResource.post(USERS + "/"+ getProperty("config.properties","user_id") + PLAYLISTS, getToken(), playlistDTO);
    }

    /**
     * overloaded post which takes token a param specifically to test expired token scenario
     * @param token
     * @param playlistDTO
     * @return
     */
    public static Response post(String token, PlaylistDTO playlistDTO){
        return RestResource.post(USERS + "/"+ getProperty("config.properties","user_id") + PLAYLISTS, token, playlistDTO);
    }

    public static Response get(String playlistId){
        return RestResource.get(PLAYLISTS + "/" + playlistId, getToken());
    }
    public static Response update(String playlistId, PlaylistDTO playlistDTO){
        return RestResource.update(PLAYLISTS+ "/" + playlistId, getToken(), playlistDTO);
    }



}
