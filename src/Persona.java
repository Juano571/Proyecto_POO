/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Arellano <juan.arellano at epn.edu.ec>
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String cedula;

    //Constructor
    public Persona(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    //Métodos
    //Método que verifíca la cédula y regresa un booleano
    public boolean esCedula() {
        int digitoVerificador = Integer.parseInt((cedula.charAt(9)) + "");
        int digitoAVerificar = 0;
        int digitoPar;
        int sumaPar = 0;
        int sumaImpar = 0;
        int sumaTotal;
        for (int i = 0; i < cedula.length() - 1; i++) {
            if (i % 2 == 0) {
                digitoPar = 2 * Integer.parseInt((cedula.charAt(i)) + "");
                if (digitoPar > 9) {
                    digitoPar = digitoPar - 9;
                }
                sumaPar += digitoPar;
            } else {
                sumaImpar += Integer.parseInt((cedula.charAt(i)) + "");
            }
        }
        sumaTotal = sumaPar + sumaImpar;
        if (sumaTotal % 10 == 0) {
            digitoAVerificar = 0;
        } else {
            switch ((int) (sumaTotal / 10)) {
                case 1:
                    digitoAVerificar = 20 - sumaTotal;
                    break;
                case 2:
                    digitoAVerificar = 30 - sumaTotal;
                    break;
                case 3:
                    digitoAVerificar = 40 - sumaTotal;
                    break;
                case 4:
                    digitoAVerificar = 50 - sumaTotal;
                    break;
                case 5:
                    digitoAVerificar = 60 - sumaTotal;
                    break;
                case 6:
                    digitoAVerificar = 70 - sumaTotal;
                    break;
                case 7:
                    digitoAVerificar = 80 - sumaTotal;
                    break;
                case 8:
                    digitoAVerificar = 90 - sumaTotal;
                    break;
                case 9:
                    digitoAVerificar = 100 - sumaTotal;
                    break;
            }
        }
        return digitoVerificador == digitoAVerificar;
    }
}
