package com.ab.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.model.Actor;

@RestController
@RequestMapping("/actor")
@RefreshScope
public class ActionOperationController {
	
	@Value("${server.port}")
	String port;
	
	@Value("${eureka.instance.instance-id}")
	String instanceId;
	
	@Value("${dbuser}")
	String dbuser;
	
	@Value("${dbpwd}")
	String dbpwd;
	
	@GetMapping("/wish")
	public ResponseEntity<String> displayWishMessage(){
		String message="Good Morning"+"........."+port+".........."+instanceId+"............"+dbuser+"........"+dbpwd;
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Actor> registorActor(@RequestBody Actor actor){
		return new ResponseEntity<Actor>(actor, HttpStatus.CREATED);
	}
}
