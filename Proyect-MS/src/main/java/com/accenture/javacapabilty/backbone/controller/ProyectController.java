package com.accenture.javacapabilty.backbone.controller;

import com.accenture.javacapabilty.backbone.model.Project;
import com.accenture.javacapabilty.backbone.service.ProjectServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ResponseEntity<Project> saveProject(@RequestBody Project created) {
        return new ResponseEntity<>(projectService.createNewProject(created).orElse(null), HttpStatus.ACCEPTED);
    }
    
    @GetMapping("projects/{projectId}")
    public ResponseEntity<Project> getProject(@PathVariable Long projectId) {
        return new ResponseEntity<>(projectService.getProjectById(projectId).orElse(null), HttpStatus.FOUND);
    }
    
    @GetMapping("projects")
    public ResponseEntity<List<Project>> getProjects() {
        return new ResponseEntity<>(projectService.getAllProjects().orElse(null), HttpStatus.FOUND);
    }
    
    @DeleteMapping("projects/{projectId}")
    public ResponseEntity<Boolean> deleteProject(@PathVariable Long projectId) {
        return new ResponseEntity<>(projectService.deleteProjectById(projectId), HttpStatus.ACCEPTED);
    } 
    
    @PutMapping("projects/{projectId}")
    public ResponseEntity<Boolean> updateProject(@PathVariable Long projectId, @RequestBody Project updatedProject){
        return new ResponseEntity<>(projectService.modifyProjectById(projectId, updatedProject), HttpStatus.ACCEPTED);
    }    
}