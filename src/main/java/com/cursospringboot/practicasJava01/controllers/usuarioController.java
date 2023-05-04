package com.cursospringboot.practicasJava01.controllers;

import com.cursospringboot.practicasJava01.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usuarioController {
    //relaciona un método con una petición http
    @RequestMapping(value = "usuario")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Noe");
        usuario.setApellido("Sola");
        usuario.setEmail("noemisolac@gmail.com");
        usuario.setPhone("666666666");
        return usuario;
    }
    @RequestMapping(value = "usuario2")
    public Usuario editarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Noe");
        usuario.setApellido("Sola");
        usuario.setEmail("noemisolac@gmail.com");
        usuario.setPhone("666666666");
        return usuario;
    }
    @RequestMapping(value = "usuario3")
    public Usuario borrarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Noe");
        usuario.setApellido("Sola");
        usuario.setEmail("noemisolac@gmail.com");
        usuario.setPhone("666666666");
        return usuario;
    }
    @RequestMapping(value = "usuario4")
    public Usuario encontarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Noe");
        usuario.setApellido("Sola");
        usuario.setEmail("noemisolac@gmail.com");
        usuario.setPhone("666666666");
        return usuario;
    }

}
