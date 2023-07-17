package com.example.jforce.demo.services;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.EmployeeInventory;
import com.example.jforce.demo.repository.EmployeeInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeInventoryServiceImpl implements IEmployeeInventoryService {
    @Autowired
    private EmployeeInventoryRepository employeeInventoryRepository;

    @Override
    public List<EmployeeInventory> listAll(){
        return employeeInventoryRepository.findAll();
    }


    @Override
    public EmployeeInventory delete(@PathVariable Long id) {
        EmployeeInventory employeeInventory = employeeInventoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EmployeeInventory not exist with id :" + id));

        employeeInventoryRepository.delete(employeeInventory);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return employeeInventory;
    }

    @Override
    public EmployeeInventory insert(@RequestBody EmployeeInventory employeeInventory) {
        employeeInventoryRepository.save(employeeInventory);
        return employeeInventory;
    }

    @Override
    public List<EmployeeInventory> insertAll(@RequestBody List<EmployeeInventory> newEmployeeInventoryList ) {
        employeeInventoryRepository.saveAll(newEmployeeInventoryList);

        return newEmployeeInventoryList;
    }


    @Override
    public EmployeeInventory update(Long id, @RequestBody EmployeeInventory employeeInventory) {
        EmployeeInventory employeesInventory = employeeInventoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EmployeeInventory not exist with id :" + id));

        employeesInventory.setEmployee_id(employeeInventory.getEmployee_id());
        employeesInventory.setReceipt_date(employeeInventory.getReceipt_date());
        employeesInventory.setIssue_date(employeeInventory.getIssue_date());
        employeesInventory.setDeliver_employee_id(employeeInventory.getDeliver_employee_id());
        employeesInventory.setReceive_employee_id(employeeInventory.getReceive_employee_id());
        employeesInventory.setInventory_serial_number(employeeInventory.getInventory_serial_number());

        EmployeeInventory updatedEmployeeInventory = employeeInventoryRepository.save(employeeInventory);
        return updatedEmployeeInventory;
    }



}
