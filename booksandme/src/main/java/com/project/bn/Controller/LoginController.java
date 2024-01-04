package com.project.bn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bn.Entity.LoginEntity;
import com.project.bn.Service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService ls;
	@GetMapping("/login")
	public List<LoginEntity> getLoginDetails(){
		return ls.getLoginDetails();
	}
}
