package com.example.jforce.demo;

import com.example.jforce.demo.entity.EmployeeLeave;
import com.example.jforce.demo.services.IEmployeeLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DemoEmployeeLeaveRestServices {

    @Autowired
    private IEmployeeLeaveService employeeLeaveService;

    @GetMapping(path = "/getEmployeesLeave")
    public List<EmployeeLeave> getEmployeesLeave(){

        return employeeLeaveService.listAll();
    }

    @DeleteMapping(path = "/deleteEmployeeLeave/{id}")
    public EmployeeLeave deleteEmployeeLeave(@PathVariable(name = "id") Long id ) {
        return employeeLeaveService.delete(id);
    }

    @PostMapping(path = "/addEmployeeLeave")
    public EmployeeLeave createEmployeeLeave(@RequestBody EmployeeLeave employeeLeave) {
        return employeeLeaveService.insert(employeeLeave);
    }

    @PostMapping(path = "/postEmployeeLeaves")
    public List<EmployeeLeave> addEmployeeLeaveAll(@RequestBody List<EmployeeLeave> newEmployeeLeaveList) {
        return employeeLeaveService.insertAll(newEmployeeLeaveList);
    }

    @PutMapping(path = "/employeeLeave/{id}")
    public EmployeeLeave updateEmployeeLeave(@PathVariable(name = "id")Long id, @RequestBody EmployeeLeave employeeLeave) {
        return employeeLeaveService.update(id, employeeLeave);

    }
}
