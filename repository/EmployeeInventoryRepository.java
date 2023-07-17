package com.example.jforce.demo.repository;

import com.example.jforce.demo.entity.EmployeeInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeInventoryRepository extends JpaRepository<EmployeeInventory, Long> {
}
