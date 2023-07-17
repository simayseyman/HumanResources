package com.example.jforce.demo.services;

import com.example.jforce.demo.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IEmployeeService {

	
	List<Employee> listAll();

	Employee delete(Long id);

	Employee insert(Employee employee);

	Employee getEmployee(Long id);

	Employee update(Long id, Employee employee);

	List<Employee> insertAll(List<Employee> newEmployeeList);

	Page<Employee> findProductsWithPagination(int offset, int pageSize);
}
