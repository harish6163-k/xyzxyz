package com.service;

import java.util.List;

import com.exception.BusinessException;
import com.school.model.Student;

public interface StudentService {

	public Student createStudent(Student student) throws BusinessException;
	public Student getStudentById(int id) throws BusinessException;
	public Student updateStudent(Student student) throws BusinessException;
	public List<Student> getAllStudents();
	
	


}
