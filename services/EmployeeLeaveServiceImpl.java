package com.example.jforce.demo.services;


import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.EmployeeLeave;
import com.example.jforce.demo.repository.EmployeeLeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeLeaveServiceImpl implements IEmployeeLeaveService{

    @Autowired
    private EmployeeLeaveRepository employeeLeaveRepository;

    @Override
    public List<EmployeeLeave> listAll(){
        return employeeLeaveRepository.findAll();
    }


    @Override
    public EmployeeLeave delete(@PathVariable Long id) {
        EmployeeLeave employeeLeave = employeeLeaveRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EmployeeLeave not exist with id :" + id));

        employeeLeaveRepository.delete(employeeLeave);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return employeeLeave;
    }

    @Override
    public EmployeeLeave insert(@RequestBody EmployeeLeave employeeLeave) {
        employeeLeaveRepository.save(employeeLeave);
        return employeeLeave;
    }

    @Override
    public List<EmployeeLeave> insertAll(@RequestBody List<EmployeeLeave> newEmployeeLeaveList ) {
        employeeLeaveRepository.saveAll(newEmployeeLeaveList);

        return newEmployeeLeaveList;
    }


    @Override
    public EmployeeLeave update(Long id, @RequestBody EmployeeLeave employeeLeave) {
        EmployeeLeave employeesLeave = employeeLeaveRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EmployeeLeave not exist with id :" + id));

        employeesLeave.setEmployee_id(employeeLeave.getEmployee_id());
        employeesLeave.setLeave_id(employeeLeave.getLeave_id());
        employeesLeave.setLeave_start_date(employeeLeave.getLeave_start_date());
        employeesLeave.setLeave_end_date(employeeLeave.getLeave_end_date());

        EmployeeLeave updatedEmployeeLeave = employeeLeaveRepository.save(employeeLeave);
        return updatedEmployeeLeave;
    }

}
