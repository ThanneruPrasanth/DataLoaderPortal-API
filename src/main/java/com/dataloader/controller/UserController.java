package com.dataloader.controller;

import java.util.Date;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dataloader.model.UserModel;
import com.dataloader.repository.UserRepository;
import com.dataloader.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("/ec2-34-239-0-92.compute-1.amazonaws:4200")
public class UserController {
	
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired(required = true)
	private UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<?> saveUser(@RequestBody UserModel user) throws Exception{
		
		UserModel userData = userRepo.findByUsername(user.getUsername());
		String response=null;
		if(userData == null) {			
			
	        user.setLoged_in(new Date());
	        response=userService.saveUser(user);
				
		} else {	
			
			response="User AlredayExists";
			return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
		}
		

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/login/{userName}")
	public ResponseEntity<?> getUserByUserName(@PathParam("userName") String userName){
		UserModel user=userService.getUserWithUserName(userName);
		
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
