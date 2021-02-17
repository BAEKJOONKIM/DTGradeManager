package com.metanetdt.manager.service;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetdt.manager.dao.ProfessorDAO;
import com.metanetdt.manager.dao.StudentDAO;
import com.metanetdt.manager.vo.RTPTTVO;
import com.metanetdt.manager.vo.RTVO;
import com.metanetdt.manager.vo.RegisterVO;
import com.metanetdt.manager.vo.StudentVO;
import com.metanetdt.manager.vo.TPVO;
import com.metanetdt.manager.vo.TTTPVO;
import com.metanetdt.manager.vo.TTTVO;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private ProfessorDAO professorDAO;

	/**
	 * 이번학기 모든 교과목 조회
	 */
	public Collection<TTTPVO> getAllTeaching(int year, String semester) {
		Collection<TTTPVO> allTeachings = studentDAO.getTeachingList(year, semester);

		return allTeachings;
	}

	/**
	 * 수강신청시 겹치는 시간 확인
	 */
	public boolean checkTimes(String id, int year, String semester, String day, int period) {
		boolean result = true;
		if(studentDAO.getSameTime(day, period, year, semester, id).size()>0){
			return false;
		}

		return result;
	}

	/**
	 * 수강신청
	 */
	public boolean register(RegisterVO vo, String id) {
		boolean result = true;
		// 신청중인학생수가 정원보다 많으면 취소
		int current = studentDAO.getCurrentCount(vo.getTeachingNo());
		Collection<TTTVO> temp = professorDAO.getSubjectDetail(vo.getTeachingNo());

		int limit = 1000;
		for (TTTVO t : temp) {
			limit = t.getHeadCount();
			if(limit<=current) return false;
			if(checkTimes(id, t.getTeachYear(), t.getTeachSemester(), t.getDay(), t.getPeriod())==false){
				return false;
			}
		}
		studentDAO.addRegister(vo);
		System.out.println(vo.getStudentId()+vo.getStudentId());
		return result;
	}
	
	/**
	 * 수강취소
	 * */
	public void registerCancel(int registerNo){
		studentDAO.deleteRegister(registerNo);
	}
	
	/**
	 * 학생정보
	 * */
	public StudentVO getStudent(String id){
		StudentVO vo = studentDAO.getStudent(id);
		return vo;
				
	}
	
	public int getRegisterNo(String studentId, int teachingNo){
		int regiNo = studentDAO.getRegisterNo(studentId, teachingNo);
		
		return regiNo;
	}
	
	public Collection<RTPTTVO> getRegisteredList(int year, String semester, String Id) {
		Collection<RTPTTVO> registeredList = studentDAO.getRegisteredList(year, semester, Id);

		return registeredList;
	}
	public Collection<RTVO> getCurrentScoreList(int year, String semester, String Id) {
		Collection<RTVO> currentScoreList = studentDAO.getCurrentScoreList(year, semester, Id);
		
		return currentScoreList;
	}
	
	public Collection<RTVO> getTotalScore(String Id) {
		Collection<RTVO> totalScore = studentDAO.getTotalScore(Id);
		
		return totalScore;
	}
	
	public String getProfName(String id){
		String name = studentDAO.getProfessorName(id);
		return name;
	}
	
	

}