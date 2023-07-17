package com.example.jforce.demo.repository;

import com.example.jforce.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    @Query("SELECT s FROM Employee WHERE s.employee_id=?1")
//    Optional<Employee > findEmployeeByEmployee_id(Long employee_id);

}

