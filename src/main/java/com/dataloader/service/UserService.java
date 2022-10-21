package com.dataloader.service;

import org.springframework.stereotype.Service;

import com.dataloader.model.UserModel;

@Service
public interface UserService {
	
	public String saveUser(UserModel user);
	public UserModel getUserWithUserName(String userName);
}
