package com.epa.project.service;

import com.epa.project.entity.Project;
import com.epa.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    public Project createEmployee(Project employee){
        return projectRepository.save(employee);
    }
}
