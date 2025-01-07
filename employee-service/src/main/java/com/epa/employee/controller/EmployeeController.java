package com.epa.employee.controller;

import com.epa.employee.entity.Employee;
import com.epa.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee/")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    // fetch employees by primary and secondary
    @GetMapping
    public List<Employee> getEmployeeByPrimaryAndSecondarySkills(@PathVariable String primarySkill, @PathVariable String secondarySkill){
    return employeeService.getEmployeeByPrimaryAndSecondarySkills(primarySkill,secondarySkill);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
}
