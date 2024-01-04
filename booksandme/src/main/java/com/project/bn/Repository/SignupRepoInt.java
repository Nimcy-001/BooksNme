package com.project.bn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bn.Entity.SignupEntity;
@Repository
public interface SignupRepoInt extends JpaRepository<SignupEntity, String> {

}
