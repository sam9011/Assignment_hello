package com.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping({"/id","/"})
	@ResponseStatus(HttpStatus.ACCEPTED)
	private HelloResponse helloMsg(@RequestBody(required = false) HelloRequest helloRequest,
			@PathVariable(name="id",required = false) Integer id) {
		HelloResponse helloResponse = null;
		
		helloResponse = helloService.helloService(helloRequest);
		System.out.println("hh"+id);
		
		return helloResponse;
		
	}
	
	

	
}
