package com.project.bn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bn.Entity.SignupEntity;
import com.project.bn.Service.SignupService;

@RestController
public class SignupController {
	@Autowired
	private SignupService ss;
	@GetMapping("/signup")
	public List<SignupEntity> getSignupDetails(){
		return ss.getSignupDetails();
	}
}
