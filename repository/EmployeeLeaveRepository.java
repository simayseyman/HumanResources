package com.example.jforce.demo.repository;

import com.example.jforce.demo.entity.EmployeeLeave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeave, Long> {
}
