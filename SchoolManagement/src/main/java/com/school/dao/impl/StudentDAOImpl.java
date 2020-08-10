package com.school.dao.impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.exception.BusinessException;
import com.school.dao.StudentDAO;
import com.school.model.Student;

public class StudentDAOImpl implements StudentDAO {

		private Configuration configuration = new Configuration().configure();
		private StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		private SessionFactory factory = configuration.buildSessionFactory(builder.build());

	@Override
	public Student createStudent(Student student) throws BusinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
		return student;
	}

	@Override
	public Student getStudentById(int id) throws BusinessException {
		Student student =null;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		student = (Student) session.get(Student.class, id);
		session.save(student);
		transaction.commit();
		session.close();
		if(student==null) {
			throw new BusinessException("Student with id "+id+" not found");
		}
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		Session session=factory.openSession();
		Query query=session.createQuery("from com.school.model.Student");
		List<Student> studentList=query.list();
		return studentList;
	
	}
	}