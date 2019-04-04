package com.um.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="um_student")
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4481886703110961917L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="studentId",length=11)
	private String studentId;
	@Column(name="phoneNumber",length=11)
	private String phoneNumber;
	@Column(name="className")
	private String className;
	@Column(name="hostel")
	private String hostel;
	
	public Student() {
		super();
	}
	public Student(Integer id, String name, String studentId, String phoneNumber, String className, String hostel) {
		super();
		this.id = id;
		this.name = name;
		this.studentId = studentId;
		this.phoneNumber = phoneNumber;
		this.className = className;
		this.hostel = hostel;
	}
	
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentId=" + studentId + ", phoneNumber=" + phoneNumber
				+ ", className=" + className + ", hostel=" + hostel + "]";
	}

}
