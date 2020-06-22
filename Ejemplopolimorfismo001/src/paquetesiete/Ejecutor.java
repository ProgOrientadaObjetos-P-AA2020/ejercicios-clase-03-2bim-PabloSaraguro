/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        
        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();
        
        System.out.println("Ingrese los datos según corresponda:");
        int c=1,r=1,t=1;
        
        for (int i = 0; i < 12; i++) {
            
            if(i<4){
                
                System.out.printf("    Cuadrado %d/4\n",c);
                System.out.print("Características:");
                String car=entrada.nextLine();
                System.out.print("Lado: ");
                double lad=entrada.nextDouble();
                entrada.nextLine();
                Cuadrado cuadrado1 = new Cuadrado();
                
                cuadrado1.establecerCaracteristicas(car);
                cuadrado1.establecerLado(lad);
                c++;
                figuras.add(cuadrado1);
            }
            else if(i>3&&i<7){
            
                
                System.out.printf("    Rombo %d/4\n",r);
                System.out.print("Características:");
                String car=entrada.nextLine();
                System.out.print("Diagonal menor: ");
                double diagmen=entrada.nextDouble();
                System.out.print("Diagonal Mayor: ");
                double diagmay=entrada.nextDouble();
                entrada.nextLine();
                
                Rombo rombo1 = new Rombo();
                
                rombo1.establecerCaracteristicas(car);
                rombo1.establecerDiagonalmenor(diagmen);
                rombo1.establecerDiagonalmayor(diagmay);
                r++;
                figuras.add(rombo1);
            }
            else{
                
                
                System.out.printf("\n    Triangulo %d/5\n",t);
                System.out.print("Características:");
                String car=entrada.nextLine();
                System.out.print("Base: ");
                double base=entrada.nextDouble();
                System.out.print("Altura: ");
                double altura=entrada.nextDouble();
                entrada.nextLine();
                Triangulo triangulo1 = new Triangulo();
                
                triangulo1.establecerCaracteristicas(car);
                triangulo1.establecerBase(base);
                triangulo1.establcerAltura(base);
                t++;
                figuras.add(triangulo1);
            }
        }
        
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
        
        System.out.println("\n    Listado de Figuras\n");
        
        for (int i = 0; i < figuras.size(); i++) {
            
            if(i==0){
                
                System.out.println("    Cuadrados\n");
            }
            if(i==4){
                System.out.println("--------------");
                System.out.println("    Rombos\n");
            }
            
            if(i==7){
                System.out.println("--------------");
                System.out.println("    Triangulos\n");
            }
            
            System.out.printf("\nCaracteristicas: %s\nArea: %.2f\n",
                    figuras.get(i).obtenerCaracteristicas(),
                    figuras.get(i).obtenerArea());
        }
        
        
 }
}
