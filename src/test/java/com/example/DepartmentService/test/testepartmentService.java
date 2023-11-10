package com.example.DepartmentService.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.DepartmentService.entity.Department;
import com.example.DepartmentService.model.DepartmentResponse;
import com.example.DepartmentService.repository.DepartmentRepository;
import com.example.DepartmentService.service.DepartmentServiceImpl;

@ExtendWith(MockitoExtension.class)
public class testepartmentService {
	@Mock
	private DepartmentRepository repo;

	@InjectMocks
	private DepartmentServiceImpl service;

	@Test
	void testSaveDepartment() {
		DepartmentResponse inputResponse = new DepartmentResponse();
		inputResponse.setdName("TestDepartment");

		Department savedDepartment = new Department();
		savedDepartment.setdName("TestDepartment");
		when(repo.save(savedDepartment)).thenReturn(savedDepartment);

		DepartmentResponse savedResponse = service.savinData(inputResponse);

		assertEquals("TestDepartment", savedResponse.getdName());
		verify(repo, times(1)).save(savedDepartment);

	}
}
