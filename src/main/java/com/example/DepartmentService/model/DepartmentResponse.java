package com.example.DepartmentService.model;

public class DepartmentResponse {
	private String dName;

	public DepartmentResponse(String dName) {

		this.dName = dName;
	}

	public DepartmentResponse() {
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "DepartmentResponse [dName=" + dName + "]";
	}

	
}
