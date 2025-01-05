package com.ak.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FollowersDTO implements Serializable {

	@JsonProperty("href")
	private Object href;

	@JsonProperty("total")
	private int total;

	public void setHref(Object href){
		this.href = href;
	}

	public Object getHref(){
		return href;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	@Override
 	public String toString(){
		return 
			"FollowersDTO{" + 
			"href = '" + href + '\'' + 
			",total = '" + total + '\'' + 
			"}";
		}
}