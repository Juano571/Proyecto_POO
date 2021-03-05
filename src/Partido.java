
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
    
    public static int[][] generarFechas(int numEquipos) {
        // TODO code application logic here
        
        int j=1;
        int[][]fechas=new int[numEquipos/2][(numEquipos-1)*2];
        
        
        for(int k=0;k<(numEquipos-1)*2;k+=2){
            for(int i=0;i<numEquipos/2;j++,i++){
                
                if(i==0&&(k/2)%2==1){
                    fechas[i][k+1]=j;
                }else{
                    fechas[i][k]=j;
                }
                
                if(j==numEquipos-1){
                    j=0;
                }
                
                
            }
        }
        
        for(int i=0;i<(numEquipos-1)*2;i+=2){
            if((i/2)%2==1){
                    fechas[0][i]=numEquipos;
                }else{
                    fechas[0][i+1]=numEquipos;
                }
        }
        j=numEquipos-1;
        for(int k=1;k<(numEquipos-1)*2;k+=2){
            for(int i=1;i<numEquipos/2;j--,i++){
                fechas[i][k]=j;
                if(j==1){
                    j=numEquipos;
                }
            }
        }    
        return fechas;
        
    }

}
