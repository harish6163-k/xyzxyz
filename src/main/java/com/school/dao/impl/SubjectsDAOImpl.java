package com.school.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.exception.BusinessException;
import com.school.dao.SubjectsDAO;
import com.school.model.Subjects;
import com.school.model.Teachers;

public class SubjectsDAOImpl implements SubjectsDAO {
	
	private Configuration configuration = new Configuration().configure();
	private StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	private SessionFactory factory = configuration.buildSessionFactory(builder.build());

	@Override
	public Subjects createSubjects(Subjects subjects) throws BusinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(subjects);
		transaction.commit();
		session.close();
		return subjects;
	}

	@Override
	public Subjects getSubjectsbyId(int id) throws BusinessException {
		
		Subjects subjects =null;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		subjects= (Subjects) session.get(Subjects.class, id);
		session.save(subjects);
		transaction.commit();
		session.close();
		if(subjects==null) {
			throw new BusinessException("Subject with id "+id+" not found");
		}
		return subjects;
	}

	@Override
	public List<Subjects> getAllSubjects() {
		Session session=factory.openSession();
		Query query=session.createQuery("from com.school.model.Subjects");
		List<Subjects>subjectsList=query.list();
		return subjectsList;
		
	}

	
}
