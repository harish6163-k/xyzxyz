package com.stdnt.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.exception.BusinessException;
import com.school.model.Classes;

import com.service.ClassesService;
import com.service.impl.ClassesServiceImpl;


@Path("/classess")
public class ClassescontrollerSearch {
	private ClassesService service=new ClassesServiceImpl();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Classes> getAllClasses(){
		return service.getAllClasses();
	}

}
