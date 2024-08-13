/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futbol;

/**
 *
 * @author niza
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Person persona = new Person("Daniel Perez",20,150,"Masculino");
           Jugador jugador = new Jugador(10,"Delantero","Leonel Messi", 37, 160,"Masculino");
           
           Equipo equipo = new Equipo("Gatos", 22);

        // Crear jugadores
        Portero portero = new Portero(3, 6, "Portero", "Iker Casillas", 56, 150, "Masculino");
        Delantero delantero = new Delantero(5, 24, "Delantero", "Cristiano Ronaldo", 39, 175, "Masculino");
        Suplente suplente = new Suplente(30, 3, "Suplente", "Robert Lewandowski", 45, 180, "Masculino");
        Defensa defensa = new Defensa(5, 15, "Defensa", "Dani Alves", 40, 170, "Masculino");

        // Agregar miembros al equipo
        equipo.agregarMiembro(portero);
        equipo.agregarMiembro(delantero);
        equipo.agregarMiembro(suplente);
        equipo.agregarMiembro(defensa);

        // Mostrar información del equipo
        equipo.mostrarEquipo();

    }
    
}
