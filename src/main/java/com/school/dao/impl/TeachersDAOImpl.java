package com.school.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.exception.BusinessException;
import com.school.dao.TeachersDAO;
import com.school.model.Student;
import com.school.model.Teachers;

public class TeachersDAOImpl implements TeachersDAO {

	private Configuration configuration = new Configuration().configure();
	private StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	private SessionFactory factory = configuration.buildSessionFactory(builder.build());
	@Override
	public Teachers createTeachers(Teachers teachers) throws BusinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(teachers);
		transaction.commit();
		session.close();
		return teachers;
	}
	@Override
	public Teachers getTeachersbyId(int id) throws BusinessException {
		Teachers teachers =null;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		teachers= (Teachers) session.get(Teachers.class, id);
		session.save(teachers);
		transaction.commit();
		session.close();
		if(teachers==null) {
			throw new BusinessException("Teachers with id "+id+" not found");
		}
		return teachers;
	}
	@Override
	public List<Teachers> getAllTeachers() {
		Session session=factory.openSession();
		Query query=session.createQuery("from com.school.model.Teachers");
		List<Teachers> teachersList=query.list();
		return teachersList;
	}


}
