package com.metanetdt.manager.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.metanetdt.manager.vo.ProfessorVO;
import com.metanetdt.manager.vo.StudentVO;

@Repository
public interface LoginDAO {
	
	public ProfessorVO professorLogin(ProfessorVO vo);
	
	public StudentVO studentLogin(StudentVO vo);
	
}
