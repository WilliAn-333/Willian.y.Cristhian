/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.willianycristhian;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author PERSONAL
 */
public class Compra {
      private Cliente cliente;
    private List<Libro> libros;

   
    public Compra(Cliente cliente) {
        this.cliente = cliente;
        this.libros = new ArrayList<>();
    }

    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    
    public void mostrarResumen() {
        System.out.println("Cliente: " + cliente.getNombre());
        double totalConIVA = 0;
        for (Libro libro : libros) {
            double precioConIVA = libro.getPrecio() * 1.12;
            totalConIVA += precioConIVA;
            System.out.println("Libro: " + libro.getTitulo() +
                    ", Género: " + libro.getGenero() +
                    ", Precio con IVA: $" + precioConIVA);
        }
        System.out.println("Total con IVA: $" + totalConIVA);
    }
}

       

