package com.cursospringboot.practicasJava01.controllers;

import com.cursospringboot.practicasJava01.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class usuarioController {
    //relaciona un método con una petición http
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Noe");
        usuario.setApellido("Sola");
        usuario.setEmail("noemisolac@gmail.com");
        usuario.setPhone("666666666");
        return usuario;
    }
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(12L);
        usuario.setNombre("Noe");
        usuario.setApellido("Sola");
        usuario.setEmail("noemisolac@gmail.com");
        usuario.setPhone("666666666");

        Usuario usuario2 = new Usuario();
        usuario.setId(2L);
        usuario2.setNombre("John");
        usuario2.setApellido("Doe");
        usuario2.setEmail("johndoe@gmail.com");
        usuario2.setPhone("666666555");

        Usuario usuario3 = new Usuario();
        usuario.setId(1L);
        usuario3.setNombre("Kate");
        usuario3.setApellido("Smith");
        usuario3.setEmail("katesm@gmail.com");
        usuario3.setPhone("622666555");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }
    @RequestMapping(value = "usuario23")
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
