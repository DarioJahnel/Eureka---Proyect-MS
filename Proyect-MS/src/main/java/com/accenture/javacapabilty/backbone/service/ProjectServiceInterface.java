package com.accenture.javacapabilty.backbone.service;

import com.accenture.javacapabilty.backbone.model.Proyect;

public interface ProjectServiceInterface {

	public Proyect getProjectById(Long id);
	
	public String deleteProjectById(Long id);
	
	public Proyect modifyProjectById(Long id, Proyect editedProject);
	
	public Proyect createNewProject(Proyect newProject);
	
}
