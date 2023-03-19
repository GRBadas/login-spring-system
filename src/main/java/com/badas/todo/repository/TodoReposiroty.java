package com.badas.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.badas.todo.model.Todo;

public interface TodoReposiroty extends JpaRepository<Todo, Long>{

}
