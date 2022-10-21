package com.dataloader.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

import com.dataloader.validations.ValidPassword;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.*;

import io.jsonwebtoken.Jwts;

public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	@NonNull
    @Email
    @NotBlank(message = "username is mandatory")
   	private String username;
	
	@ValidPassword
    @NonNull
    @NotBlank(message = "password is mandatory")
    private String password;

	
	//need default constructor for JSON Parsing
	public JwtRequest()
	{
		
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
		
	
	
	
	
}