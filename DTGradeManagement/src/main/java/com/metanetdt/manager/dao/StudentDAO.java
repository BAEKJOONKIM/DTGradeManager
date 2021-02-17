package com.metanetdt.manager.dao;

import java.util.Collection;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.metanetdt.manager.vo.RTPTTVO;
import com.metanetdt.manager.vo.RTPVO;
import com.metanetdt.manager.vo.RTVO;
import com.metanetdt.manager.vo.RegisterVO;
import com.metanetdt.manager.vo.StudentVO;
import com.metanetdt.manager.vo.TPVO;
import com.metanetdt.manager.vo.TTTPVO;


@Repository
public interface StudentDAO {
	
	public Collection<TTTPVO> getTeachingList(@Param("teachYear")int year,@Param("teachSemester")String semester);
	
	public Collection<String> getSameTime(@Param("day")String day, @Param("period")int period, @Param("teachYear")int year, @Param("teachSemester")String semester,@Param("studentId")String id);
	
	public void addRegister(RegisterVO vo);
	
	public Collection<RTPTTVO> getRegisteredList(@Param("teachYear")int year,@Param("teachSemester")String semester,@Param("studentId")String id);
	
	public void deleteRegister(@Param("registerNo")int registerNo);
	
	public TPVO getRegisteredDetail(@Param("teachingNo")int teachingNo);
	
	public Collection<RTVO> getCurrentScoreList(@Param("teachYear")int year,@Param("teachSemester")String semester,@Param("studentId")String id);

	public RTPVO getScoreDetail(@Param("registerNo")int registerNo);
	
	public Collection<RTVO> getTotalScore(@Param("studentId")String id);
	
	public Collection<RTVO> getSemesterScores(@Param("teachYear")int year,@Param("teachSemester")String semester,@Param("studentId")String id);

	public int getCurrentCount(@Param("teachingNo")int teachingNo);
	
	public StudentVO getStudent(@Param("studentId")String id);
	
	public int getRegisterNo(@Param("studentId")String id, @Param("teachingNo")int teachingNo);
	
	public String getProfessorName(@Param("professorId")String id);
}





