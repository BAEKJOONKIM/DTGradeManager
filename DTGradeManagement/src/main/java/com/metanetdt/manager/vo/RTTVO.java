package com.metanetdt.manager.vo;

public class RTTVO {
	private int registerNo;
	private float middle;
	private float finals;
	private float report;
	private float attend;
	private String grade;
	private String studentId;
	private int teachingNo;
	private String day;
	private int period;
	//constructor
	public RTTVO() {}
	public RTTVO(int registerNo, float middle, float finals, float report, float attend, String grade, String studentId,
			int teachingNo, String day, int period) {
		this.registerNo = registerNo;
		this.middle = middle;
		this.finals = finals;
		this.report = report;
		this.attend = attend;
		this.grade = grade;
		this.studentId = studentId;
		this.teachingNo = teachingNo;
		this.day = day;
		this.period = period;
	}
	//getter setter
	public int getRegisterNo() {
		return registerNo;
	}
	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}
	public float getMiddle() {
		return middle;
	}
	public void setMiddle(float middle) {
		this.middle = middle;
	}
	public float getFinals() {
		return finals;
	}
	public void setFinals(float finals) {
		this.finals = finals;
	}
	public float getReport() {
		return report;
	}
	public void setReport(float report) {
		this.report = report;
	}
	public float getAttend() {
		return attend;
	}
	public void setAttend(float attend) {
		this.attend = attend;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getTeachingNo() {
		return teachingNo;
	}
	public void setTeachingNo(int teachingNo) {
		this.teachingNo = teachingNo;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	//toString
	@Override
	public String toString() {
		return "RTTVO [registerNo=" + registerNo + ", middle=" + middle + ", finals=" + finals + ", report=" + report
				+ ", attend=" + attend + ", grade=" + grade + ", studentId=" + studentId + ", teachingNo=" + teachingNo
				+ ", day=" + day + ", period=" + period + "]";
	}
	
	
	
}
