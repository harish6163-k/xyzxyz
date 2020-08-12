package com.school.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.exception.BusinessException;
import com.school.dao.ClassesDAO;
import com.school.model.Classes;
import com.school.model.Student;

public class ClassesDAOImpl implements ClassesDAO {

	private Configuration configuration = new Configuration().configure();
	private StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	private SessionFactory factory = configuration.buildSessionFactory(builder.build());
	
	@Override
	public Classes createClasses(Classes classes) throws BusinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction(); 
		session.save(classes);
		transaction.commit();
		session.close();
		return classes;
		
	}
	@Override
	public Classes getClassesbyId(int id) throws BusinessException {
		Classes classes = null;
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		classes = (Classes) session.get(Classes.class, id);
		transaction.commit();
		session.close();
		
		if (classes == null) {

			throw new BusinessException("Classes with id " + id + " not found");
		}

		return classes;
	}
	
	@Override
	public List<Classes> getAllClasses() {
		Session session = factory.openSession();
		Query query = session.createQuery("from com.school.model.Classes");
		List<Classes> classesList = query.list();
		return classesList;
	}

}
