package com.ku.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ku.api.entity.Grade;

@Service
public class GradeService {

	private static Map<Integer, Grade> gradeMap = new HashMap<Integer, Grade>();
	
	public GradeService() {
		gradeMap.put(1, new Grade(1,10));
		gradeMap.put(2, new Grade(2,12));
		gradeMap.put(3, new Grade(3,13));
	}
	
	public List<Grade> getAll(){
		return new ArrayList<Grade>(gradeMap.values());
	}
	
	public void add(Grade grade) {
		gradeMap.put(grade.getId(), grade);
	}
	
	public Grade find(Integer id) {
		return gradeMap.get(id);
	}
}
