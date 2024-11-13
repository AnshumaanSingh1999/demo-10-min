//API Endpoints Logic Here.


package com.example.demo_10_min.Controllers;

import com.example.demo_10_min.Models.Todo;
import com.example.demo_10_min.Services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController annotation is used to make restful web services(accept request and give response).
@RestController
//@RequestMapping annotation is used to map requests to controllers methods.
@RequestMapping("/todos")
public class ToDoController {

    //@Autowired annotation is used for dependency injection.
    @Autowired
    private ToDoService todoservice;

    //@PostMapping annotation is used to handle HTTP POST requests.
    @PostMapping
    public Todo createToDo(@RequestBody Todo todo){
        return todoservice.createList(todo);
    }

    //@GetMapping annotation is used to handle HTTP Get requests.
    @GetMapping
    public List<Todo> getAllToDo(){
        return todoservice.getList();
    }



}
