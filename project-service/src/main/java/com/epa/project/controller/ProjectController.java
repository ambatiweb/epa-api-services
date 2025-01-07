package com.epa.project.controller;

import com.epa.project.entity.Project;
import com.epa.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/project/")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @PostMapping
    public Project createEmployee(@RequestBody Project employee){
        return projectService.createEmployee(employee);
    }
}
