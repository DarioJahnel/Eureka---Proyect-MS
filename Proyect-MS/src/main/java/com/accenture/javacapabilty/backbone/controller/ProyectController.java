package com.accenture.javacapabilty.backbone.controller;

import com.accenture.javacapabilty.backbone.model.Project;
import com.accenture.javacapabilty.backbone.service.ProjectServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectController {
    
    @Autowired
    ProjectServiceInterface projectService;
        
    @PostMapping("/projects")
    public void saveProject(@ModelAttribute("project") Project created) {
        projectService.createNewProject(created);
    }
    
    @GetMapping("projects/{projectId}")
    @ResponseBody
    public Project getProject(@PathVariable Long projectId) {
        return projectService.getProjectById(projectId).orElse(null);
    }
    
    @DeleteMapping("projects/{projectId}")
    @ResponseBody
    public Boolean deleteProject(@ModelAttribute Long projectId) {
        return projectService.deleteProjectById(projectId);
    } 
    
    @PutMapping("projects/{projectId}")
    @ResponseBody
    public Boolean updateProject(@PathVariable Long projectId, @ModelAttribute Project updatedProject){
        return projectService.modifyProjectById(projectId, updatedProject);
    }    
}