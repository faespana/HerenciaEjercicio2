package electrodomesticoapp;

import electrodomesticoapp.entities.Electrodomestico;
import electrodomesticoapp.services.LavadoraService;
import electrodomesticoapp.services.TelevisorService;

public class ElectrodomesticoApp {

    public static void main(String[] args) {
        TelevisorService ts = new TelevisorService();
        
        LavadoraService ls = new LavadoraService();
        
        System.out.println(ls.crearLavadora());
        
        //System.out.println(ts.crearTelevisor());
    }
    
}
