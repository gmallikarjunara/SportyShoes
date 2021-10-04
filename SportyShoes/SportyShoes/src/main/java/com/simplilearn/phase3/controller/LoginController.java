package com.simplilearn.phase3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.phase3.dao.LoginDAO;
import com.simplilearn.phase3.model.Login;

@Controller
public class LoginController {
	
	@Autowired
	LoginDAO login;
	
	@GetMapping("/ListLogin")
	public String ListLogin(Model model)
	{
		List<Login> log = login.getCredentials();
		model.addAttribute("log", log);
		
		return "ListLogin";
	}

}
