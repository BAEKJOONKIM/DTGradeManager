package com.metanetdt.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetdt.manager.dao.LoginDAO;
import com.metanetdt.manager.vo.ProfessorVO;
import com.metanetdt.manager.vo.StudentVO;

@Service
public class LoginService {
	@Autowired
	private LoginDAO loginDAO;
	
	public StudentVO studentLogin(String id, String pw){
		StudentVO vo = new StudentVO();
		vo.setStudentId(id);
		vo.setPw(pw);
		StudentVO result = loginDAO.studentLogin(vo);
		
		return result;
	}
	
	public ProfessorVO professorLogin(String id, String pw){
		ProfessorVO vo = new ProfessorVO();
		vo.setProfessorId(id);
		vo.setPw(pw);
		ProfessorVO result = loginDAO.professorLogin(vo);
		return result;
	}
}
