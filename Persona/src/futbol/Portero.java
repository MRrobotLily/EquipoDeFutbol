/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author niza
 */
public class Portero extends Jugador{
    
    private int paradas; 

    public Portero(int paradas, int numero, String posicion, String nombre, int edad, float estatura, String sexo) {
        super(numero, posicion, nombre, edad, estatura, sexo);
        this.paradas = paradas;
    }

    public int getParadas() {
        return paradas;
    }
    
        public void bloquearTiro() {
        System.out.println(super.getNombre() + " ha bloqueado un tiro!");
    }

}
