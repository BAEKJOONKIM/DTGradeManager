package com.metanetdt.manager.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.metanetdt.manager.service.StudentService;
import com.metanetdt.manager.vo.RTPTTVO;
import com.metanetdt.manager.vo.RTVO;
import com.metanetdt.manager.vo.RegisterVO;
import com.metanetdt.manager.vo.StudentVO;
import com.metanetdt.manager.vo.TTTPVO;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/register")
	public String registerPage(HttpServletRequest request){
		String result="register";
		if(request.getSession(true).getAttribute("user")==null)return "home";
		Collection<TTTPVO> all = studentService.getAllTeaching(2021, "1");
		
		Collection<TTTPVO> res = new ArrayList<TTTPVO>();
		if(all!=null){
			HashMap<String, String> map = new HashMap<>();
			for(TTTPVO t : all){
				String code=t.getSubjectCode();
				if(map.get(code)!=null){
					map.put(code, map.get(code)+t.getDay()+t.getPeriod());
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
	
	@RequestMapping(value="/registerAction", method=RequestMethod.GET)
	public String registerAction(HttpServletRequest request){
		String result="register";
		HttpSession session = request.getSession(true);
		String id=((StudentVO)session.getAttribute("user")).getStudentId();
		RegisterVO vo = new RegisterVO();
		
		vo.setStudentId(id);
		vo.setTeachingNo(Integer.parseInt(request.getParameter("teachNo")));
		studentService.register(vo,id);
		registerPage(request);
		return result;
	}
	
	@RequestMapping("/registerCancel")
	public String registerCancel(HttpServletRequest request){
		String result="register";
		int regiNo = Integer.parseInt(request.getParameter("registerNo"));
		studentService.registerCancel(regiNo);
		
		registerPage(request);
		return result;
	}
	///
	@RequestMapping("/registry")
	public String registryPage(HttpServletRequest request) {
		String result="registry";
		HttpSession session = request.getSession(true);
		String id = ((StudentVO)session.getAttribute("user")).getStudentId();
		Collection<RTPTTVO> all = studentService.getRegisteredList(2021, "1", id);
		Collection<RTPTTVO> res = new ArrayList<RTPTTVO>();
		if(all!=null){
			HashMap<String, String> map = new HashMap<>();
			for(RTPTTVO a : all){
				String code=a.getSubjectCode();
				if(map.get(code)!=null){
					map.put(code, map.get(code)+a.getDay()+a.getPeriod());
				}else{
					map.put(code, a.getDay()+a.getPeriod());
					res.add(a);
				}
			}
			request.setAttribute("list", res);
			request.setAttribute("code", map);
		}
		
		
	return result;	
	}
	
	@RequestMapping("/currentScore")
	public String currentScorePage (HttpServletRequest request) {
		String result="currentScore";
		HttpSession session = request.getSession(true);
		String id = ((StudentVO)session.getAttribute("user")).getStudentId();
		Collection<RTVO> all = studentService.getCurrentScoreList(2021, "1", id);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for(RTVO t : all){
			String pId = t.getProfessorId();
			String pName = studentService.getProfName(pId);
			System.out.println(pName);
			HashMap<String, Object> map = new HashMap<>();
			map.put("cScore", t);
			map.put("pName", pName);
			list.add(map);
			
		}
		if(all!=null) {
			request.setAttribute("list", list);
		}
		
	return result;
	}
	
	@RequestMapping("/totalScore")
	public String totalScorePage (HttpServletRequest request) {
		String result="totalScore";
		HttpSession session = request.getSession(true);
		String id = ((StudentVO)session.getAttribute("user")).getStudentId();
		
		Collection<RTVO> all = studentService.getTotalScore(id);
		
		if(all!=null) {
			request.setAttribute("list", all);
		}
		
	return result;
	}
	
	
}
