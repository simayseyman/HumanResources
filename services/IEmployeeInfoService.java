package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.EmployeeInfo;

import java.util.List;

public interface IEmployeeInfoService {

    List<EmployeeInfo> listAll();

    EmployeeInfo delete(Long id);

    EmployeeInfo insert(EmployeeInfo employeeInfo);

    EmployeeInfo update(Long id, EmployeeInfo employeeInfo);

    List<EmployeeInfo> insertAll(List<EmployeeInfo> newEmployeeInfoList);
}
