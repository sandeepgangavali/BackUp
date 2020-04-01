package com.moviecruiser.userprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moviecruiser.userprofile.model.Register;
import com.moviecruiser.userprofile.service.RegisterService;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserProfileController {
	
	@Autowired
	RegisterService registerService;
	
	
	@PostMapping(value="/register")
	 public ResponseEntity<?> postMovie(@RequestBody Register register)
	 {
		Register registreduser = registerService.registerUser(register);
		 ResponseEntity responseEntity = new ResponseEntity<Register>(registreduser, HttpStatus.CREATED);
		 
		 return responseEntity;
	 }

}
