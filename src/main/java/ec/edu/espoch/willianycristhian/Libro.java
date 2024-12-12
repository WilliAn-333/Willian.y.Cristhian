/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.willianycristhian;

/**
 *
 * @author PERSONAL
 */
public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private Genero genero;  
  
   
    public Libro(String titulo, String autor, double precio, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.genero = genero;
    }

    
    public void mostrarDetalles() {
        double precioConIVA = precio * 1.12;
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("Precio sin IVA: $" + precio);
        System.out.println("Precio con IVA: $" + precioConIVA);
    }

 
    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }
}
        
    

        
       


