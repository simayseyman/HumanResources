package com.example.jforce.demo.repository;

import com.example.jforce.demo.entity.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave, Long> {
}
