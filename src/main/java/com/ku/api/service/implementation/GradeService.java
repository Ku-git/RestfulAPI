package com.ku.api.service.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ku.api.entity.Grade;
import com.ku.api.model.GradeModel;
import com.ku.api.service.IGradeService;

@Service
public class GradeService implements IGradeService {

	private static Map<Integer, Grade> gradeMap = new HashMap<Integer, Grade>();
	
	public GradeService() {
		gradeMap.put(1, new Grade(1,10));
		gradeMap.put(2, new Grade(2,12));
		gradeMap.put(3, new Grade(3,13));
	}
	
	public List<GradeModel> getAll(){
		List<GradeModel> list = new ArrayList<GradeModel>();
		for(Grade grade :gradeMap.values()) {
			GradeModel model = new GradeModel();
			model.setId(grade.getId());
			model.setGradeNum(grade.getGradeNum());
			list.add(model);
		}
		return list;
	}
	
	public void add(Grade grade) {
		gradeMap.put(grade.getId(), grade);
	}
	
	public GradeModel find(Integer id) {
		Grade grade = gradeMap.get(id);
		GradeModel model = new GradeModel();
		model.setId(grade.getId());
		model.setGradeNum(grade.getGradeNum());
		return model;
	}
}
