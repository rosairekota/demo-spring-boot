package com;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Todo;
import com.repository.TodoRepository;

@SpringBootApplication
@RestController
public class MainApplication {
	private TodoRepository todoRepository;
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
    @GetMapping("/")
	public String index(){
		
		return String.format("Hello %s!","demo");
	}

	@GetMapping(path="/todos")

	public @ResponseBody Iterable<Todo> getTodos(){
		
		return todoRepository.findAll();
	}
}
