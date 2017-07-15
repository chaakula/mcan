package com.mcan.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcan.model.Login;

@Repository 
public interface LoginRepository extends JpaRepository<Login,Long>{
	
}
