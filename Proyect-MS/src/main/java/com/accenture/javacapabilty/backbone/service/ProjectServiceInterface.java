package com.accenture.javacapabilty.backbone.service;

import java.util.Date;
import java.util.List;

import com.accenture.javacapabilty.backbone.model.Project;
import java.util.Optional;

public interface ProjectServiceInterface {

	public Optional<Project> getProjectById(Long id);
        
        public Optional<List<Project>> getAllProjects();
	
	public Boolean deleteProjectById(Long id);
	
	public Boolean modifyProjectById(Long id, Project editedProject);
	
	public Optional<Project> createNewProject(Project newProject);
	
	public Optional<List<Project>> getProjectsByClientId(Long clientId);
	
	public Optional<List<Project>> getProjectsByStartDate(Date startDate);
	
	public Optional<List<Project>> getProjectsByEndDate(Date endDate);
	
}
