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
public abstract class Animal {
    private int numlegs;

    public Animal(int numlegs) {
        this.numlegs = numlegs;
    }

    public int getNumlegs() {
        return numlegs;
    }
    public abstract void hacersonido();
}
