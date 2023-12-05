package com.lama.controlls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/todo")
public class TodoController {
	

	@Autowired
	private TodoItemRepository todoItemRepository;

	@GetMapping
	public List<TodoItem> getAllTodoItems(){
		return todoItemRepository.findAll();
	}

	@PostMapping
	public TodoItem addTodoItem(@RequestBody TodoItem todoItem){
		return todoItemRepository.save(todoItem);
	}
	
//add other crud method as needed.
}
