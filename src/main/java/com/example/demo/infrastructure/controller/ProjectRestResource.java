package com.example.demo.infrastructure.controller;

import com.example.demo.applicationservice.ProjectService;
import com.example.demo.domain.entity.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/PATH_CONSTANTS")
public class ProjectRestResource {

    private final ProjectService projectService;

    public ResponseEntity<Project> createProject(@RequestBody SaveProjectDataDTO saveProjectDataDTO){
       Project project = projectService.createProject(saveProjectDataDTO);
       return ResponseEntity.created(URI.create(PATH_CONSTANTS +"/" + project.getId())).body(ProjectDTO).create(project));
    }

}
