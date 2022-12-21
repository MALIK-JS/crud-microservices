package com.malik.Task.TaskService.valueObject;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    private Long employeeId;

    private String fullName;

    private String address;
}
