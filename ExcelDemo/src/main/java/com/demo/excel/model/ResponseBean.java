package com.demo.excel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBean {

	private String apiKey; 
	private String name;
	private boolean active; 
	private boolean delted; 
	private ResponseMastercardParams mastercardParams;
	//private String error;
	
	/*public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}*/
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isDelted() {
		return delted;
	}
	public void setDelted(boolean delted) {
		this.delted = delted;
	}
	public ResponseMastercardParams getResponseMastercardParams() {
		return mastercardParams;
	} 
	
	@JsonProperty("mastercardParams")
	public void setResponseMastercardParams(ResponseMastercardParams responseMastercardParams) {
		this.mastercardParams = responseMastercardParams;
	}
	
	@Override
	public String toString() {
		return "Response [apiKey=" + apiKey + ", name=" + name + ", active=" + active + ", delted=" + delted
				+ ", responseMastercardParams=" + mastercardParams + "]";
	}
	
	
}
