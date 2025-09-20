package models;

// Interfaz Combustible
public interface Combustible {
    // Método abstracto (por defecto en interfaces)
    void recargar();
}

/*
   Notas:
   - Una interfaz define un "contrato" que las clases deben cumplir.
   - Los métodos en una interfaz son abstractos por defecto
     (se declaran pero no tienen código).
   - Cualquier clase que implemente esta interfaz está obligada
     a definir el método recargar().
*/
