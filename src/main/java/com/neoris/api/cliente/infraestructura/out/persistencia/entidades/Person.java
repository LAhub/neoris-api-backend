package com.neoris.api.cliente.infraestructura.out.persistencia.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person {
    String nombre;
    String genero;
    String edad;
    String identificacion;
    String direccion;
    String telefono;
}
