package com.ku.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ku.api.entity.Grade;
import com.ku.api.model.GradeModel;
import com.ku.api.service.implementation.GradeService;

@RestController
public class APIController {
	
	@Autowired
	private GradeService gradeService;

	@RequestMapping("/grades")
	public List<GradeModel> hello() {
		return gradeService.getAll();
	}
	
	@GetMapping("/grades/{id}")
	public GradeModel getById(@PathVariable Integer id) {
		return gradeService.find(id);
	}

	@PostMapping("/grades")
	public void add(@RequestBody Grade grade) {
		gradeService.add(grade);
	}
	
	@GetMapping("/toAdd")
	public ModelAndView addPage() {
		return new ModelAndView("addPage.jsp");
	}
	
}
