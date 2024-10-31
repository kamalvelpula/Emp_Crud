package com.kamal.dao;

import com.kamal.model.Employee;
import java.util.List;

public interface EmployeeDao {
	
    void save(Employee employee);
    
    void update(Employee employee);
    
    void delete(int id);
    
    Employee getById(int id);
    
    List<Employee> getAll();
}
