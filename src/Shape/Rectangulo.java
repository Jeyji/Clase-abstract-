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
public class Rectangulo extends Shape{
    private int alto;
    private int ancho;

    public Rectangulo(int alto, int ancho, int numSides) {
        super(numSides);
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    @Override
    public double ccalcularArea() {
        return (this.ancho*this.alto);
    }

    @Override
    public double calcularPerimetro() {
        return ((2*this.alto)+(2*this.ancho));
    }
    
}
