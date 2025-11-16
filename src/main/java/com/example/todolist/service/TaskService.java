package com.example.todolist.service;

import com.example.todolist.entity.Task;
import java.util.List;

/**
 * Service interface defining the CRUD operations for Task entity.
 * <p>
 * Methods provided:
 * - createTask : add a new task
 * - getAllTasks : retrieve all tasks
 * - getTaskById : retrieve a single task by ID
 * - updateTask : update an existing task by ID
 * - deleteTask : delete a task by ID
 */
public interface TaskService {

    /**
     * Create a new task.
     *
     * @param task Task object to be created
     * @return the created Task with generated ID
     */
    Task createTask(Task task);

    /**
     * Retrieve all tasks from the database.
     *
     * @return list of all Task objects
     */
    List<Task> getAllTasks();

    /**
     * Retrieve a single task by its ID.
     *
     * @param id the ID of the task to retrieve
     * @return the Task object with the given ID
     * @throws RuntimeException if no task is found with the given ID
     */
    Task getTaskById(Long id);

    /**
     * Update an existing task by ID.
     *
     * @param id the ID of the task to update
     * @param task Task object containing updated fields
     * @return the updated Task object
     */
    Task updateTask(Long id, Task task);

    /**
     * Delete a task by its ID.
     *
     * @param id the ID of the task to delete
     */
    void deleteTask(Long id);
}
