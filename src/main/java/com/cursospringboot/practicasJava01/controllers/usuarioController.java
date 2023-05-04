package com.cursospringboot.practicasJava01.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usuarioController {
    //relaciona un método con una petición http
    @RequestMapping(value = "usuario")
    public List<String> usuario(){
        return List.of("user");
    }
}
