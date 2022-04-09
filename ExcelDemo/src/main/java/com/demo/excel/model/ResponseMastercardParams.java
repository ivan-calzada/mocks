package com.demo.excel.model;

public class ResponseMastercardParams {

	private String acquirerBin;
	private String acquirerMerchantID;
	private String merchantName; 
	private String merchantCountryCode;
	private String mcc;
	private String merchantUrl; 
	private String threeDSRequestorID;
	private String threeDSRequestorName;
	
	public String getAcquirerBin() {
		return acquirerBin;
	}
	public void setAcquirerBin(String acquirerBin) {
		this.acquirerBin = acquirerBin;
	}
	public String getAcquirerMerchantID() {
		return acquirerMerchantID;
	}
	public void setAcquirerMerchantID(String acquirerMerchantID) {
		this.acquirerMerchantID = acquirerMerchantID;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantCountryCode() {
		return merchantCountryCode;
	}
	public void setMerchantCountryCode(String merchantCountryCode) {
		this.merchantCountryCode = merchantCountryCode;
	}
	public String getMcc() {
		return mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}
	public String getMerchantUrl() {
		return merchantUrl;
	}
	public void setMerchantUrl(String merchantUrl) {
		this.merchantUrl = merchantUrl;
	}
	public String getThreeDSRequestorID() {
		return threeDSRequestorID;
	}
	public void setThreeDSRequestorID(String threeDSRequestorID) {
		this.threeDSRequestorID = threeDSRequestorID;
	}
	public String getThreeDSRequestorName() {
		return threeDSRequestorName;
	}
	public void setThreeDSRequestorName(String threeDSRequestorName) {
		this.threeDSRequestorName = threeDSRequestorName;
	}

	
	
	
}
