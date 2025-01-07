package com.epa.allocation.repository;

import com.epa.allocation.entity.ProjectAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationRepository extends JpaRepository<ProjectAllocation, Long> {
}
