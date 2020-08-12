package com.school.dao;

import java.util.List;

import com.exception.BusinessException;

import com.school.model.Subjects;



public interface SubjectsDAO {
	public Subjects createSubjects(Subjects subjects) throws BusinessException;
	public Subjects getSubjectsbyId(int id) throws BusinessException;

	public List<Subjects> getAllSubjects();
	
}