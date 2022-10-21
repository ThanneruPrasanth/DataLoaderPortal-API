package com.dataloader.common;


public class GenericResponse<T> {
	
	private boolean success;
	private T data;
	private String message;
	
	public GenericResponse() {}
	
	public GenericResponse(boolean success, T data, String message) {
		this.success = success;
		this.data = data;
		this.message = message;
	}

}
