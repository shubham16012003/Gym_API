package com.Gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gym.model.Demo;
import com.Gym.service.DemoService;



@RestController
@RequestMapping(path="/demo")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	

	@PostMapping(path ="/save")
	public ResponseEntity<String> getInfo(@RequestBody Demo demo) {
		if(demoService.saveDemo(demo)) {
		
		return new ResponseEntity<String>("Info Saved ",HttpStatus.OK);
		
		}else {
			return new ResponseEntity<String>("Failed to save",HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
			
	}

}
