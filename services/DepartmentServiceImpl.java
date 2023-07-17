package com.example.jforce.demo.services;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.Department;
import com.example.jforce.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> listAll(){
        return departmentRepository.findAll();
    }


    @Override
    public Department delete(@PathVariable Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not exist with id :" + id));

        departmentRepository.delete(department);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return department;
    }

    @Override
    public Department insert(@RequestBody Department department) {
        departmentRepository.save(department);
        return department;
    }

    @Override
    public List<Department> insertAll(@RequestBody List<Department> newDepartmentList ) {
        departmentRepository.saveAll(newDepartmentList);

        return newDepartmentList;
    }


    @Override
    public Department update(Long id, @RequestBody Department department) {
        Department departments = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not exist with id :" + id));

        departments.setDepartment_name(department.getDepartment_name());
        departments.setJob_categories_id(department.getJob_categories_id());

        Department updatedDepartment = departmentRepository.save(department);
        return updatedDepartment;
    }
}
