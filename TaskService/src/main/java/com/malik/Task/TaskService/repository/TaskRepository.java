package com.malik.Task.TaskService.repository;

import com.malik.Task.TaskService.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
