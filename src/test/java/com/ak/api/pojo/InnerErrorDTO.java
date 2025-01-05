package com.ak.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InnerErrorDTO implements Serializable {

	@JsonProperty("status")
	private int status;

	@JsonProperty("message")
	private String message;

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"ErrorDTO{" + 
			"status = '" + status + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}