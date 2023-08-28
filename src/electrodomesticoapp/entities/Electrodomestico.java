package electrodomesticoapp.entities;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico() {
        int ascii = (int) consumoEnergetico;
        if (!(ascii >= 65 && ascii <= 70)) {
            System.out.println("La categoria escogida para su electrodomestico es incorrecto, sera automaticamente clasificado como categoria F");
            setConsumoEnergetico('F');

        }
    }

    public void comprobarColor() {
        String aux = color.toLowerCase();
        switch (aux) {
            case "blanco":
                System.out.println("Color " + color + " establecido");
                break;
            case "negro":
                System.out.println("Color " + color + " establecido");
                break;
            case "rojo":
                System.out.println("Color " + color + " establecido");
                break;
            case "azul":
                System.out.println("Color " + color + " establecido");
                break;
            case "gris":
                System.out.println("Color " + color + " establecido");
                break;
            default:
                System.out.println("El color ingresado no esta permitido, su color por defecto sera blanco");
                setColor("blanco");
        }
    }
}
