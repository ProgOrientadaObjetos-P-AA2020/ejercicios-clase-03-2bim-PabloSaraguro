/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

public class Triangulo extends Figura{
    
    double base;
    double altura;

    public void establecerBase(double b) {
        base = b;
    }
    
    public void establcerAltura(double a) {
            altura = a;
    }
    
    @Override
    public void calcular_area(){
        area = obtenerBase() * obtenerAltura();
    }
    
    public double obtenerBase() {
        return base;
    }
    
    public double obtenerAltura() {
        return altura;
    }

    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Base: %.2f\n"
                + "Altura: %.2f\n"
                + "Area: %.2f\n",
                cadenaFinal,obtenerBase(),obtenerAltura(),
                obtenerArea());
        
        return cadenaFinal;
    }
    
}
