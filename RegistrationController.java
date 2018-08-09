package com.fidelis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fidelis.bean.AccountBean;
import com.fidelis.bean.RegistrationBean;

@RestController
@CrossOrigin // allow Cross Origin request
public class RegistrationController {
	@Autowired
	RegistrationBean registerBean;

	@GetMapping(value = "/getFormDetails")
	public RegistrationBean registrationFormDetails() {
		registerBean.setUserName("Gaurav");
		registerBean.setEmail("gauri.airi@swoutsourcing.com");
		registerBean.setPassword("gaurav");
		registerBean.setConfirmPassword("gaurav");
		registerBean.setSelectedGender("Male");
		return registerBean;
	}

	@PostMapping(value = "/submitAccountForm")
	public AccountBean accountInformation(@RequestBody AccountBean bean) {
		return bean;
	}

}
