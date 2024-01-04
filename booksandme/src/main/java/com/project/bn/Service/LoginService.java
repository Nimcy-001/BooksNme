package com.project.bn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bn.Entity.LoginEntity;
import com.project.bn.Repository.LoginRepoInt;
@Service
public class LoginService implements LoginServiceInt {
	@Autowired
	private LoginRepoInt lr;
	@Override
	public List<LoginEntity> getLoginDetails() {
		return lr.findAll();
	}

}
