package com.stdnt.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.exception.BusinessException;
import com.school.model.Classes;
import com.service.ClassesService;
import com.service.impl.ClassesServiceImpl;
@Path("/classes")
public class Classescontroller {
	
	private ClassesService service = new ClassesServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Classes createClasses(Classes classes) {
		
		try {
			return service.createClasses(classes);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
//	
//	@PUT
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Student updateStudent(Student student) {
//		
//		try {
//			return service.updateStudent(student);
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
		
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Classes getClassesById(@PathParam("id")int id) {
		
		try {
			return service.getClassesById(id);
		} catch (BusinessException e) {
			return getClassesById(id);
		}
		
	
	}
	
}