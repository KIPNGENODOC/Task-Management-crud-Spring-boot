package com.example.springbootcrudtaskmanagement.Entity;

 import jakarta.persistence.*;

 //import javax.persistence.Entity;
 //import javax.persistence.GeneratedValue;
 //import javax.persistence.GenerationType;
 //import javax.persistence.Id;
 //import javax.persistence.EnumType;
 //import javax.persistence.Enumerated;
 import java.util.Date;

 @Entity
public class Task {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String name;
 private String description;
 @Enumerated(EnumType.STRING)
 private TaskStatus status;
 private Date createdAt;
 private Date updatedAt;

  public enum TaskStatus {
   Pending,
   Completed,
   Canceled
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(Date UpdatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setStatus(TaskStatus status) {
  }
 }
