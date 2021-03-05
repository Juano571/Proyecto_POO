
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
public class Equipo extends Partido{
    private String nombreEquipo;
    private String representante;
    private String contactoRepresentante;
    //Implemetación de relación de composición
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    
    //Constructor
    public Equipo(String nombreEquipo, String representante, String contacto){
        this.nombreEquipo = nombreEquipo;
        this.representante = representante;
        this.contactoRepresentante = contacto;
    }
    
    //Métodos set 
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void setContactoRepresentante(String contactoRepresentante) {
        this.contactoRepresentante = contactoRepresentante;
    }

    //Métodos get
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public String getRepresentante() {
        return representante;
    }

    public String getContactoRepresentante() {
        return contactoRepresentante;
    }
    
    //Métodos
    
    //Método que recibe un jugador y lo agrega al array de jugadores
    public void agregarJugador(Jugador j){
        this.jugadores.add(j);
    }
}
