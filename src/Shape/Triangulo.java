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
public class Triangulo extends Shape{
    private int alto;
    private int ancho;

    public Triangulo(int alto, int ancho, int numSides) {
        super(numSides);
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }


    @Override
    public double ccalcularArea() {
        return((this.alto*this.ancho)/2);
    }

    @Override
    public double calcularPerimetro() {
       return(3*this.ancho);
    }
    
}
