package com.example.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nickName;
	private String passWord;
}
