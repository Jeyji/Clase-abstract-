/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangulo = new Rectangulo(8,5,4);
        int l = rectangulo.getNumSides();
        double a = rectangulo.ccalcularArea();
        double p = rectangulo.calcularPerimetro();
        System.out.println("Rectangulo "+"Numero de lados: "+l+" Area: "+a+" Perimetro: "+p);
    }
}
