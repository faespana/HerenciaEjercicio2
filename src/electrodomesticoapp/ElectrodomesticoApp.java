package electrodomesticoapp;

import electrodomesticoapp.entities.Electrodomestico;

public class ElectrodomesticoApp {

    public static void main(String[] args) {
        Electrodomestico elec = new Electrodomestico(500d, "Blanco", 'C', 20.5d);
        elec.comprobarConsumoEnergetico();
    }
    
}
