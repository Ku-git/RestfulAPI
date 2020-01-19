package com.ku.api.entity;

public class Grade {
	
	private Integer id;
	private Integer gradeNum;
	
	public Grade(Integer id,Integer gradeNum) {
		this.id = id;
		this.gradeNum = gradeNum;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(Integer gradeNum) {
		this.gradeNum = gradeNum;
	}
	
	
}
