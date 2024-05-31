package com.mycompany.trabajo4.ing;

public class Celular {
   
    private String compania, numero;
    private Double saldo;

    public Celular(String compania, String numero, Double saldo) {
        this.compania = compania;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }  
}
