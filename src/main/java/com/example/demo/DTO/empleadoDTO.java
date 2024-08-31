package com.example.demo.DTO;

import com.example.demo.Entity.Empleado;

public class empleadoDTO {

    private int nroDocumento;
    private String nombre;
    private String apellido;
    private String email;
    private String fechaNacimiento;
    private String fechaCreacion;

    public Empleado toEntity() {
        Empleado entity = new Empleado();

        entity.setNroDocumento(this.nroDocumento);
        entity.setNombre(this.nombre);
        entity.setApellido(this.apellido);
        entity.setEmail(this.email);
        entity.setFechaNacimiento(this.fechaNacimiento);
        entity.setFechaCreacion(this.fechaCreacion);

        return entity;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }
    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}