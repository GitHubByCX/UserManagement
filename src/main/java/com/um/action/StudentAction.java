package com.um.action;

import java.util.List;

import javax.annotation.Resource;

import com.um.entity.Student;
import com.um.service.StudentService;

public class StudentAction {
	
	private List<Student> list;
	
	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Resource
	private StudentService service;
	
	public String toindex(){
		String result = "error";
		list = service.findAllStudent();
		/*for(Student s : list) {
			System.out.println(s.toString());
		}*/
		if (list!=null) {
			result = "success";
		}
		return result;
	}

}
