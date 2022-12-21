package com.malik.cloudGateway.CloudGatway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userservice-fallback")
    public String userServiceFallback() {
        return "UserService is Taking longer than expected.";
    }

    @GetMapping("/employeeservice-fallback")
    public String departmentServiceFallback() {
        return "EmployeeService is Taking longer than expected.";
    }

}
