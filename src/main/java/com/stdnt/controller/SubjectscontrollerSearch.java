package com.stdnt.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.exception.BusinessException;
import com.school.model.Subjects;
import com.service.SubjectsService;
import com.service.impl.SubjectsServiceImpl;

@Path("/subjects")
public class SubjectscontrollerSearch {
	private SubjectsService service=new SubjectsServiceImpl();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subjects> getAllSubjects(){
		return service.getAllSubjects();
	}

}
