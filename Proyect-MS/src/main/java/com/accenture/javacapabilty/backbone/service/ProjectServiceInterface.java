package com.accenture.javacapabilty.backbone.service;

import java.util.Date;
import java.util.List;

import com.accenture.javacapabilty.backbone.model.Project;

public interface ProjectServiceInterface {

	public Project getProjectById(Long id);
	
	public String deleteProjectById(Long id);
	
	public Project modifyProjectById(Long id, Project editedProject);
	
	public Project createNewProject(Project newProject);
	
	public List<Project> getProjectsByClientId(Long clientId);
	
	public List<Project> getProjectsByStartDate(Date startDate);
	
	public List<Project> getProjectsByEndDate(Date endDate);
	
}
