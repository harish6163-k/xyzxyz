package com.service.impl;

import java.util.List;

import com.exception.BusinessException;
import com.school.dao.TeachersDAO;
import com.school.dao.impl.TeachersDAOImpl;
import com.school.model.Teachers;
import com.service.TeachersService;

public class TeachersServiceImpl implements TeachersService {

private TeachersDAO teachersDAO=new TeachersDAOImpl();
	
	public Teachers createTeachers(Teachers teachers) throws BusinessException {
		
		return teachersDAO.createTeachers(teachers);
	}

	public Teachers getTeachersById(int id) throws BusinessException {
		if(id<=0||id>100) {
			throw new BusinessException("entered id "+id+" invalid");
		}
		return teachersDAO.getTeachersbyId(id);
	}

	@Override
	public List<Teachers> getAllTeachers() {
		// TODO Auto-generated method stub
		return teachersDAO.getAllTeachers();
	}


}
