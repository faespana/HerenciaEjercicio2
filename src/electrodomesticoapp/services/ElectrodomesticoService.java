package electrodomesticoapp.services;

import electrodomesticoapp.entities.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoService {

    private final Scanner leer;

    public ElectrodomesticoService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Electrodomestico crearElectrodomestico() {
        Electrodomestico elec = new Electrodomestico();

        elec.setPrecio(1000.00);
        System.out.print("El precio base del electrodomestico es: " + elec.getPrecio());

        System.out.print("Ingrese el color del electrodomestico: ");
        elec.setColor(leer.next());
        comprobarColor(elec);

        System.out.print("Ingrese el consumo energetico de acuerdo a la tabla de consumo: ");
        elec.setConsumoEnergetico(leer.next().charAt(0));
        comprobarConsumoEnergetico(elec);

        System.out.println("Ingrese el peso del electrodomestico: ");
        elec.setPeso(leer.nextDouble());

        return elec;
    }

    public void comprobarConsumoEnergetico(Electrodomestico elec) {
        int ascii = (int) elec.getConsumoEnergetico();
        if (!(ascii >= 65 && ascii <= 70)) {
            System.out.println("La categoria escogida para su electrodomestico es incorrecto, sera automaticamente clasificado como categoria F");
            elec.setConsumoEnergetico('F');
        }
    }

    public void comprobarColor(Electrodomestico elec) {
        String aux = elec.getColor().toLowerCase();
        switch (aux) {
            case "blanco":
                System.out.println("Color " + aux + " establecido");
                break;
            case "negro":
                System.out.println("Color " + aux + " establecido");
                break;
            case "rojo":
                System.out.println("Color " + aux + " establecido");
                break;
            case "azul":
                System.out.println("Color " + aux + " establecido");
                break;
            case "gris":
                System.out.println("Color " + aux + " establecido");
                break;
            default:
                System.out.println("El color ingresado no esta permitido, su color por defecto sera blanco");
                elec.setColor("blanco");
        }
    }

    public void precioFinal(Electrodomestico elec){
        
    }
}
