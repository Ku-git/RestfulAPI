package com.ku.api.service;

import java.util.List;

import com.ku.api.entity.Grade;
import com.ku.api.model.GradeModel;

public interface IGradeService {
	
	public List<GradeModel> getAll();
	
	public void add(Grade grade);
	
	public GradeModel find(Integer id);
}
