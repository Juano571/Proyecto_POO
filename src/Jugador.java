/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Arellano <juan.arellano at epn.edu.ec>
 */
public class Jugador extends Persona {

    private int numero;
    private String posicion;

    //Constructor
    public Jugador(String nombre, String apellido, String cedula, int numero, String posicion) {
        super(nombre, apellido, cedula);
        this.numero = numero;
        this.posicion = posicion;
    } 
        //Métodos set
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    //Métodos get
    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return nombre + apellido;
    }

    
}

