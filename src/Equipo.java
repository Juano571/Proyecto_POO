
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Juan Arellano <juan.arellano at epn.edu.ec>
 */
public class Equipo {
    private String nombreEquipo;
    
    //Implemetación de relación de composición
    ArrayList<Jugador> jugadores = new ArrayList<>();
    
    //Constructor
    public Equipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }
    
    //Métodos set 
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    //Métodos get
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    //Métodos
    
    //Método que recibe un jugador y lo agrega al array de jugadores
    public void agregarJugador(Jugador j){
        this.jugadores.add(j);
    }
}
