package com.service;

import java.util.List;

import com.exception.BusinessException;
import com.school.model.Classes;


public interface ClassesService {

	public Classes createClasses(Classes classes) throws BusinessException;
	public Classes getClassesById(int id) throws BusinessException;
	public Classes updateStudent(Classes classes) throws BusinessException;
	public List<Classes> getAllClasses();
	public List<Classes> getClassesByName(String name);
	
}
