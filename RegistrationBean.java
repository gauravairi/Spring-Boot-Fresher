package com.fidelis.bean;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Component
@Getter
@Setter
public class RegistrationBean {
	
 private String userName;
 
 private  String password;

 private String email;

 private  String confirmPassword;

 private  String selectedGender;

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getConfirmPassword() {
	return confirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}

public String getSelectedGender() {
	return selectedGender;
}

public void setSelectedGender(String selectedGender) {
	this.selectedGender = selectedGender;
}


}