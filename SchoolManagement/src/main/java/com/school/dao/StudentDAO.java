package com.school.dao;

import java.util.List;

import com.exception.BusinessException;
import com.school.model.Student;



public interface StudentDAO {
	public Student createStudent(Student student) throws BusinessException;
	public Student getStudentById(int id) throws BusinessException;

	public List<Student> getAllStudent();
	
}