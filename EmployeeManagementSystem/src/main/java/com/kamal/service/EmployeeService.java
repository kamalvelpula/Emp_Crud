package com.kamal.service;

import com.kamal.model.Employee;
import java.util.List;

public interface EmployeeService {
	
    void save(Employee employee);
    
    void update(Employee employee);
    
    void delete(int id);
    
    Employee getById(int id);
    
    List<Employee> getAll();
}
