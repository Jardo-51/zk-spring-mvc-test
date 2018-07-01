package com.jardoapps.zkspringmvctest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("zk-spring-mvc-test/api/v0/foo")
public class FooController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> method() {
		return ResponseEntity.ok().body("OK");
	}

}
