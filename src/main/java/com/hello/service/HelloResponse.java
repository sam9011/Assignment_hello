package com.hello.service;

import java.util.Objects;

public class HelloResponse {
	
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "HelloResponse [msg=" + msg + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(msg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		HelloResponse other = (HelloResponse) obj;
		return Objects.equals(msg, other.msg);
	}
}
