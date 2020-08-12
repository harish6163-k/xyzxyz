package com.service;

import java.util.List;

import com.exception.BusinessException;
import com.school.model.Teachers;

public interface TeachersService {

	public Teachers createTeachers(Teachers teachers) throws BusinessException;
	public Teachers getTeachersById(int id) throws BusinessException;
	
	public List<Teachers> getAllTeachers();
	
	


}