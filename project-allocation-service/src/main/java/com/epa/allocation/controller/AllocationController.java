package com.epa.allocation.controller;

import com.epa.allocation.entity.ProjectAllocation;
import com.epa.allocation.service.AllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/allocation/")
public class AllocationController {

    @Autowired
    AllocationService allocationService;

    // add project Allocation
    @PostMapping
    public ProjectAllocation allocateProject(@RequestBody ProjectAllocation projectAllocation){
        return allocationService.createAllocateProject(projectAllocation);
    }

    // modify project allocation
    @PutMapping
    public ProjectAllocation modifyProjectAllocationById(@RequestBody ProjectAllocation projectAllocation, @PathVariable Long id){
        return allocationService.modifyProjectAllocationById(projectAllocation, id);
    }

    // 2nd most experienced employee in a project


    // api to fetch employees who are not allocated with primary skills

}
