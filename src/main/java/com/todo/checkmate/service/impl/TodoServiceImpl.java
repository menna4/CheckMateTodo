package com.todo.checkmate.service.impl;

import com.todo.checkmate.dto.TodoDto;
import com.todo.checkmate.service.TodoService;

import java.util.List;

public class TodoServiceImpl implements TodoService {
    @Override
    public void createTodo(TodoDto todoDto) {

    }

    @Override
    public TodoDto updateTodo(TodoDto todoDto) {
        return null;
    }

    @Override
    public Boolean deleteTodo(Long id) {
        return null;
    }

    @Override
    public List<TodoDto> findAllTodo() {
        return List.of();
    }

    @Override
    public TodoDto findTodoById(Long id) {
        return null;
    }
}
