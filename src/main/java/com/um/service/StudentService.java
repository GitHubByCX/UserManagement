package com.um.service;

import java.util.List;

import com.um.entity.Student;

public interface StudentService {
	public List<Student> findAllStudent();
	
	public Student findOneStudent(Integer id);
	
	public void update(Student stu);
}
