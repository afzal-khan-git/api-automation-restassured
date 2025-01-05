package com.ak.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TracksDTO implements Serializable {

	@JsonProperty("href")
	private String href;

	@JsonProperty("items")
	private List<Object> items;

	@JsonProperty("limit")
	private int limit;

	@JsonProperty("next")
	private Object next;

	@JsonProperty("offset")
	private int offset;

	@JsonProperty("previous")
	private Object previous;

	@JsonProperty("total")
	private int total;

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	public void setItems(List<Object> items){
		this.items = items;
	}

	public List<Object> getItems(){
		return items;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	public void setNext(Object next){
		this.next = next;
	}

	public Object getNext(){
		return next;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setPrevious(Object previous){
		this.previous = previous;
	}

	public Object getPrevious(){
		return previous;
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
			"TracksDTO{" + 
			"href = '" + href + '\'' + 
			",items = '" + items + '\'' + 
			",limit = '" + limit + '\'' + 
			",next = '" + next + '\'' + 
			",offset = '" + offset + '\'' + 
			",previous = '" + previous + '\'' + 
			",total = '" + total + '\'' + 
			"}";
		}
}