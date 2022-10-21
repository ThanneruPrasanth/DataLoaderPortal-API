package com.dataloader.common;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

import com.dataloader.validations.ValidPassword;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDTO {
	
	@NonNull
    @Email
    @NotBlank(message = "username is mandatory")
   	private String username;
	
	@ValidPassword
    @NonNull
    @NotBlank(message = "password is mandatory")
    private String password;

	
}
