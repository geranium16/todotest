package com.example.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.model.todo;

public interface  TodoRepositoy extends JpaRepository<todo, Long>{
}


