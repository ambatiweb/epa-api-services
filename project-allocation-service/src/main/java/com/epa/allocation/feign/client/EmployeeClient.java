package com.epa.allocation.feign.client;

import com.epa.allocation.response.EmployeeResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@org.springframework.cloud.openfeign.FeignClient(value = "employee-service", url = "http://localhost:8000", path = "/api/v1/employee")
public interface EmployeeClient {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeResponse> getAllEmployees();

}
