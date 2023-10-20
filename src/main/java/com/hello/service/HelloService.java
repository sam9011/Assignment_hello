package com.hello.service;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {
	
	public HelloResponse helloService(HelloRequest request) {
		
		HelloResponse helloResponse = new HelloResponse();
		
		
		helloResponse.setMsg("Hello "+request.getMsg());
		
		return helloResponse;
		
	}

}
