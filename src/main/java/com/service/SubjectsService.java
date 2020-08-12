package com.service;

import java.util.List;

import com.exception.BusinessException;
import com.school.model.Subjects;


public interface SubjectsService {
	
		public Subjects createSubjects(Subjects subjects) throws BusinessException;
		public Subjects getSubjectsById(int id) throws BusinessException;
		
		public List<Subjects> getAllSubjects();
		public List<Subjects> getSubjectsBySub1(String sub1);
		
		


}
