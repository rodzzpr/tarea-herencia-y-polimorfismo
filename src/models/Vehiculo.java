package models;

// Clase abstracta
public abstract class Vehiculo
{
    // Atributos
    private String marca;
    private String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método abstracto
        public abstract void mover();
}

/*
  Notas:
   - Clase abstracta: es como un “molde incompleto”.
   No se puede usar directamente para crear objetos,
   solo sirve para que otras clases la hereden y
   completen lo que falta.

   - Método abstracto: es un método declarado pero sin
   código dentro. Obliga a las clases hijas a darle
   u propia implementación.
 */
