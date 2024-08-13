/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author niza
 */
    public class Jugador extends Person{
        
        private int numero; 
        private String posicion;

    public Jugador(int numero, String posicion, String nombre, int edad, float estatura, String sexo) {
        super(nombre, edad, estatura, sexo);
        this.numero = numero;
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }
        
        
        
    }
