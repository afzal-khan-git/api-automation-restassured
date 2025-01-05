package com.ak.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorRootDTO implements Serializable {

	@JsonProperty("error")
	private InnerErrorDTO error;

	public void setError(InnerErrorDTO error){
		this.error = error;
	}

	public InnerErrorDTO getError(){
		return error;
	}

	@Override
 	public String toString(){
		return 
			"ErrorRootDTO{" + 
			"error = '" + error + '\'' + 
			"}";
		}
}