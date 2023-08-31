package electrodomesticoapp.services;

import electrodomesticoapp.entities.Electrodomestico;
import electrodomesticoapp.entities.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodomesticoService{
    
    private final Scanner scanner;
    
    public LavadoraService() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }
    
    public double precioFinal(double carga, double precio) {
        if (carga > 30) {
            return precio + 500d;
        }
        
        return precio;
    }
    
    public Lavadora crearLavadora() {
        System.out.println("Creando una lavadora: ");
        Lavadora lavadora = new Lavadora();
        
        Electrodomestico elec = crearElectrodomestico();
        
        System.out.print("Carga: ");
        double carga = Double.valueOf(scanner.nextLine());
        
        lavadora.setCarga(carga);
        lavadora.setPrecio(precioFinal(carga, elec.getPrecio()));
        lavadora.setColor(elec.getColor());
        lavadora.setConsumoEnergetico(elec.getConsumoEnergetico());
        lavadora.setPeso(elec.getPeso());
        
        return lavadora;
    }
}
