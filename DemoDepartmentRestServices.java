package com.example.jforce.demo;

import com.example.jforce.demo.entity.Department;
import com.example.jforce.demo.services.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DemoDepartmentRestServices {
    @Autowired
    private IDepartmentService departmentService;

    @GetMapping(path = "/getDepartments")
    public List<Department> getDepartments(){

        return departmentService.listAll();
    }

    @DeleteMapping(path = "/deleteDepartment/{id}")
    public Department deleteDepartment(@PathVariable(name = "id") Long id ) {
        return departmentService.delete(id);
    }

    @PostMapping(path = "/addDepartment")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.insert(department);
    }

    @PostMapping(path = "/postDepartments")
    public List<Department> addDepartmentAll(@RequestBody List<Department> newDepartmentList) {
        return departmentService.insertAll(newDepartmentList);
    }

    @PutMapping(path = "/department/{id}")
    public Department updateDepartment(@PathVariable(name = "id")Long id, @RequestBody Department department) {
        return departmentService.update(id, department);

    }

}
