package com.service.impl;

import java.util.List;

import com.exception.BusinessException;
import com.school.dao.SubjectsDAO;
import com.school.dao.impl.SubjectsDAOImpl;
import com.school.model.Subjects;
import com.service.SubjectsService;


public class SubjectsServiceImpl implements SubjectsService {

private SubjectsDAO subjectsDAO=new SubjectsDAOImpl();
	
	public Subjects createSubjects(Subjects subjects) throws BusinessException {
		
		return subjectsDAO.createSubjects(subjects);
	}

	public Subjects getSubjectsById(int id) throws BusinessException {
		if(id<=0||id>100) {
			throw new BusinessException("entered id "+id+" invalid");
		}
		return subjectsDAO.getSubjectsbyId(id);
	}

	@Override
	public List<Subjects> getAllSubjects() {
		// TODO Auto-generated method stub
		return subjectsDAO.getAllSubjects();
	}

	@Override
	public List<Subjects> getSubjectsBySub1(String sub1) {
		// TODO Auto-generated method stub
		return null;
	}



}
