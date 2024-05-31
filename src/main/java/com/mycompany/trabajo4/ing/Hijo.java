package com.mycompany.trabajo4.ing;

public class Hijo extends Padre implements Madre, Tio, Hermano{
    
    private Double billetera = 0.0;
    private Celular telefono;

    public Hijo(String nombre, Celular telefono, Auto auto) {
        super(auto);
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public void conducirAuto(Auto auto) {
        System.out.println("conduciendo un" + auto.getModelo() + " de un amigo");
    }

    @Override
    public void cantar() {
        super.cantar();
        System.out.println(" y asi canta " + nombre);
    }
    
    @Override
    public void bailar() {
        System.out.println("Se bailar como mi madre ♪ ♫ ♪");
    }

    @Override
    public int jugarLoteria() {
        this.billetera += Madre.FORTUNA;
        System.out.println("Heredaste la Fortuna de 50000.0 de tu madre la ROSA!! Ahora tienes $" + billetera);
        return Madre.NROSUERTE;
    }

    @Override
    public void heredarDinero(double money) {
        this.billetera += money;
        System.out.println("Tío Lucas te regala estos dolaritos! Ahora tienes $" + billetera);
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Se jugar futbol gracias a mi hermano");
    }

    @Override
    public int hacerGoles() {
        return 0;
    }
    
    
}
