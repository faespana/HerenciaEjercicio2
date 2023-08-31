package electrodomesticoapp.services;

import electrodomesticoapp.entities.Electrodomestico;
import electrodomesticoapp.entities.Televisor;
import java.util.Scanner;

public class TelevisorService extends ElectrodomesticoService{
    
    private Scanner leer;

    public TelevisorService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Televisor crearTelevisor() {
        
        Electrodomestico elec = crearElectrodomestico();
        Televisor tele = new Televisor();
        
        System.out.print("Ingrese la resolucion del televisor en pulgadas: ");
        tele.setResolucion(leer.nextDouble());
        
        System.out.println("Posee sintonizador TDT: ");
        tele.setSintonizador(leer.nextBoolean());
        
        return tele;
    }
    
    
    
}
