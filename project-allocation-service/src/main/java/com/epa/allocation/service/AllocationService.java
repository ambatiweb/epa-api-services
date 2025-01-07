package com.epa.allocation.service;

import com.epa.allocation.entity.ProjectAllocation;
import com.epa.allocation.feign.client.EmployeeClient;
import com.epa.allocation.feign.client.ProjectClient;
import com.epa.allocation.repository.AllocationRepository;
import com.epa.allocation.response.EmployeeResponse;
import com.epa.allocation.response.ProjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AllocationService {

    @Autowired
    AllocationRepository allocationRepository;

    @Autowired
    EmployeeClient employeeClient;

    @Autowired
    ProjectClient projectClient;

    public ProjectAllocation createAllocateProject(ProjectAllocation projectAllocation){

        ResponseEntity<EmployeeResponse> addressResponse = employeeClient.getAllEmployees();
        System.out.println(addressResponse);

        ResponseEntity<ProjectResponse> projectResponse = projectClient.getAllProjects();
        System.out.println(projectResponse);

        return allocationRepository.save(projectAllocation);
    }

    public ProjectAllocation modifyProjectAllocationById(ProjectAllocation projectAllocation, Long id){

        return allocationRepository.findById(id).map(alp -> {
            alp.setEmployee_id(projectAllocation.getEmployee_id());
            alp.setProject_id(projectAllocation.getProject_id());
            alp.setAllocation_date(projectAllocation.getAllocation_date());
            return allocationRepository.save(alp);
        }).orElseThrow(() -> new RuntimeException("Allocation not found!"));

    }
}
