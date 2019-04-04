package com.um.dao;

import java.util.List;

import com.um.entity.Student;

public interface StudentDao {
	
	public List<Student> findAllStudent();
	
	public Student findOneStudent(Integer id);
	
	public void update(Student stu);

}
