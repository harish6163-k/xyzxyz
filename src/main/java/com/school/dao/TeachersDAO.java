package com.school.dao;

import java.util.List;

import com.exception.BusinessException;
import com.school.model.Teachers;



public interface TeachersDAO {
	
	public Teachers createTeachers(Teachers teachers) throws BusinessException;
	public Teachers getTeachersbyId(int id) throws BusinessException;
	public List<Teachers> getAllTeachers();
	
}