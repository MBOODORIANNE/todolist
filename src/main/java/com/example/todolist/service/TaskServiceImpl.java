package com.example.todolist.service;

import com.example.todolist.entity.Task;
import com.example.todolist.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the TaskService interface.
 * Handles the business logic for CRUD operations on Task entities.
 */
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    /**
     * Constructor injection of TaskRepository.
     *
     * @param taskRepository repository for Task entities
     */
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /**
     * Create a new task in the database.
     *
     * @param task Task object to create
     * @return the created Task with generated ID
     */
    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    /**
     * Retrieve all tasks from the database.
     *
     * @return list of all Task objects
     */
    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    /**
     * Retrieve a task by its ID.
     *
     * @param id ID of the task to retrieve
     * @return Task object with the specified ID
     * @throws RuntimeException if no task is found
     */
    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
    }

    /**
     * Update an existing task identified by ID.
     *
     * @param id ID of the task to update
     * @param task Task object containing updated fields
     * @return the updated Task object
     */
    @Override
    public Task updateTask(Long id, Task task) {
        Task existingTask = getTaskById(id);
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
        existingTask.setCompleted(task.isCompleted());
        return taskRepository.save(existingTask);
    }

    /**
     * Delete a task by its ID.
     *
     * @param id ID of the task to delete
     */
    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

