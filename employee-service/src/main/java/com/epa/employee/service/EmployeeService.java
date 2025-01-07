package com.epa.employee.service;

import com.epa.employee.entity.Employee;
import com.epa.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployeeByPrimaryAndSecondarySkills(String primarySkill, String secondarySkill) {
        return employeeRepository.findByPrimaryAndSecondary(primarySkill, secondarySkill);
    }
}
