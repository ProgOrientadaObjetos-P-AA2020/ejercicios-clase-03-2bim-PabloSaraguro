/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

public class Cuadrado extends Figura{
    
        double lado;
        
    public void establecerLado(double l) {
            lado = l;
    }
    
    public double obtenerLado() {
        return lado;
    }

    @Override
    public void calcular_area(){
        area = obtenerLado() * obtenerLado();
    }
        
}
