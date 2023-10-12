/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Itzel Hernández Hernández
 * Clase que contiene los métodos de lo que hace una persona
 */
public class Persona {
    private String nombre, direccion, apellidos;
    private int edad, estatura;

/**
 * Constructor vacío de persona
 */
    public Persona() {
    }
/**
 * Constructor lleno de persona
 * @param nombre : nombre de la persona en String
 * @param direccion : dirección de la persona en String
 * @param apellidos : apellidos de la persona en String
 * @param edad  : edad de la persona en primitivo entero
 * @param estatura : estatura de la persona en primitivo entero
 */
    public Persona(String nombre, String direccion, String apellidos, int edad, int estatura) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.apellidos=apellidos;
        this.estatura= estatura;
    }
    /**
     * Método get Nombre
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método set Nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo get Direccion
     * @return direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Método set direccion
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo get Edad
     * @return edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Método set edad
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Método get Apellidos
     * @return apellidos de la persona
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * Método set Apellidos
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Método get Estatura
     * @return estatura de la persona
     */
    public int getEstatura() {
        return estatura;
    }
    /**
     * Método set Estatura
     * @param estatura 
     */
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    
    /**
     * Método que sirve para que la persona hable
     * @param var : lo que la persona va a decir
     */
    public void hablar(String var){
        System.out.println(var);
    }
    /**
     * Método que sirve para que la persona simule el 
     * sonido de comer
     */
    public void comer(){
        System.out.println("Ñam ñam ñam");
    }
    /**
     * Método que sirve para indicar las horas que durmió
     * @param horas : horas que durmió en total
     */
    public void dormir(int horas){
        System.out.println("Dormí" + horas + "horas");
    }
    /**
     * Método que sirve para indicar la canción favorita
     * @param cancion : cancion favorita
     */
    public void cantar (String cancion){
        System.out.println("Mi canción favorita es:" + cancion);
    }
    /**
     * Método que sirve para que la persona hable acerca de que trabajo mucho
     */
    public void trabajar(){
        System.out.println("Hoy trabajé mucho");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", apellidos=" + apellidos + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
    /**
     * Método toString sobreescrito que muestra los valores de los atributos
     * @return concatenación de los  valores de los atributos
     */

    
}
