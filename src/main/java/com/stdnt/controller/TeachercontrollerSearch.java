package com.stdnt.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.exception.BusinessException;
import com.school.model.Teachers;
import com.service.TeachersService;
import com.service.impl.TeachersServiceImpl;


@Path("/teachers")
public class TeachercontrollerSearch {
	
	private TeachersService service=new TeachersServiceImpl();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Teachers> getAllTeachers(){
		return service.getAllTeachers();
	}

}
