package com.service.impl;

import java.util.List;

import com.exception.BusinessException;
import com.school.dao.ClassesDAO;
import com.school.dao.SubjectsDAO;
import com.school.dao.impl.ClassesDAOImpl;
import com.school.dao.impl.SubjectsDAOImpl;
import com.school.model.Classes;
import com.service.ClassesService;


public class ClassesServiceImpl implements ClassesService {

	private ClassesDAO classesDAO=new ClassesDAOImpl();
	@Override
	public Classes createClasses(Classes classes) throws BusinessException {
		
		return classesDAO.createClasses(classes);
	}

	@Override
	public Classes getClassesById(int id) throws BusinessException {
		if(id<=0||id>100) {
			throw new BusinessException("entered id "+id+" invalid");
		}
		return classesDAO.getClassesbyId(id);
	}
	

	@Override
	public Classes updateStudent(Classes classes) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Classes> getAllClasses() {
		
		return classesDAO.getAllClasses();
	}

	@Override
	public List<Classes> getClassesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	
}