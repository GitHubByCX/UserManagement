package com.um.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.um.dao.impl.StudentDaoImpl;
import com.um.entity.Student;
import com.um.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Resource
	private StudentDaoImpl daoimpl;

	@Override
	public List<Student> findAllStudent() {
		return daoimpl.findAllStudent();
	}

	@Override
	public Student findOneStudent(Integer id) {
		return daoimpl.findOneStudent(id);
	}

	@Override
	public void update(Student stu) {
		daoimpl.update(stu);
	}	

}
