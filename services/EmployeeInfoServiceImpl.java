package com.example.jforce.demo.services;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.entity.EmployeeInfo;
import com.example.jforce.demo.repository.EmployeeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeInfoServiceImpl implements IEmployeeInfoService {
    @Autowired
    private EmployeeInfoRepository employeeInfoRepository;

    @Override
    public List<EmployeeInfo> listAll(){
        return employeeInfoRepository.findAll();
    }


    @Override
    public EmployeeInfo delete(@PathVariable Long id) {
        EmployeeInfo employeeInfo = employeeInfoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EmployeeInfo not exist with id :" + id));

        employeeInfoRepository.delete(employeeInfo);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return employeeInfo;
    }

    @Override
    public EmployeeInfo insert(@RequestBody EmployeeInfo employeeInfo) {
        employeeInfoRepository.save(employeeInfo);
        return employeeInfo;
    }

    @Override
    public List<EmployeeInfo> insertAll(@RequestBody List<EmployeeInfo> newEmployeeInfoList ) {
        employeeInfoRepository.saveAll(newEmployeeInfoList);

        return newEmployeeInfoList;
    }


    @Override
    public EmployeeInfo update(Long id, @RequestBody EmployeeInfo employeeInfo) {
        EmployeeInfo employeesInfo = employeeInfoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EmployeeInfo not exist with id :" + id));

        employeesInfo.setEmployee_id(employeeInfo.getEmployee_id());
        employeesInfo.setEmployee_graduate_degree(employeeInfo.getEmployee_graduate_degree());
        employeesInfo.setEmployee_graduated_university(employeeInfo.getEmployee_graduated_university());
        employeesInfo.setEmployee_marital_status(employeeInfo.getEmployee_marital_status());

        EmployeeInfo updatedEmployeeInfo = employeeInfoRepository.save(employeeInfo);
        return updatedEmployeeInfo;
    }

}
