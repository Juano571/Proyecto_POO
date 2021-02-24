/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas Tapia
 */
public class Juez extends Persona {
        
    //Variable de instacia
    private double vocalia;

    public Juez(String nombre, String apellido, String cedula, double vocalia) {
        super(nombre, apellido, cedula);
        this.vocalia = vocalia;
    }
            
    //Método de instancia

    public double getVocalia() {
        return vocalia;
    }

    public void setVocalia(double vocalia) {
        this.vocalia = vocalia;
    }
    
            
}
