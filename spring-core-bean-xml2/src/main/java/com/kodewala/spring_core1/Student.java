package com.kodewala.spring_core1;

public class Student {
  private int RollNo;
  private String name;
  private String section;
  public int getRollNo() {
	return RollNo;
  }
  public void setRollNo(int rollNo) {
	RollNo = rollNo;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getSection() {
	return section;
  }
  public void setSection(String section) {
	this.section = section;
  }
}
