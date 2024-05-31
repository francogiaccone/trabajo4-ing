package com.mycompany.trabajo4.ing;

public class Auto {
    
    private String modelo, patente;
    private Double combustible = 50.0;

    public Auto(String modelo, String patente) {
        this.modelo = modelo;
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getCombustible() {
        return combustible;
    }

    public void setCombustible(Double combustible) {
        this.combustible = combustible;
    }

    
}
