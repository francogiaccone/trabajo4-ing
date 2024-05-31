package com.mycompany.trabajo4.ing;

public class Main {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Renault 12", "123LATA");
        Auto auto2 = new Auto("Ford Focus", "999POWR");
        
        Celular celular = new Celular("Personal", "123456", 10.0);
        
        Padre padre = new Padre(new Auto("Ford Focus", "AE678QZ"));
        
        System.out.println("Papá me dejo esta casa en zona " + padre.getCasa().getZona());
        
        Hijo hijo = new Hijo("Juan Carlos", celular, auto1);
        
        System.out.println("Papá me dejo este auto modelo: " + hijo.getAuto().getModelo());
        
        hijo.conducirAuto(auto2);
        
        hijo.jugarFutbol();
        
        hijo.bailar();
        
        System.out.println("SALIO EL NUMERO DE LA SUERTE " + hijo.jugarLoteria());
        
        hijo.cantar();
        
        hijo.heredarDinero(2000);
        
        System.out.println("Jugando futbol, hoy haz hecho " + hijo.hacerGoles() + " goles");
        
    }
    
}
