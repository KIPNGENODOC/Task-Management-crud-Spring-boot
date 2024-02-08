package com.example.springbootcrudtaskmanagement.Service;

import com.example.springbootcrudtaskmanagement.Entity.Task;
import com.example.springbootcrudtaskmanagement.Entity.TaskStatus;
import com.example.springbootcrudtaskmanagement.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;



@Service
public class TaskService {
       @Autowired
    private TaskRepository taskRepository;
    private Task.TaskStatus TaskStatus;

    public Task createTask(Task task){
        task.setCreatedAt(new Date());
        task.setUpdatedAt(new Date());
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);

    }

    public Task updateTaskStatus(Long id, TaskStatus status) {
        Optional<Task> optionalTask = taskRepository.findById(id);
                if (optionalTask.isPresent()){
                    Task task = optionalTask.get();
                    task.setStatus(TaskStatus);
                    task.setUpdatedAt(new Date());
                    return taskRepository.save(task);

                }
                return null;
    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        return taskRepository.findAllByStatus(status);
    }

    public void deleteAllTasks() {
        taskRepository.deleteAll();
    }
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);
    }
}
