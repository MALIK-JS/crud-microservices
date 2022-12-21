package com.malik.employee.EmployeeService.controller;

import com.malik.employee.EmployeeService.dto.EmployeeDto;
import com.malik.employee.EmployeeService.entity.Employee;
import com.malik.employee.EmployeeService.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> employeeList() {

        List<Employee> employeeList = employeeService.employeeList();
        return employeeList;
    }

    @GetMapping("/getEmployee/{employeeId}")
    public Employee findDepartmentById(@PathVariable Long employeeId) {
        Employee employee = employeeService.findEmployeeId(employeeId);
        return employee;
    }

    @PostMapping("/saveEmployee")
    public String saveDepartment(@RequestBody EmployeeDto employeeDto) {
        return employeeService.saveEmployee(employeeDto);
    }

}
