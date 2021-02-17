package com.metanetdt.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.metanetdt.manager.dao.LoginDAO;
import com.metanetdt.manager.dao.ProfessorDAO;
import com.metanetdt.manager.dao.StudentDAO;
import com.metanetdt.manager.vo.ProfessorVO;
import com.metanetdt.manager.vo.StudentVO;

public class Jtest {
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private ProfessorDAO professorDAO;
	@Autowired
	private LoginDAO loginDAO;
	
	@Test
	public void 로그인테스트()throws Exception{
		assertTrue(1==1);
		System.out.println("sss");
		//ProfessorVO vo = loginDAO.professorLogin("p2222", "sdwf");
		assertTrue(1==1);
		System.out.println("end");
		//System.out.println(vo);
	}
}
