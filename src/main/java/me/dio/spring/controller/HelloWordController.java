package me.dio.spring.controller;

import me.dio.spring.dominio.User;
import me.dio.spring.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {

    /*
    private HelloWordService helloWordService;
    public HelloWordController(HelloWordService helloWordService) {
        this.helloWordService = helloWordService;
    }*/
    @Autowired
    private HelloWordService helloWordService;

    @GetMapping
    public String helloWord() {
        return helloWordService.helloWord(1);
    }

    @PostMapping("/{id}")
    public String hellowordPost(@PathVariable String id, @RequestBody User user) {
        return "Hello " + user.getClass().getName() + id;
    }

    @PostMapping("/{id}")
    public String hellowordPost(@PathVariable String id, @RequestBody User user, @RequestParam(value = "filter", defaultValue = "nenhum") String filttro) {
        return "Hello " + user.getClass().getName() + id;

    }
}