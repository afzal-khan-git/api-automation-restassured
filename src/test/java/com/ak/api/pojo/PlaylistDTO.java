package com.ak.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlaylistDTO implements Serializable {

	@JsonProperty("collaborative")
	private boolean collaborative;

	@JsonProperty("description")
	private String description;

	@JsonProperty("external_urls")
	private ExternalUrlsDTO externalUrls;

	@JsonProperty("followers")
	private FollowersDTO followers;

	@JsonProperty("href")
	private String href;

	@JsonProperty("id")
	private String id;

	@JsonProperty("images")
	private Object images;

	@JsonProperty("name")
	private String name;

	@JsonProperty("owner")
	private OwnerDTO owner;

	@JsonProperty("primary_color")
	private Object primaryColor;

	@JsonProperty("public")
	private boolean isPublic;

	@JsonProperty("snapshot_id")
	private String snapshotId;

	@JsonProperty("tracks")
	private TracksDTO tracks;

	@JsonProperty("type")
	private String type;

	@JsonProperty("uri")
	private String uri;

	public void setCollaborative(boolean collaborative){
		this.collaborative = collaborative;
	}

	public boolean isCollaborative(){
		return collaborative;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setExternalUrls(ExternalUrlsDTO externalUrls){
		this.externalUrls = externalUrls;
	}

	public ExternalUrlsDTO getExternalUrls(){
		return externalUrls;
	}

	public void setFollowers(FollowersDTO followers){
		this.followers = followers;
	}

	public FollowersDTO getFollowers(){
		return followers;
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

	public void setImages(Object images){
		this.images = images;
	}

	public Object getImages(){
		return images;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setOwner(OwnerDTO owner){
		this.owner = owner;
	}

	public OwnerDTO getOwner(){
		return owner;
	}

	public void setPrimaryColor(Object primaryColor){
		this.primaryColor = primaryColor;
	}

	public Object getPrimaryColor(){
		return primaryColor;
	}

	public void setIsPublic(boolean jsonMemberPublic){
		this.isPublic = isPublic;
	}

	public boolean getIsPublic(){
		return isPublic;
	}

	public void setSnapshotId(String snapshotId){
		this.snapshotId = snapshotId;
	}

	public String getSnapshotId(){
		return snapshotId;
	}

	public void setTracks(TracksDTO tracks){
		this.tracks = tracks;
	}

	public TracksDTO getTracks(){
		return tracks;
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
			"PlaylistDTO{" + 
			"collaborative = '" + collaborative + '\'' + 
			",description = '" + description + '\'' + 
			",external_urls = '" + externalUrls + '\'' + 
			",followers = '" + followers + '\'' + 
			",href = '" + href + '\'' + 
			",id = '" + id + '\'' + 
			",images = '" + images + '\'' + 
			",name = '" + name + '\'' + 
			",owner = '" + owner + '\'' + 
			",primary_color = '" + primaryColor + '\'' + 
			",public = '" + isPublic + '\'' +
			",snapshot_id = '" + snapshotId + '\'' + 
			",tracks = '" + tracks + '\'' + 
			",type = '" + type + '\'' + 
			",uri = '" + uri + '\'' + 
			"}";
		}
}