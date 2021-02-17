package com.metanetdt.manager.vo;

public class TeachingVO {
	private int teachingNo;
	private String subjectName;
	private int headCount;
	private int point;
	private float totalScore;
	private int teachYear;
	private String teachSemester;
	private float aRatio;
	private float bRatio;
	private float cRatio;
	private float dRatio;
	private String subjectCode;
	private String professorId;
	//constructor
	public TeachingVO() {}
	public TeachingVO(int teachingNo, String subjectName, int headCount, int point, float totalScore, int teachYear,
			String teachSemester, float aRatio, float bRatio, float cRatio, float dRatio, String subjectCode,
			String professorId) {
		this.teachingNo = teachingNo;
		this.subjectName = subjectName;
		this.headCount = headCount;
		this.point = point;
		this.totalScore = totalScore;
		this.teachYear = teachYear;
		this.teachSemester = teachSemester;
		this.aRatio = aRatio;
		this.bRatio = bRatio;
		this.cRatio = cRatio;
		this.dRatio = dRatio;
		this.subjectCode = subjectCode;
		this.professorId = professorId;
	}
	//getter setter
	public int getTeachingNo() {
		return teachingNo;
	}
	public void setTeachingNo(int teachingNo) {
		this.teachingNo = teachingNo;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getHeadCount() {
		return headCount;
	}
	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public float getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(float totalScore) {
		this.totalScore = totalScore;
	}
	public int getTeachYear() {
		return teachYear;
	}
	public void setTeachYear(int teachYear) {
		this.teachYear = teachYear;
	}
	public String getTeachSemester() {
		return teachSemester;
	}
	public void setTeachSemester(String teachSemester) {
		this.teachSemester = teachSemester;
	}
	public float getaRatio() {
		return aRatio;
	}
	public void setaRatio(float aRatio) {
		this.aRatio = aRatio;
	}
	public float getbRatio() {
		return bRatio;
	}
	public void setbRatio(float bRatio) {
		this.bRatio = bRatio;
	}
	public float getcRatio() {
		return cRatio;
	}
	public void setcRatio(float cRatio) {
		this.cRatio = cRatio;
	}
	public float getdRatio() {
		return dRatio;
	}
	public void setdRatio(float dRatio) {
		this.dRatio = dRatio;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getProfessorId() {
		return professorId;
	}
	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}
	//toString
	@Override
	public String toString() {
		return "TeachingVO [teachingNo=" + teachingNo + ", subjectName=" + subjectName + ", headCount=" + headCount
				+ ", point=" + point + ", totalScore=" + totalScore + ", teachYear=" + teachYear + ", teachSemester="
				+ teachSemester + ", aRatio=" + aRatio + ", bRatio=" + bRatio + ", cRatio=" + cRatio + ", dRatio="
				+ dRatio + ", subjectCode=" + subjectCode + ", professorId=" + professorId + "]";
	}
	
	
}
