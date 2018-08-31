/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.javacapabilty.repositories;

import com.accenture.javacapabilty.backbone.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author matias.ariel.tubio
 */
public interface ProjectRepository extends JpaRepository<Project,Long> {
    
}
