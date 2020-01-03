package com.example.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.model.user;

public interface  UserRepository extends JpaRepository<user, Long>{
}


