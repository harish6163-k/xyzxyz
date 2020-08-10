package com.student.controller;


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
import com.school.model.Student;
import com.service.StudentService;
import com.service.impl.StudentServiceImpl;

@Path("/student")
public class Studentcontroller {
	
	private StudentService service = new StudentServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student createStudent(Student student) {
		
		try {
			return service.createStudent(student);
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
	public Response getStudentById(@PathParam("id")int id) {
		
		try {
				return Response.ok(service.getStudentById(id),MediaType.APPLICATION_JSON).build(); 
		} catch(BusinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	
	}
	
}