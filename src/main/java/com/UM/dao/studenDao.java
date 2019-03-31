package com.UM.dao;

import java.util.List;

import com.UM.entity.Student;

public interface studenDao {
	
	public List<Student> findAllStudent();
	
	public Student findOneStudent(Integer id);
	
	public void update(Student stu);

}
