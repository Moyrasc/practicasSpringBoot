package com.cursospringboot.practicasJava01.models;

import lombok.Getter;
import lombok.Setter;

public class Usuario {
    /**
     * utilizando la libreria lombok y la anotación @Getter y @Setter
     * reducimos código ya que lombok se encarga de generarlos automaticamente
     * la notación @Column permite definir la estructura de las columnas y en este caso
     * al indicarle el nombre sabrá en donde tiene que buscar
     */
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private  String nombre;
    @Getter @Setter
    private  String apellido;
    @Getter @Setter
    private  String email;
    @Getter @Setter
    private  String phone;
}
