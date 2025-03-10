/* *****************************************************************************
* FUNCIONALIDAD: Calcular n primeros teminos sumatorio 
* ONJETIVO: Ejercicios de practica Gamificacion 3
* Fecha de creacion: 05.10.2022
* Fecha ultima de modificacion: 05.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion3; //este programa pertenece al proyecto


         //MiPirmerProyectoJava1

//Clase principal
public class Ejercicio7 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int termino1=0,termino2=1,maximo;
    
    
    System.out.println("Hasta que termino quieres calcular ");
    maximo=LT.readInt();
    
    for(int x=0;x<maximo;x++){
        System.out.print(termino1+" + ");
        System.out.print(termino2+" + ");
        
        termino1=termino1+termino2;
        termino2=termino2+termino1;
    }
    }
}