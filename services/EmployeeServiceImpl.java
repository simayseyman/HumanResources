package com.example.jforce.demo.services;

import java.util.*;

import com.example.jforce.demo.ResourceNotFoundException;
import com.example.jforce.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.example.jforce.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	public Page<Employee> findProductsWithPagination(int offset, int pageSize){
		Page<Employee> employees = employeeRepository.findAll(PageRequest.of(offset, pageSize));
		return  employees;
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> listAll(){
		return employeeRepository.findAll();
	}


	@Override
	public Employee delete(@PathVariable Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return employee;
	}

	@Override
	public Employee insert(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public List<Employee> insertAll(@RequestBody List<Employee> newEmployeeList ) {
		employeeRepository.saveAll(newEmployeeList);

		return newEmployeeList;
	}


	@Override
	public Employee getEmployee(@PathVariable Long id){
		Employee employee = employeeRepository.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return employee;
	}


	@Override
	public Employee update(Long id, @RequestBody Employee employee) {
		Employee employees = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		employees.setEmployee_id(employees.getEmployee_id());
		employees.setName(employee.getName());
		employees.setSurname(employee.getSurname());
		employees.setEmail(employee.getEmail());
		employees.setPhone_number(employee.getPhone_number());
		employees.setHire_date(employee.getHire_date());
		employees.setJob_id(employee.getJob_id());
		employees.setSalary(employee.getSalary());
		employees.setDepartment_id(employee.getDepartment_id());
		employees.setIdentity_no(employee.getIdentity_no());
		employees.setGender(employee.getGender());
		employees.setCurrent_situation(employee.getCurrent_situation());
		employees.setUsername(employee.getUsername());
		employees.setPassword(employee.getPassword());
		employees.setAccount_type_id(employee.getAccount_type_id());


		Employee updatedEmployee = employeeRepository.save(employee);
		return updatedEmployee;
	}

}
