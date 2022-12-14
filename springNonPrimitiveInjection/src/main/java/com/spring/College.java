package com.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class College {
	private List<String> department;
	private Set<String> dept_code;
	private HashMap<String, String> course;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(List<String> department, Set<String> dept_code, HashMap<String, String> course) {
		super();
		this.department = department;
		this.dept_code = dept_code;
		this.course = course;
	}

	@Override
	public String toString() {
		return "College [department=" + department + ", dept_code=" + dept_code + ", course=" + course + "]";
	}

	public List<String> getDepartment() {
		return department;
	}

	public void setDepartment(List<String> department) {
		this.department = department;
	}

	public Set<String> getDept_code() {
		return dept_code;
	}

	public void setDept_code(Set<String> dept_code) {
		this.dept_code = dept_code;
	}

	public HashMap<String, String> getCourse() {
		return course;
	}

	public void setCourse(HashMap<String, String> course) {
		this.course = course;
	}

}
