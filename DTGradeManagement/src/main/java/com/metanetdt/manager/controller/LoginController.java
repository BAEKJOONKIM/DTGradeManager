package com.metanetdt.manager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metanetdt.manager.service.LoginService;
import com.metanetdt.manager.vo.ProfessorVO;
import com.metanetdt.manager.vo.StudentVO;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	
	@RequestMapping(value="/loginAction", method = RequestMethod.POST)
	public String home(HttpServletRequest request){
		String result = "home";
		if(request.getParameter("who").equals("p")){
			result=pLoginAction(request);
		}
		if(request.getParameter("who").equals("s")){
			result=sLoginAction(request);
		}
		return result;
	}
	
	@RequestMapping(value="/pLoginAction", method = RequestMethod.POST)
	public String pLoginAction(HttpServletRequest request){
		String result = "home";
		ProfessorVO prof = loginService.professorLogin(request.getParameter("id"), request.getParameter("pw"));
		if(prof != null){
			HttpSession session = request.getSession(true);
			session.setAttribute("user", prof);
			
			result="test";
		}
		
		return result;
	}
	
	@RequestMapping(value="/sLoginAction", method = RequestMethod.POST)
	public String sLoginAction(HttpServletRequest request){
		String result="home";
		StudentVO stud = loginService.studentLogin(request.getParameter("id"), request.getParameter("pw"));
		if(stud != null){
			HttpSession session = request.getSession(true);
			session.setAttribute("user", stud);
			
			result="test";
		}
		
		return result;
	}
	
	@RequestMapping("/logoutAction")
	public String logout(HttpServletRequest request){
		String result="home";
		HttpSession session = request.getSession(true);
		session.invalidate();
		
		return result;
	}
	
}
