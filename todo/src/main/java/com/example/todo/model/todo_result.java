package com.example.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class todo_result {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long todo_id;
	private String today;
	private int count;
}





