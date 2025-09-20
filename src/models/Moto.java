package models;

public class Moto extends Vehiculo implements Combustible
{
    // Constructor de la clase Moto con atributos de la super clase Vehiculo
    public Moto(String marca, String modelo)
    {
        super(marca, modelo);
    }

    // Sobrescribimos el método abstracto mover() de Vehiculo
    @Override
    // Implementación del método abstracto mover() de Vehiculo
    public void mover()
    {
        System.out.println("Moviendo moto...");
    }

    // Sobrescribimos el método abstracto recargar() de Combustible
    @Override
    // Implementación del método abstracto recargar() de la interfaz Combustible
    public void recargar(){
        System.out.println("Recargando moto...");
    }
}