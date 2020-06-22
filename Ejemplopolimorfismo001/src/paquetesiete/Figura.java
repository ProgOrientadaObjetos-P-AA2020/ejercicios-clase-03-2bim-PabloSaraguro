/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public abstract class Figura {
    
    protected String caracteristicas;
    protected double area;

    

    public void establecerCaracteristicas(String c) {
        caracteristicas = c;
    }
    
    public abstract void calcular_area();
    
    public String obtenerCaracteristicas() {
        return caracteristicas;
    }

    public double obtenerArea() {
        return area;
    }
    
    
    
}
