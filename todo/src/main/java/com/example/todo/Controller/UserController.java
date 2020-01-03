package com.example.todo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.todo.model.user;
import com.example.todo.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	@PostMapping("/signup")
	public String signupPost(@ModelAttribute user User) {
		userRepository.save(User);
		return "redirect:/";
	}
}