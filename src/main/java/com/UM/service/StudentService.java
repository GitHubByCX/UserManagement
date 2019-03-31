package com.UM.service;

import java.util.List;

import com.UM.entity.Student;

public interface StudentService {
	public List<Student> findAllStudent();
	
	public Student findOneStudent(Integer id);
	
	public void update(Student stu);
}
