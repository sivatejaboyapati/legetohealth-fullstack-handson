package com.legatohealth.beans;

public class Message {
	private String info;
	private int status;

	public Message(String info, int status) {
		super();
		this.info = info;
		this.status = status;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
