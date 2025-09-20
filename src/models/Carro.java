package models;

public class Carro extends Vehiculo implements Combustible
{
    // Constructor de la clase Carro con atributos de la super clase Vehiculo
    public Carro(String marca, String modelo)
    {
        super(marca, modelo);
    }

    // Sobrescribimos el método abstracto mover() de Vehiculo
    @Override
    // Implementación del método abstracto mover() de Vehiculo
    public void mover()
    {
        System.out.println("Moviendo carro...");
    }

    // Sobrescribimos el método recargar() de la interfaz Combustible
    @Override
    // Implementación del método recargar() de la interfaz Combustible
    public void recargar(){
        System.out.println("Recargando carro...");
    }
}
