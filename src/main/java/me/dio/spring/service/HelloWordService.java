package me.dio.spring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWordService {

    public String helloWord(int i){
        return "Ola Pedro" + i;
    }
}
