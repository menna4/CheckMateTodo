package com.todo.checkmate.service;

import com.todo.checkmate.dto.TodoDto;

import java.util.List;

public interface TodoService {

    void createTodo(TodoDto todoDto);
    TodoDto updateTodo(TodoDto todoDto);
    Boolean deleteTodo(Long id);
    List<TodoDto> findAllTodo();
    TodoDto findTodoById(Long id);

}
