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
public class ClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato gato = new Gato(4);
        gato.hacersonido();
        
        //Animal animal =new Animal(8);
        //No se puede hacer
        Animal animal =new Gato(8);
        animal.hacersonido();
    }
    
}
