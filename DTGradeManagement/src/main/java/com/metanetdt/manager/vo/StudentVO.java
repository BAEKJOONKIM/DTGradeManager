package com.metanetdt.manager.vo;

public class StudentVO {
   
   private String studentId;
   private String name;
   private String phoneId;
   private String gender;
   private String email;
   private String pw;
         
   public StudentVO(){}
   
   public StudentVO(String studentId, String name, String phoneId, String gender, String email, String pw) {
      this.studentId = studentId;
      this.name = name;
      this.phoneId = phoneId;
      this.gender = gender;
      this.email = email;
      this.pw = pw;
   }

   public String getStudentId() {
      return studentId;
   }

   public void setStudentId(String studentId) {
      this.studentId = studentId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPhoneId() {
      return phoneId;
   }

   public void setPhoneId(String phoneId) {
      this.phoneId = phoneId;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPw() {
      return pw;
   }

   public void setPw(String pw) {
      this.pw = pw;
   }

   @Override
   public String toString() {
      return "StudentVO [studentId=" + studentId + ", name=" + name + ", phoneId=" + phoneId + ", gender="
            + gender + ", email=" + email + ", pw=" + pw + "]";
   }


   
   
   
         
}