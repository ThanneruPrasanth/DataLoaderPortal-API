package com.dataloader.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dataloader.model.UserModel;
import com.dataloader.repository.UserRepository;
import com.dataloader.service.UserService;

import io.jsonwebtoken.Jwts;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String saveUser(UserModel user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setLoged_in(new Date());
		 UserModel userResponse=userRepository.save(user);

		return "User Saved Successfully with id:" + userResponse.getUserID();

	}

	@Override
	public UserModel getUserWithUserName(String userName) {

		UserModel userResponse = userRepository.findByUsername(userName);
		return userResponse;

	}

	public String generateJwtToken(String userName, String passWord) {
		String token = Jwts.builder().claim(userName, userName).claim(passWord, passWord).setSubject(userName)
				.setId(UUID.randomUUID().toString()).setIssuedAt(new Date(System.currentTimeMillis())).compact();
		System.out.println(token);
		return token;

	}

}
