/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fi.poo;

/**
 *
 * @author itzel
 */
public class POOP06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola  mundo");
        Persona persona = new Persona ("Itzel","Iztapalapa", "Hdz Hdz", 21, 145);
        persona.hablar("Hola, soy una persona");
        System.out.println(persona);
        persona.trabajar();
        persona.comer();
        persona.cantar("Love It");
    }
    
}
