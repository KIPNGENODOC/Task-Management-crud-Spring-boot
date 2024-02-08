package com.example.springbootcrudtaskmanagement.Repository;

import com.example.springbootcrudtaskmanagement.Entity.Task;
import com.example.springbootcrudtaskmanagement.Entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    default List<Task> findAllByStatus(TaskStatus status) {
        return null;
    }
}
