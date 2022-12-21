package com.malik.employee.EmployeeService.repository;

import com.malik.employee.EmployeeService.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
