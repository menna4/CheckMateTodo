package com.todo.checkmate.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Todo {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private Date  createdAt;
    private Date updatedAt;
    private Date dueDate;
    private List<String> tags;
    private Priority priority;

}
