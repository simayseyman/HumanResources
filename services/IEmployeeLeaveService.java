package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.EmployeeLeave;

import java.util.List;

public interface IEmployeeLeaveService {

    List<EmployeeLeave> listAll();

    EmployeeLeave delete(Long id);

    EmployeeLeave insert(EmployeeLeave employeeLeave);

    EmployeeLeave update(Long id, EmployeeLeave employeeLeave);

    List<EmployeeLeave> insertAll(List<EmployeeLeave> newEmployeeLeaveList);
}
