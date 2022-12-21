package com.malik.employee.EmployeeService.service;

import com.malik.employee.EmployeeService.dto.EmployeeDto;
import com.malik.employee.EmployeeService.entity.Employee;
import com.malik.employee.EmployeeService.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public List<Employee> employeeList() {

        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    public Employee findEmployeeId(Long employeeId) {

        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        return employee;
    }

    public String saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();

        if (employeeDto != null) {
            employee.setEmployeeId(employeeDto.getEmployeeId());
            employee.setFullName(employeeDto.getFullName());
            employee.setAddress(employeeDto.getAddress());

            employeeRepository.save(employee);
            return "success";
        } else {
            employee = null;
            return "fail";
        }

    }

}
