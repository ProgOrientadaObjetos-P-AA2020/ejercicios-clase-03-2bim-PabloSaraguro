
package paquetecinco;

import java.util.ArrayList;
import java.util.Scanner;
import paquetecuatro.Estudiante;
import paquetecuatro.EstudianteDistancia;
import paquetecuatro.EstudiantePresencial;


public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador=0;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        
        
        System.out.println("Establezca el numero de estudiantes que desea "
                + "ingresar: ");
        System.out.print("1. Numeros Estudiantes Presencial:");
        int numestpresencial=entrada.nextInt();
        System.out.print("2. Numeros Estudiantes Distancia: ");
        int numestdistancia=entrada.nextInt();
        
        int j=0;
        int k=numestpresencial;
        
        do{
        System.out.print("\nSeleccione el Tipo de estudiante que desea ingresar:\n"
                + "1. Estudiantes Presencial\n"
                + "2. Estudiantes Distancia\n0. SALIR\nOpcion:");
        tipoEstudiante=entrada.nextInt();
        System.out.println();
        switch (tipoEstudiante){
            
            case 1: 
                    if(j<numestpresencial){
                        System.out.println("    Estudiantes Presencial\n");
                        entrada.nextLine();
                        System.out.print("Nombre:");
                        nombresEst=entrada.nextLine();
                        System.out.print("Aprellidos:");
                        apellidosEst=entrada.nextLine();
                        System.out.print("Identificacion:");
                        identificacionEst=entrada.nextLine();
                        System.out.print("Edad:");
                        edadEst=entrada.nextInt();
                        System.out.print("Costo de Credito:");
                        costoCred=entrada.nextDouble();
                        System.out.print("Numero de Creditos:");
                        numeroCreds=entrada.nextInt();
                        
                        EstudiantePresencial estudianteP = new EstudiantePresencial();
                        
                        estudianteP.establecerNombresEstudiante(nombresEst);
                        estudianteP.establecerApellidoEstudiante(apellidosEst);
                        estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                        estudianteP.establecerEdadEstudiante(edadEst);
                        estudianteP.establecerNumeroCreditos(numeroCreds);
                        estudianteP.establecerCostoCredito(costoCred);
                        
                        estudiantes.add(estudianteP);
                        j++;
                        contador++;
                    }
                    else{
                        System.out.println("\nLista LLena");
                    }
                    
                break;
                
            case 2:
                
                if(k<(numestpresencial+numestdistancia)){
                    System.out.println("    Estudiantes Distancia\n");
                    entrada.nextLine();
                    System.out.print("Nombre:");
                    nombresEst=entrada.nextLine();
                    System.out.print("Aprellidos:");
                    apellidosEst=entrada.nextLine();
                    System.out.print("Identificacion:");
                    identificacionEst=entrada.nextLine();
                    System.out.print("Edad:");
                    edadEst=entrada.nextInt();
                    System.out.print("Ingrese el número de asignaturas:");
                    numeroAsigs = entrada.nextInt();
                    System.out.print("Ingrese el costo de cada cada asignatura:");
                    costoAsig = entrada.nextDouble();

                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    
                    estudiantes.add(estudianteD);
                    k++;
                    contador++;
                }
                else{
                        System.out.println("\nLista LLena");
                    }
                
                break;
                
            case 0: contador=(numestpresencial+numestdistancia);
                break;
            
            
        }
            
        }while(contador<(numestpresencial+numestdistancia));
        
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n\n",                        
                  estudiantes.get(i));
            
        }
        
    }

}