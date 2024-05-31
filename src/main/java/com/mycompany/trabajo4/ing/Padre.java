package com.mycompany.trabajo4.ing;

public class Padre {
    
    protected String nombre, apellido;
    protected Casa casa;
    protected Auto auto;
    
    public Padre(Auto auto) {
        this.nombre = "Papá";
        this.apellido = "López";
        construirCasa();
        comprarAuto(auto);
    }
    
    private void construirCasa() {
        this.casa = new Casa("Centro (2 pisos)");
    }
    
    private void comprarAuto(Auto auto) {
        this.auto = auto;
    }
    
    protected void cantar() {
        System.out.print("Asi canta tu padre, Don " + apellido);
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

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    
}
