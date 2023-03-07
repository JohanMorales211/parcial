package com.formulario.formulario.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Empleado {
    @NotEmpty
    @Size(min = 4, max = 4)    
    private String id;
    @NotEmpty(message ="El nombre no puede estar vacio")
    private String nombre;
    @NotEmpty(message ="El apellido no puede estar vacio")
    private String apellido;
    @NotEmpty
    private String correo;
    @NotEmpty
    private String direccion;
    @NotEmpty
    private String telefono;
    
}
