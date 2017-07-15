package com.mcan.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcan.login.service.LoginService;
import com.mcan.model.Login;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/login")
	public List<Login> getLoginDetails(){
		return loginService.getLoginDetails();
	}

}
