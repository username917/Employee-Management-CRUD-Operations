package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeByID(long id);
	
	void deleteEmployeeById(long id);
	
	///method for pagination and modifeid to support a sorting ability
	Page<Employee>findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
;
}
