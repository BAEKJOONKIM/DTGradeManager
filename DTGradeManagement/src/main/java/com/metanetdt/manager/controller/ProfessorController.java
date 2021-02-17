package com.metanetdt.manager.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.metanetdt.manager.service.ProfessorService;
import com.metanetdt.manager.service.StudentService;
import com.metanetdt.manager.vo.ProfessorVO;
import com.metanetdt.manager.vo.RTSVO;
import com.metanetdt.manager.vo.RegisterVO;
import com.metanetdt.manager.vo.StudentVO;
import com.metanetdt.manager.vo.TPVO;
import com.metanetdt.manager.vo.TTTPVO;
import com.metanetdt.manager.vo.TTTVO;
import com.metanetdt.manager.vo.TeachingVO;


@Controller
public class ProfessorController {
	@Autowired
	private ProfessorService professorService;
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/pSubjectRegister")
	public String registerPage(HttpServletRequest request){
		String result="pRegister";
		
		return result;
	}
	@RequestMapping("/pSubjectList")
	public String subjectList(HttpServletRequest request){
		String result = "pSubjects";
		HttpSession session = request.getSession(true);
		if(session.getAttribute("user")==null)return "home";
		String id = ((ProfessorVO)session.getAttribute("user")).getProfessorId();
		int year=Integer.parseInt(request.getParameter("teachYear"));
		String semester=request.getParameter("teachSemester");
		
		Collection<TTTVO> all = professorService.getAllSubjects(id, year, semester);
		Collection<TTTVO> res = new ArrayList<>();

		if(all!=null){
			HashMap<String, String> map = new HashMap<>();
			for(TTTVO t : all){
				String code = t.getSubjectCode();
				if(map.get(code)!=null){
					map.put(code,map.get(code)+t.getDay()+t.getPeriod());
				}else{
					map.put(code, t.getDay()+t.getPeriod());
					res.add(t);
				}
			}
			request.setAttribute("code", map);
			request.setAttribute("list", res);
		}
		
		return result;
	}
	
	
	@RequestMapping("/pSubjectRegisterAction")
	public String pRegisterAction(HttpServletRequest request){
		String result="pSubjectList";
		HttpSession session = request.getSession(true);
		ProfessorVO prof = (ProfessorVO)session.getAttribute("user");
		if(prof==null)return "home";
		TeachingVO vo = new TeachingVO();
		vo.setSubjectName(request.getParameter("subjectName"));
		vo.setHeadCount(Integer.parseInt(request.getParameter("headCount")));
		vo.setTotalScore(Float.parseFloat(request.getParameter("totalScore")));
		vo.setTeachYear(2021);
		vo.setTeachSemester("1");
		vo.setaRatio(Float.parseFloat(request.getParameter("aRatio")));
		vo.setbRatio(Float.parseFloat(request.getParameter("bRatio")));
		vo.setcRatio(Float.parseFloat(request.getParameter("cRatio")));
		vo.setdRatio(Float.parseFloat(request.getParameter("dRatio")));
		vo.setSubjectCode(request.getParameter("subjectCode"));
		vo.setProfessorId(prof.getProfessorId());
		vo.setPoint(Integer.parseInt(request.getParameter("point")));
		String d1=request.getParameter("day1");
		int p1=Integer.parseInt(request.getParameter("period1"));
		String d2=request.getParameter("day2");
		int p2=Integer.parseInt(request.getParameter("period2"));
		professorService.pSubjectRegister(vo,d1,p1,d2,p2);
		
		return "pRegisterOK";
	}
	
	@RequestMapping("/pSubjectStudents")
	public String pStudents(HttpServletRequest request){
		String result="pSubjectStudents";
		Collection<RTSVO> list = professorService.getStudents(Integer.parseInt(request.getParameter("teachNo")));
		
		request.setAttribute("list", list);
		return result;
	}
	
	@RequestMapping("/pScoreEnter")
	public String pScoreEnter(HttpServletRequest request){
		String result="pScoreEnter";
		String studentId=request.getParameter("studentId");
		int teachingNo=Integer.parseInt(request.getParameter("teachNo"));
		StudentVO student = studentService.getStudent(studentId);
		String subjectCode = professorService.getSubDetail(teachingNo);
		request.setAttribute("student", student);
		request.setAttribute("code", subjectCode);
		request.setAttribute("teachNo", teachingNo);
		return result;
	}
	
	@RequestMapping("/pScoreEnterAction")
	public String pEnterAction(HttpServletRequest request){
		String result="pEnterOK";

		int teachingNo=Integer.parseInt(request.getParameter("teachNo"));
		String id = request.getParameter("studentId");

		int regiNo = studentService.getRegisterNo(id,teachingNo);

		RegisterVO vo = new RegisterVO();
		vo.setRegisterNo(regiNo);
		vo.setMiddle(Float.parseFloat(request.getParameter("middle")));
		vo.setFinals(Float.parseFloat(request.getParameter("finals")));
		vo.setReport(Float.parseFloat(request.getParameter("report")));
		vo.setAttend(Float.parseFloat(request.getParameter("attend")));
		
		professorService.enterScores(vo);
		request.setAttribute("teachNo", teachingNo);
		
		
		return result;
	}
	
	
	
}
