package com.metanetdt.manager.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.metanetdt.manager.vo.RTSVO;
import com.metanetdt.manager.vo.TTTVO;
import com.metanetdt.manager.vo.TeachingVO;

@Repository
public interface ProfessorDAO {
	
	public String getSameTime(@Param("day")String day, @Param("period")int period, @Param("professorId")String id);
	
	public int addSubject(TeachingVO vo);
	public Collection<Integer> getEmpty(@Param("professorId")String id);
	public void addTime(@Param("day")String day,@Param("period")int period,@Param("teachingNo")int teachingNo);
	
	public Collection<TTTVO> getSubjectList(@Param("teachYear")int year,@Param("teachSemester")String semester,@Param("professorId")String id);
	
	public Collection<TTTVO> getSubjectDetail(@Param("teachingNo")int teachingNo);
	
	public Collection<RTSVO> getStudentList(@Param("teachingNo")int teachingNo);
	
	public void setMiddleScore(@Param("middle")float middle, @Param("registerNo")int registerNo);
	public void setFinalScore(@Param("finals")float finals, @Param("registerNo")int registerNo);
	public void setReportScore(@Param("report")float report, @Param("registerNo")int registerNo);
	public void setAttendScore(@Param("attend")float attend, @Param("registerNo")int registerNo);
	public void setGrade(@Param("grade")String grade, @Param("registerNo")int registerNo);
	
	public void deleteSubject(@Param("teachingNo")int teachingNo);
	
	public String getSubjectCode(@Param("teachingNo")int teachingNo);
}
