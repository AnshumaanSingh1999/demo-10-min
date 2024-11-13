//Business Logic Here.

package com.example.demo_10_min.Services;

import com.example.demo_10_min.Models.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private List<Todo> todolist=new ArrayList<>();

    public Todo createList(Todo todo){
        todolist.add(todo);
        return todo;
    }

    public List<Todo> getList(){
        return todolist;
    }

}
