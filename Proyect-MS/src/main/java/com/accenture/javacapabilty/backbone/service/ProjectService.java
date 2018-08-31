package com.accenture.javacapabilty.backbone.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.javacapabilty.backbone.model.Project;
import com.accenture.javacapabilty.backbone.repository.ProjectRepository;

public class ProjectService implements ProjectServiceInterface{

	@Autowired
	ProjectRepository projectRepo;
	
    @Override
    public Project getProjectById(Long id) {

    	Optional<Project> project = projectRepo.findById(id);
    	
    	if(project.isPresent()) return project.get();
    	
    	return null;
    	
    }

    @Override
    public String deleteProjectById(Long id) {
    	
    	Project project = getProjectById(id);
    	
    	if(project != null) {
    		project.setActive(false);
    	}
    	
    	return("Project is no longer active");
    }

    @Override
    public Project modifyProjectById(Long id, Project editedProject) {
    	Project project = getProjectById(id);
    	
    	if(project!=null) {
    		project = editedProject;
    		return project;
    	}
    	
    	return null;
    }

    @Override
    public void createNewProject(Project newProject) {
    	projectRepo.save(newProject);
    }

	@Override
	public List<Project> getProjectsByClientId(Long clientId) {
		List<Project> projectList = new ArrayList<>();
		projectList.addAll(projectRepo.findByClientId(clientId));
		
		if(!projectList.isEmpty()) {
		return projectList;}
		
		return null;
	}

	@Override
	public List<Project> getProjectsByStartDate(Date startDate) {
		List<Project> projectList = new ArrayList<>();
		projectList.addAll(projectRepo.findByCalendarStartDate(startDate));
		
		if(!projectList.isEmpty()) {
		return projectList;}
		
		return null;
	}

	@Override
	public List<Project> getProjectsByEndDate(Date endDate) {
		List<Project> projectList = new ArrayList<>();
		projectList.addAll(projectRepo.findByCalendarEndDate(endDate));
		
		if(projectList.size() >= 1) {
		return projectList;}
		
		return null;
	}

}
