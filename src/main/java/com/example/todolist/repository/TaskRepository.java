package com.example.todolist.repository;

import com.example.todolist.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Task entity.
 * Provides CRUD operations using Spring Data JPA.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
