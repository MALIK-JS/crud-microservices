package com.malik.Task.TaskService.service;

import Dto.TaskDto;
import com.malik.Task.TaskService.entity.Task;
import com.malik.Task.TaskService.repository.TaskRepository;
import com.malik.Task.TaskService.valueObject.Employee;
import com.malik.Task.TaskService.valueObject.ResponseTypeValueObject;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@AllArgsConstructor
@Service
public class TaskService {

    private TaskRepository taskRepository;
    private RestTemplate restTemplate;

    public List<Task> taskList() {

        List<Task> taskList = taskRepository.findAll();
        return taskList;
    }

    public Task findTaskById(Long taskId) {

        Task task = taskRepository.findById(taskId).orElse(null);
        return task;
    }

    public String saveTask(TaskDto taskDto) {
        Task task = new Task();


        if (taskDto != null) {
            task.setTitle(taskDto.getTitle());
            task.setDescription(taskDto.getDescription());
            task.setEmployeeId(taskDto.getEmployeeId());
            taskRepository.save(task);
            return "success";
        } else {
            return "fail";
        }
    }

    public ResponseTypeValueObject getTaskByUserId(Long userId) {


        Task task = taskRepository.findById(userId).orElse(null);

        ResponseTypeValueObject responseTypeValueObject = new ResponseTypeValueObject();

        Employee employee = restTemplate.getForObject("http://EMPLOYEE-SERVICE/employee/get-employee/" + task.getEmployeeId(), Employee.class);

        responseTypeValueObject.setTask(task);
        responseTypeValueObject.setEmployee(employee);
        return responseTypeValueObject;
    }

}
