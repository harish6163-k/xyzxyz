package com.stdnt.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.exception.BusinessException;
import com.school.model.Student;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;

@Path("/students")
public class StudentcontrollerSearch {
	private StudentService service=new StudentServiceImpl();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}

}
