package com.UM.action;

import java.util.List;

import javax.annotation.Resource;

import com.UM.entity.Student;
import com.UM.service.StudentService;

public class StudentAction {
	
	private List<Student> list;
	
	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Resource(name = "student")
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
