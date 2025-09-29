package run;

import models.Vehiculo;
import models.Carro;
import models.Camion;
import models.Moto;
import models.Combustible;

public class Main {
    public static void main(String[] args) {
        /*
          Se crea un arreglo de la super clase Vehiculo y se utilizan las subclases
          para crear cada vehículo con los atributos de la super clase.
        */
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro("Toyota", "Corolla");
        vehiculos[1] = new Moto("Kawasaki", "Ninja");
        vehiculos[2] = new Camion("Mercedes Benz", "Citalo");

        // Recorremos el arreglo con la variable v
        for (Vehiculo v : vehiculos) {
            v.mover(); // Cada vehículo que forma parte del arreglo "vehiculos" imprime su movimiento

            // Si el vehículo implementa la interfaz Combustible, lo recargamos
            if (v instanceof Combustible) {
                /*
                  Hacemos un "cast" porque el arreglo es de tipo Vehiculo
                  y el método recargar() está en la interfaz Combustible.
                  El cast le dice al programa: "trata este objeto como Combustible"
                  para poder usar recargar().
                */
                ((Combustible) v).recargar();
            }
        }
    }
}
