/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

/**
 *
 * @author Estudiante
 */
public class Gato extends Animal{

    public Gato(int numlegs) {
        super(numlegs);
    }

    @Override
    public void hacersonido() {
        System.out.println("Miau....");
    }
    
}
