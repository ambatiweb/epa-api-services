package com.epa.allocation.feign.client;

import com.epa.allocation.response.ProjectResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(value = "project-service", url = "http://localhost:9000", path = "/api/v1/project")
public interface ProjectClient {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProjectResponse> getAllProjects();

}
