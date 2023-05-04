package com.cursospringboot.practicasJava01.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usuarioController {
    //relaciona un método con una petición http
    @RequestMapping(value = "usuario")
    public String usuario(){
        return "usuario";
    }
}
