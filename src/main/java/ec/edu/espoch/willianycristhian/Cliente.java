/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.willianycristhian;

/**
 *
 * @author PERSONAL
 */
public class Cliente {
    private String nombre;
    private String idUnico;

   
    public Cliente(String nombre, String idUnico) {
        this.nombre = nombre;
        this.idUnico = idUnico;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getIdUnico() {
        return idUnico;
    }
}
    

