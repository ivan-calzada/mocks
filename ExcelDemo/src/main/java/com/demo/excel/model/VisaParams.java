package com.demo.excel.model;

public class VisaParams {

	private String acquirerBin;
	private String acquirerMerchantID;
	private String merchantName;
	private String merchantCountryCode;
	private String mcc;
	private String merchantUrl;

	public VisaParams() {
	}

	public VisaParams(String acquirerBin, String acquirerMerchantID, String merchantName, String merchantCountryCode,
			String mcc, String merchantUrl) {
		this.acquirerBin = acquirerBin;
		this.acquirerMerchantID = acquirerMerchantID;
		this.merchantName = merchantName;
		this.merchantCountryCode = merchantCountryCode;
		this.mcc = mcc;
		this.merchantUrl = merchantUrl;
	}

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

	@Override
	public String toString() {
		return "VisaParams [acquirerBin=" + acquirerBin + ", acquirerMerchantID=" + acquirerMerchantID + ", mcc=" + mcc
				+ ", merchantCountryCode=" + merchantCountryCode + ", merchantName=" + merchantName + ", merchantUrl="
				+ merchantUrl + "]";
	}

}
