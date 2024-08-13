/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author niza
 */
public class Equipo implements equipoInterfaz {
    
    
    private String nombre; 
    private int NoDeJugadores;
    private List<Jugador> jugadores;

    public Equipo(String nombre, int NoDeJugadores) {
        this.nombre = nombre;
        this.NoDeJugadores = NoDeJugadores;
        this.jugadores = new ArrayList<Jugador>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNoDeJugadores() {
        return NoDeJugadores;
    }

    @Override
    public void agregarMiembro(Jugador jugador) {
        jugadores.add(jugador); 
        NoDeJugadores = jugadores.size();
    }

    @Override
    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Número de Jugadores: " + NoDeJugadores);
        for (Jugador jugador : jugadores) {
            jugador.mostrarinformacion();
        }

    }
    
    
    
}
