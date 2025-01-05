package com.ak.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalUrlsDTO implements Serializable {

	@JsonProperty("spotify")
	private String spotify;

	public void setSpotify(String spotify){
		this.spotify = spotify;
	}

	public String getSpotify(){
		return spotify;
	}

	@Override
 	public String toString(){
		return 
			"ExternalUrlsDTO{" + 
			"spotify = '" + spotify + '\'' + 
			"}";
		}
}