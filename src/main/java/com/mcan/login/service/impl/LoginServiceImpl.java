package com.mcan.login.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcan.dto.LoginDTO;
import com.mcan.login.repository.LoginRepository;
import com.mcan.login.service.LoginService;
import com.mcan.model.Login;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginrepo;
	
	@Override
	public List<Login> getLoginDetails() {
		return loginrepo.findAll();
		
	}

}
