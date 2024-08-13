/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author niza
 */
public class Defensa extends Jugador {
    
    private int bloqueos;

    public Defensa(int bloqueos, int numero, String posicion, String nombre, int edad, float estatura, String sexo) {
        super(numero, posicion, nombre, edad, estatura, sexo);
        this.bloqueos = bloqueos;
    }

    public int getBloqueos() {
        return bloqueos;
    }
    
        public void bloquear() {
        System.out.println(super.getNombre() + " ha bloqueado un tiro!");
    }

}
