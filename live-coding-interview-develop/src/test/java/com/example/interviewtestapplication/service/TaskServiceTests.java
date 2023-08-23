package com.example.interviewtestapplication.service;

import com.example.interviewtestapplication.model.Task;
import com.example.interviewtestapplication.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskServiceTests {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    public void testCompleteTask() {
        Task task = new Task();
        task.setId(1L);
        task.setTitle("Sample Task");
        task.setDescription("This is a sample task");
        task.setCompleted(true);

        when(taskRepository.findById(1L)).thenReturn(Optional.of(task));

        Task completedTask = taskService.completeTask(1L);

        assertNotNull(completedTask);
        assertTrue(completedTask.isCompleted());
    }
}
