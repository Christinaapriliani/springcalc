package com.example.interviewtestapplication.service;

import com.example.interviewtestapplication.model.Task;
import com.example.interviewtestapplication.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task completeTask(Long taskId) {
        Task task = taskRepository.findById(taskId).orElse(null);

        if (task != null) {
            task.setCompleted(!task.isCompleted());
            taskRepository.save(task);
        }

        return task;
    }
}
