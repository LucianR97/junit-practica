package org.example.classes;

public class Usuario {

    private String nombre;
    private String apellido;

    public Usuario(){}

    public Usuario(String nombre, String apellido){
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido;
    }
}
