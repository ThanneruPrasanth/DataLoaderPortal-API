package com.dataloader.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "user_model")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;

	private String username;

	private String password;
	
	private String role;
	
	private Date loged_in;

}
