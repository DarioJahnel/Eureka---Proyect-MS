package com.accenture.javacapabilty.backbone.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.javacapabilty.backbone.model.Project;
import com.accenture.javacapabilty.backbone.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements ProjectServiceInterface{

    @Autowired
    ProjectRepository projectRepo;
	
    @Override
    public Optional<Project> getProjectById(Long id) {
    	return projectRepo.findById(id);   	
    }

    @Override
    public Boolean deleteProjectById(Long id) {
    	
        Boolean wasDeleted = false;
    	Optional<Project> project = getProjectById(id);
    	
    	if(project.isPresent()) {
            
            project.get().setActive(false);
            wasDeleted = true;    
    	}
    	
    	return wasDeleted;
    }

    @Override
    public Boolean modifyProjectById(Long id, Project editedProject) {
        
        Boolean modified = false;
    	Optional<Project> project = getProjectById(id);
    	
    	if(project.isPresent()) {
            
    		project = Optional.of(editedProject);
                modified = true;
    	}
    	
    	return modified;
    }

    @Override
    public void createNewProject(Project newProject) {
    	projectRepo.save(newProject);
    }

    @Override
    public Optional<List<Project>> getProjectsByClientId(Long clientId) {
        
        Optional<List<Project>> requested = Optional.empty();
	List<Project> projectList = new ArrayList<>();
	projectList.addAll(projectRepo.findByClientId(clientId));
		
	if(!projectList.isEmpty()) {
            requested = Optional.of(projectList);
        }
		
	return requested;
    }

    @Override
    public Optional<List<Project>> getProjectsByStartDate(Date startDate) {
		
        Optional<List<Project>> requested = Optional.empty();
        List<Project> projectList = new ArrayList<>();
	projectList.addAll(projectRepo.findByCalendarStartDate(startDate));
		
	if(!projectList.isEmpty())
            requested = Optional.of(projectList);
		
        return requested;
    }

    @Override
    public Optional<List<Project>> getProjectsByEndDate(Date endDate) {
		
        Optional<List<Project>> requested = Optional.empty();
        List<Project> projectList = new ArrayList<>();
	projectList.addAll(projectRepo.findByCalendarEndDate(endDate));
		
	if(!projectList.isEmpty())
            requested = Optional.of(projectList);
		
        return requested;
    }

}
