package com.um.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.um.entity.Student;
import com.um.service.StudentService;

public class UpdateAction {
	
	@Resource
	private StudentService service;
	
	public String toupdate() {
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println("id="+request.getParameter("id"));
		int _id = Integer.valueOf(request.getParameter("id"));
		stu = service.findOneStudent(_id);
		return "success";
	}
	
	public String update() {
		service.update(new Student(id, name, studentId, phoneNumber, className, hostel));
		return "success";
	}
	
	//
	private Student stu;

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	//
	private Integer id;
	private String name;
	private String studentId;
	private String phoneNumber;
	private String className;
	private String hostel;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getHostel() {
		return hostel;
	}

	public void setHostel(String hostel) {
		this.hostel = hostel;
	}

}
