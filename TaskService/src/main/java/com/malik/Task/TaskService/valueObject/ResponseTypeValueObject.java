package com.malik.Task.TaskService.valueObject;

import com.malik.Task.TaskService.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTypeValueObject {

    private Task task;
    private Employee employee;

}
