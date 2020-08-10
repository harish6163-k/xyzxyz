package com.service.impl;

import java.util.List;

import com.exception.BusinessException;
import com.school.dao.StudentDAO;
import com.school.dao.impl.StudentDAOImpl;
import com.school.model.Student;
import com.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO=new StudentDAOImpl();
	
	@Override
	public Student createStudent(Student student) throws BusinessException {
		
		return studentDAO.createStudent(student);
	}

	@Override
	public Student getStudentById(int id) throws BusinessException {
		if(id<=0||id>100) {
			throw new BusinessException("entered id "+id+" invalid");
		}
		return studentDAO.getStudentById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDAO.getAllStudent();
	}

	@Override
	public Student updateStudent(Student student) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}


}

