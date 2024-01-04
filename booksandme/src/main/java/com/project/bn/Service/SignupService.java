package com.project.bn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bn.Entity.SignupEntity;
import com.project.bn.Repository.SignupRepoInt;
@Service
public class SignupService implements SignupServiceInt {
	@Autowired
	private SignupRepoInt sr;
	@Override
	public List<SignupEntity> getSignupDetails() {
		return sr.findAll();
	}

}
