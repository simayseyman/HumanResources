package com.example.jforce.demo;

import com.example.jforce.demo.entity.EmployeeInfo;
import com.example.jforce.demo.services.IEmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class DemoEmployeeInfoRestServices {

    @Autowired
    private IEmployeeInfoService employeeInfoService;

    @GetMapping(path = "/getEmployeeInfos")
    public List<EmployeeInfo> getEmployeeInfos(){

        return employeeInfoService.listAll();
    }

    @DeleteMapping(path = "/deleteEmployeeInfo/{id}")
    public EmployeeInfo deleteEmployeeInfo(@PathVariable(name = "id") Long id ) {
        return employeeInfoService.delete(id);
    }

    @PostMapping(path = "/addEmployeeInfo")
    public EmployeeInfo createEmployeeInfo(@RequestBody EmployeeInfo employeeInfo) {
        return employeeInfoService.insert(employeeInfo);
    }

    @PostMapping(path = "/postEmployeeInfos")
    public List<EmployeeInfo> addEmployeeInfoAll(@RequestBody List<EmployeeInfo> newEmployeeInfoList) {
        return employeeInfoService.insertAll(newEmployeeInfoList);
    }

    @PutMapping(path = "/employeeInfo/{id}")
    public EmployeeInfo updateEmployeeInfo(@PathVariable(name = "id")Long id, @RequestBody EmployeeInfo employeeInfo) {
        return employeeInfoService.update(id, employeeInfo);

    }
}
