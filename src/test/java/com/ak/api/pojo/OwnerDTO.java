package com.ak.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OwnerDTO implements Serializable {

	@JsonProperty("display_name")
	private String displayName;

	@JsonProperty("external_urls")
	private ExternalUrlsDTO externalUrls;

	@JsonProperty("href")
	private String href;

	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private String type;

	@JsonProperty("uri")
	private String uri;

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setExternalUrls(ExternalUrlsDTO externalUrls){
		this.externalUrls = externalUrls;
	}

	public ExternalUrlsDTO getExternalUrls(){
		return externalUrls;
	}

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	@Override
 	public String toString(){
		return 
			"OwnerDTO{" + 
			"display_name = '" + displayName + '\'' + 
			",external_urls = '" + externalUrls + '\'' + 
			",href = '" + href + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",uri = '" + uri + '\'' + 
			"}";
		}
}