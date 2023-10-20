package com.hello.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloRequest {

	@JsonProperty(value = "msg")
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HelloRequest [msg=" + msg + "]";
	}
	
	
}
