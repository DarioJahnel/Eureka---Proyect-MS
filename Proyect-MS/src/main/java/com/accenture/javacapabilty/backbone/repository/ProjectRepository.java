/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.javacapabilty.backbone.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.accenture.javacapabilty.backbone.model.Project;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Titán
 */

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {
    
        boolean existsById(Long id);
    
	Optional<Project> findById(Long id);
    
	List<Project> findByClientId(Long clientId);
	
	Optional<Project> findByName(String name);
	
	List<Project> findByCalendarStartDate(Date startDate);
	
	List<Project> findByCalendarEndDate(Date endDate);
}
