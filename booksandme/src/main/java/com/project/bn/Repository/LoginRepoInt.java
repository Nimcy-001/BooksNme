package com.project.bn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bn.Entity.LoginEntity;
@Repository
public interface LoginRepoInt extends JpaRepository<LoginEntity, String> {

}
