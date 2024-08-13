/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author niza
 */
public class Suplente extends Jugador {
    
    private int minutos; 

    public Suplente(int minutos, int numero, String posicion, String nombre, int edad, float estatura, String sexo) {
        super(numero, posicion, nombre, edad, estatura, sexo);
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }
    
    public void entrarAlJuego() {
        System.out.println(super.getNombre() + " ha entrado al juego!");
    }

    
}
