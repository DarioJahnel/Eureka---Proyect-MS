package com.accenture.javacapabilty.backbone.service;

import com.accenture.javacapabilty.backbone.model.Project;

public interface ProjectServiceInterface {

	public Project getProjectById(Long id);
	
	public String deleteProjectById(Long id);
	
	public Project modifyProjectById(Long id, Project editedProject);
	
	public Project createNewProject(Project newProject);
	
}
