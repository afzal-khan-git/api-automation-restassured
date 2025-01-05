package com.ak.api.tests;

import com.ak.api.pojo.ErrorRootDTO;
import com.ak.api.pojo.PlaylistDTO;
import com.ak.api.specbuilder.PlaylistAPI;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static com.ak.api.util.PropertiesFileReader.getProperty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SpotifyPlaylistTests {

    @Test
    public void creatingAPlaylist() {
        PlaylistDTO playlistRequestBody = new PlaylistDTO();
        playlistRequestBody.setName("Millennium 19");
        playlistRequestBody.setDescription("Backstreet Boys Rock");
        playlistRequestBody.setIsPublic(true);
        //make post call providing playlist request body and capture response
        Response response = PlaylistAPI.post(playlistRequestBody);
        assertThat(response.statusCode(), equalTo(201));
        //now deserialize response object to PlaylistDTO object to do field level validation
        PlaylistDTO responsePlaylist = response.as(PlaylistDTO.class);
        assertThat(responsePlaylist.getName(), equalTo(playlistRequestBody.getName()));
        assertThat(responsePlaylist.getDescription(), equalTo(playlistRequestBody.getDescription()));
        assertThat(responsePlaylist.getIsPublic(), equalTo(playlistRequestBody.getIsPublic()));
    }

    @Test
    public void getAPlayList(){
        PlaylistDTO playlistRequestBody = new PlaylistDTO();
        playlistRequestBody.setName("Millennium 18");
        playlistRequestBody.setDescription("Backstreet Boys Rock");
        playlistRequestBody.setIsPublic(true);
        //make post call providing playlist request body and capture response
        Response response = PlaylistAPI.get(getProperty("data.properties","get_playlist_id"));
        assertThat(response.statusCode(), equalTo(200));
        //now deserialize response object to PlaylistDTO object
        PlaylistDTO responsePlaylist = response.as(PlaylistDTO.class);
        assertThat(responsePlaylist.getName(), equalTo(playlistRequestBody.getName()));
        assertThat(responsePlaylist.getDescription(), equalTo(playlistRequestBody.getDescription()));
        assertThat(responsePlaylist.getIsPublic(), equalTo(playlistRequestBody.getIsPublic()));
    }

    @Test
    public void updateAPlaylist(){
        PlaylistDTO playlistRequestBody = new PlaylistDTO();
        playlistRequestBody.setName("Sobai Ekela");
        playlistRequestBody.setDescription("Ayub Bacchu");
        playlistRequestBody.setIsPublic(true);
        Response response = PlaylistAPI.update(getProperty("data.properties","update_playlist_id"), playlistRequestBody);
        assertThat(response.statusCode(), equalTo(200));
    }

    @Test
    public void errorWhenCreatingPlaylistWithoutName(){
        PlaylistDTO playlistRequestBody = new PlaylistDTO();
        playlistRequestBody.setName(null);
        playlistRequestBody.setDescription("Ayub Bacchu");
        playlistRequestBody.setIsPublic(true);
        Response response = PlaylistAPI.post(playlistRequestBody);
        assertThat(response.statusCode(), equalTo(400));
        //deserialize response object to PlaylistAPI class
        ErrorRootDTO responseError = response.as(ErrorRootDTO.class);
        assertThat(responseError.getError().getStatus(), equalTo(400));
        assertThat(responseError.getError().getMessage(), equalTo("Missing required field: name"));
    }

    @Test
    public void errorExpiredToken(){
        PlaylistDTO playlistRequestBody = new PlaylistDTO();
        playlistRequestBody.setName(null);
        playlistRequestBody.setDescription("Ayub Bacchu");
        playlistRequestBody.setIsPublic(true);
        String expiredToken = "BQC6lZ1G36Ka1KangucZLWgYyq12novmQCOzW2wf2Lx3tmeTNZvHuqBltUrfV-SJnAWOMo3l7pbSDQI5SXA-bzQIAkxJJI0ocG87MJFwmLVSnvjbRaiytOt3hA4XNL7x17E_7LouK3fTK1FeWAV1E1hskEVGu-2xewYFnsarALhOI_cXsS1bsebMX8JhbkwU2toRFKXPZOAfrj0kJ4cvfOXtrHz_k922_8dWY3z6VmSvxctP1OPTqhDieD6UcKLxpuYDl2cjdGoSxdBbCnuUwjCn";
        //make post call providing playlist request body and capture response
        Response response = PlaylistAPI.post(expiredToken, playlistRequestBody);
        assertThat(response.statusCode(), equalTo(401));
        //now deserialize response object to PlaylistDTO object to do field level validation
        ErrorRootDTO responseError = response.as(ErrorRootDTO.class);
        assertThat(responseError.getError().getStatus(), equalTo(401));
        assertThat(responseError.getError().getMessage(), equalTo("The access token expired"));
    }



}
