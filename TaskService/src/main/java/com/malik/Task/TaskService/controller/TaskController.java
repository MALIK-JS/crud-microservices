package com.malik.Task.TaskService.controller;

import Dto.TaskDto;
import com.malik.Task.TaskService.entity.Task;
import com.malik.Task.TaskService.service.TaskService;
import com.malik.Task.TaskService.valueObject.ResponseTypeValueObject;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/task")
public class TaskController {

    private TaskService taskService;

    @GetMapping("/")
    public List<Task> taskList() {

        List<Task> taskList = taskService.taskList();
        return taskList;
    }

    @GetMapping("/saveTask/")
    public String saveTask(@RequestBody TaskDto taskDto) {

        return taskService.saveTask(taskDto);
    }

    @GetMapping("/getTask/{departmentId}")
    public ResponseTypeValueObject getTaskByUserId(@PathVariable Long userId) {

        return taskService.getTaskByUserId(userId);
    }
}
