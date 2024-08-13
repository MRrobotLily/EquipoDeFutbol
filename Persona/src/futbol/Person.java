/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author niza
 */
public class Person {
       
    private String nombre;
    private int edad;
    private float estatura;
    private String sexo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

//    public Person() {
//    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Person(String nombre, int edad, float estatura, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
    }
    
    public void mostrarinformacion(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Estatura: " + estatura + ", Sexo: " + sexo);

    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public String getSexo() {
        return sexo;
    }
    
    

}
