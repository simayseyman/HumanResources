package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.EmployeeInventory;

import java.util.List;

public interface IEmployeeInventoryService {

    List<EmployeeInventory> listAll();

    EmployeeInventory delete(Long id);

    EmployeeInventory insert(EmployeeInventory employeeInventory);

    EmployeeInventory update(Long id, EmployeeInventory employeeInventory);

    List<EmployeeInventory> insertAll(List<EmployeeInventory> newEmployeeInventoryList);

}
