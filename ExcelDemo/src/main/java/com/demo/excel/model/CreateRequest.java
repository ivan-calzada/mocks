package com.demo.excel.model;

public class CreateRequest {

	private String manager;
	private String code;
	private String action;
	private String name;
	private String active;
	private String signature;

	private VisaParams visaParams;
	private MastercardParams mastercardParams;

	public CreateRequest() {
	}	
	
	public CreateRequest(String manager, String code, String action, String name, String active, String signature,
			VisaParams visaParams, MastercardParams mastercardParams) {
		this.manager = manager;
		this.code = code;
		this.action = action;
		this.name = name;
		this.active = active;
		this.signature = signature;
		this.visaParams = visaParams;
		this.mastercardParams = mastercardParams;
	}

	public VisaParams getVisaParams() {
		return visaParams;
	}

	public void setVisaParams(VisaParams visaParams) {
		this.visaParams = visaParams;
	}

	public MastercardParams getMastercardParams() {
		return mastercardParams;
	}

	public void setMastercardParams(MastercardParams mastercardParams) {
		this.mastercardParams = mastercardParams;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "CreateRequest [action=" + action + ", active=" + active + ", code=" + code + ", manager=" + manager
				+ ", mastercardParams=" + mastercardParams + ", name=" + name + ", signature=" + signature
				+ ", visaParams=" + visaParams + "]";
	}
	
}
