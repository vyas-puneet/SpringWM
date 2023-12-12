package com.servicenow.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringWMCtl {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, Puneet!";
	}
}
