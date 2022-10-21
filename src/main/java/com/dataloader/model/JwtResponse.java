package com.dataloader.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private final String message;

	public JwtResponse(String jwttoken,String message) {
		this.jwttoken = jwttoken;
		this.message = message;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getJwttoken() {
		return jwttoken;
	}

	public String getMessage() {
		return message;
	}
	
	
}