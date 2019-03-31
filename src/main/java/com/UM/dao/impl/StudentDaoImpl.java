package com.UM.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.UM.dao.studenDao;
import com.UM.entity.Student;

@Repository
public class StudentDaoImpl implements studenDao {
	
	@Resource
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findAllStudent() {
		String sql = "select stu from "+Student.class.getName()+" stu";
		return (List<Student>) sessionFactory.getCurrentSession().createQuery(sql).list();
	}

	@Override
	public Student findOneStudent(Integer id) {
		return (Student) sessionFactory.getCurrentSession().load(Student.class, id);
	}

	@Override
	public void update(Student stu) {
		sessionFactory.getCurrentSession().update(stu);
	}

}
