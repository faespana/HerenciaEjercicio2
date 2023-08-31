package electrodomesticoapp.entities;

public class Televisor extends Electrodomestico{
    
    private Double resolucion;
    private Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean sintonizador, Double precio, String color, Character consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return super.toString() + ", resolucion=" + resolucion + ", sintonizador=" + sintonizador;
    }

 
}
