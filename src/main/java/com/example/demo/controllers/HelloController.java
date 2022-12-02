package com.example.demo.controllers;

import com.example.demo.domain.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public List<Todo> getIndex() {
        List<Todo> todos = Arrays.asList(
                new Todo(1, "Buy milk"),
                new Todo(2, "Prepare presentation"),
                new Todo(3, "Write tutorial")
        );
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("serverTime", new Date());
        mav.addObject("todos", todos);
        return todos;
    }

}
