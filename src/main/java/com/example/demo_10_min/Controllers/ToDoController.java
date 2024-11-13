//API Endpoints Logic Here.


package com.example.demo_10_min.Controllers;

import com.example.demo_10_min.Models.Todo;
import com.example.demo_10_min.Services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {

    @Autowired
    private ToDoService todoservice;

    @PostMapping
    public Todo createToDo(@RequestBody Todo todo){
        return todoservice.createList(todo);
    }

    @GetMapping
    public List<Todo> getAllToDo(){
        return todoservice.getList();
    }



}
