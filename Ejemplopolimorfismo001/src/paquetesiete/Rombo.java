/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

public class Rombo extends Figura{
    
    double diagmenor;
    double diagmayor;
    
    
    public void establecerDiagonalmayor(double dma) {
        diagmayor = dma;
    }
    
    public void establecerDiagonalmenor(double dme) {
        diagmenor = dme;
    }
    
    @Override
    public void calcular_area(){
        area = (obtenerDiagonalmenor() * obtenerDiagonalmayor())/2;
    }
    
    public double obtenerDiagonalmenor() {
        return diagmenor;
    }

    public double obtenerDiagonalmayor() {
        return diagmayor;
    }

   @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Diagonal menor: %.2f\n"
                + "Diagonal Mayor: %.2f\n"
                + "Area: %.2f\n",
                cadenaFinal,obtenerDiagonalmenor(),obtenerDiagonalmayor(),
                obtenerArea());
        
        return cadenaFinal;
    }
    
  
}
