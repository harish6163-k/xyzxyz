package com.school.dao;

import java.util.List;

import com.exception.BusinessException;
import com.school.model.Classes;



public interface ClassesDAO {
	public Classes createClasses(Classes classes) throws BusinessException;
	public Classes getClassesbyInt(int id) throws BusinessException;
	public List<Classes> getAllClasses();
	
}