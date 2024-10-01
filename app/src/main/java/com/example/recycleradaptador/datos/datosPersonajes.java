package com.example.recycleradaptador.datos;

public class datosPersonajes {
    private String imagen;
    private String nombre;
    private String ocupacion;
    private String grado;
    private String descripcion;

    public datosPersonajes(String imagen, String nombre, String ocupacion, String grado, String descripcion ) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.grado = grado;
        this.descripcion=descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
