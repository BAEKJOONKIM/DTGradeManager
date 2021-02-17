package com.metanetdt.manager.service;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetdt.manager.dao.ProfessorDAO;
import com.metanetdt.manager.vo.RTSVO;
import com.metanetdt.manager.vo.RegisterVO;
import com.metanetdt.manager.vo.TTTVO;
import com.metanetdt.manager.vo.TeachingVO;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorDAO professorDAO;
	
	public Collection<TTTVO> getAllSubjects(String id, int year, String semester){
		Collection<TTTVO> result = professorDAO.getSubjectList(year, semester, id);
		return result;
	}
	
	public void pSubjectRegister(TeachingVO vo,String day1, int period1, String day2, int period2){
		professorDAO.addSubject(vo);
		Collection<Integer> temp =(professorDAO.getEmpty(vo.getProfessorId()));
		int tNo=1;
		for(int t : temp){
			if(t>=tNo){
				tNo=t;
			}
		}
		professorDAO.addTime(day1, period1, tNo);
		professorDAO.addTime(day2, period2, tNo);
	}
	
	public Collection<RTSVO> getStudents(int teachingNo){
		Collection<RTSVO> temp = professorDAO.getStudentList(teachingNo);
		
		return temp;
	}
	
	public String getSubDetail(int teachingNo){
		String code = professorDAO.getSubjectCode(teachingNo);
		
		return code;
	}
	
	public void enterScores(RegisterVO vo){
		professorDAO.setMiddleScore(vo.getMiddle(), vo.getRegisterNo());
		professorDAO.setFinalScore(vo.getFinals(), vo.getRegisterNo());
		professorDAO.setReportScore(vo.getReport(), vo.getRegisterNo());
		professorDAO.setAttendScore(vo.getAttend(), vo.getRegisterNo());
		
	}
}
