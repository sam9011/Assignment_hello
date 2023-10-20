package com.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hello.service.HelloRequest;
import com.hello.service.HelloResponse;
import com.hello.service.HelloService;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
	
	@Autowired
	@Qualifier("helloService")
	private HelloService helloService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	private HelloResponse helloMsg(@RequestBody HelloRequest helloRequest) {
		HelloResponse helloResponse = null;
		
		helloResponse = helloService.helloService(helloRequest);
		
		return helloResponse;
		
	}
	
	

	
}
