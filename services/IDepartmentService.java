package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.Department;

import java.util.List;

public interface IDepartmentService {

    List<Department> listAll();

    Department delete(Long id);

    Department insert(Department department);

    Department update(Long id, Department department);

    List<Department> insertAll(List<Department> newDepartmentList);
}
