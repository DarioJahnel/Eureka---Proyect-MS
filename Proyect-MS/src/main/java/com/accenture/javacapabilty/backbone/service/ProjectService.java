package com.accenture.javacapabilty.backbone.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.javacapabilty.backbone.model.Project;
import com.accenture.javacapabilty.backbone.repository.ProjectRepository;

public class ProjectService implements ProjectServiceInterface{

	@Autowired
	ProjectRepository projectRepo;
	
    @Override
    public Project getProjectById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String deleteProjectById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Project modifyProjectById(Long id, Project editedProject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Project createNewProject(Project newProject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	@Override
	public List<Project> getProjectsByClientId(Long clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjectsByStartDate(Date startDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjectsByEndDate(Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
