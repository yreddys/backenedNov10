package com.example.DepartmentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DepartmentService.model.DepartmentResponse;
import com.example.DepartmentService.service.DepartmentService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class DepartmentController {
	private DepartmentService service;

	@Autowired
	DepartmentController(DepartmentService service) {
		this.service = service;
	}

	@PostMapping("/save")
	String saveDepartment(@RequestBody DepartmentResponse departmentResponse) {
		log.info("saving department :{}", departmentResponse);
		service.savinData(departmentResponse);
		return "saved data successfully";
	}
}
