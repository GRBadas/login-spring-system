package com.badas.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badas.todo.model.Todo;
import com.badas.todo.repository.TodoReposiroty;

@RestController
@RequestMapping("/api/v1/")
public class TodoController {
	
	@Autowired
	private TodoReposiroty todoReposiroty;
	
	@GetMapping("/tasks")
	public List<Todo> getAllTasks(){
		return todoReposiroty.findAll();
	}
	
	@PostMapping("/add-task")
	public Todo createTask(@RequestBody Todo todo) {
		return todoReposiroty.save(todo);
	}

}
