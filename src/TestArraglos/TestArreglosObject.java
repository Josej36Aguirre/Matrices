
package TestArraglos;

import domain.Persona;


public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Jose");
        personas[1] = new Persona("Neyda");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona "+i+" ="+personas[i]);
        }
        
        String frutas[] = {"Naranja", "Platano","Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("i = " + i+", Elementos"+frutas[i]);
        }
    }
}
