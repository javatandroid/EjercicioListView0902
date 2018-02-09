package com.example.ejerciciolistview0902;

/**
 * Created by DIDACT on 09/02/2018.
 */

public class Ejercicio {

    String nombre;
    String rep;
    String repmax;
    String imagen;

    public Ejercicio(String nombre, String rep, String repmax, String imagen) {
        this.nombre = nombre;
        this.rep = rep;
        this.repmax = repmax;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        this.rep = rep;
    }

    public String getRepmax() {
        return repmax;
    }

    public void setRepmax(String repmax) {
        this.repmax = repmax;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
