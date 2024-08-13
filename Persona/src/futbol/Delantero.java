/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author niza
 */
public class Delantero extends Jugador {
    
   private int Goles; 

    public Delantero(int Goles, int numero, String posicion, String nombre, int edad, float estatura, String sexo) {
        super(numero, posicion, nombre, edad, estatura, sexo);
        this.Goles = Goles;
    }

    public int getGoles() {
        return Goles;
    }
    
    public void marcarGol() {
        System.out.println(super.getNombre() + " ha marcado un gol!");
    }
   
    
}
