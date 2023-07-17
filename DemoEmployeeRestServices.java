package com.example.jforce.demo;

import com.example.jforce.demo.dto.APIResponse;
import com.example.jforce.demo.entity.Employee;
import com.example.jforce.demo.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DemoEmployeeRestServices {

    @GetMapping("/pagination")
    private APIResponse<Page<Employee>> getEmployeesWithPagination(@RequestParam(value = "offset", defaultValue = "0") int offset,
                                                                   @RequestParam(value = "pageSize", defaultValue = "1")  int pageSize) {
        Page<Employee> employeesWithPagination = employeeService.findProductsWithPagination(offset, pageSize);
        return new APIResponse<>(employeesWithPagination.getSize(), employeesWithPagination );
    }

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping(path = "/employees")
    public List<Employee> getEmployees(){

        return employeeService.listAll();
    }

    @DeleteMapping(path = "/deleteEmployee/{id}")
    public Employee deleteEmployee(@PathVariable(name = "id") Long id ) {
        return employeeService.delete(id);
    }

    @PostMapping(path = "/addEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {

        return employeeService.insert(employee);
    }

    @PostMapping(path = "/postEmployees")
    public List<Employee> addEmployeeAll(@RequestBody List<Employee> newEmployeeList) {
        return employeeService.insertAll(newEmployeeList);
    }

    @GetMapping(path = "/getEmployee/{id}")
    public Employee getById(@PathVariable(name="id")Long id){
        return employeeService.getEmployee(id);
    }


    @PutMapping(path = "/employee/{id}")
    public Employee updateEmployee(@PathVariable(name = "id")Long id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);

    }
}
