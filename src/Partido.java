
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thomas Tapia
 */
public class Partido {

    //Variables de instancia
    private int fecha;
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    //Métodos de instancia
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    
 //Método que recibe equipos y los agrega al a
    public void agregarEquipo(Equipo e) {
        this.equipos.add(e);
    }

}
