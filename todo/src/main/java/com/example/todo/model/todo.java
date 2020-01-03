package com.example.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long user_id;	
	private String hostId;
	private String startDate;
	private String title;
	private String color;
	private int count;
	
}



