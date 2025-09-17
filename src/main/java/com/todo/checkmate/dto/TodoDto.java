package com.todo.checkmate.dto;

import com.todo.checkmate.entity.Priority;
import lombok.Data;

import java.util.List;

@Data
public class TodoDto {
    private Long id;
    private String title;
    private String description;
    private Boolean completed;
    private List<String> tags;
    private Priority priority;
    private int pageNumber;
    private int pageSize;

}
