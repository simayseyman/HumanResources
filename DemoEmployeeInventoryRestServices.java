package com.example.jforce.demo;

import com.example.jforce.demo.entity.EmployeeInventory;
import com.example.jforce.demo.services.IEmployeeInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DemoEmployeeInventoryRestServices {

    @Autowired
    private IEmployeeInventoryService employeeInventoryService;

    @GetMapping(path = "/getEmployeeInventories")
    public List<EmployeeInventory> getEmployeeInventories(){

        return employeeInventoryService.listAll();
    }

    @DeleteMapping(path = "/deleteEmployeeInventory/{id}")
    public EmployeeInventory deleteEmployeeInventory(@PathVariable(name = "id") Long id ) {
        return employeeInventoryService.delete(id);
    }

    @PostMapping(path = "/addEmployeeInventory")
    public EmployeeInventory createEmployeeInventory(@RequestBody EmployeeInventory employeeInventory) {

        return employeeInventoryService.insert(employeeInventory);
    }

    @PostMapping(path = "/postEmployeeInventories")
    public List<EmployeeInventory> addEmployeeInventoryAll(@RequestBody List<EmployeeInventory> newEmployeeInventoryList) {
        return employeeInventoryService.insertAll(newEmployeeInventoryList);
    }

    @PutMapping(path = "/employeeInventory/{id}")
    public EmployeeInventory updateEmployeeInventory(@PathVariable(name = "id")Long id, @RequestBody EmployeeInventory employeeInventory) {
        return employeeInventoryService.update(id, employeeInventory);

    }
}
