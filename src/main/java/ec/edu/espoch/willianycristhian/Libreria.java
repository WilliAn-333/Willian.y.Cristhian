/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.willianycristhian;

/**
 *
 * @author USER
 */
public class Libreria {
      public static void main(String[] args) {
        
        Libro libro1 = new Libro("willian la saga", "Willian caisaguano", 20.0, Genero.FICCION);
        Libro libro2 = new Libro("la avnetura de skipper", "Cristhian valencia", 30.0, Genero.NO_FICCION);

        
        Cliente cliente = new Cliente("Cristhian valencia", "C123");

       
        Compra compra = new Compra(cliente);
        compra.agregarLibro(libro1);
        compra.agregarLibro(libro2);

        
        libro1.mostrarDetalles();
        libro2.mostrarDetalles();

        
        compra.mostrarResumen();
    }
}
    

