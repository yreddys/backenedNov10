package com.example.DepartmentService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DepartmentService.entity.Department;
import com.example.DepartmentService.model.DepartmentResponse;
import com.example.DepartmentService.repository.DepartmentRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentRepository repo;

	@Autowired
	DepartmentServiceImpl(DepartmentRepository repo) {
		this.repo = repo;
	}

	 @Override
	    public DepartmentResponse savinData(DepartmentResponse departmentResponse) {
	        log.info("Saving department data...{}",departmentResponse);

	        Department department = new Department();
	        department.setdName(departmentResponse.getdName());
	        
	        log.debug("Department data set: {}", department);

	        Department savedDepartment = repo.save(department);
	        
	        log.info("Department data saved successfully.{}" ,department);

	        DepartmentResponse savedDepartmentResponse = new DepartmentResponse();
	        savedDepartmentResponse.setdName(savedDepartment.getdName());

	        log.debug("Saved department response: {}", savedDepartmentResponse);

	        return savedDepartmentResponse;
	    }
	}

