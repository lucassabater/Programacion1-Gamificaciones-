/* *****************************************************************************
* FUNCIONALIDAD: Dado un numero, visualiza el nombre de este.
* ONJETIVO: Ejercicios de practica Gamificacion 2
* Fecha de creacion: 02.10.2022
* Fecha ultima de modificacion: 02.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion2; //este programa pertenece al proyecto


         //MiPirmerProyectoJava1

//Clase principal
public class Ejercicio3 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    char numero;
       
    
    System.out.println("Dame un numero del 0 al 9");
    numero=LT.readChar();
    
    switch (numero){
        
        case '1' -> System.out.println("Uno");
        case '2' -> System.out.println("Dos"); 
        case '3' -> System.out.println("Tres"); 
        case '4' -> System.out.println("Cuatro"); 
        case '5' -> System.out.println("Cinco"); 
        case '6' -> System.out.println("Seis"); 
        case '7' -> System.out.println("Siete"); 
        case '8' -> System.out.println("Ocho"); 
        case '9' -> System.out.println("Nueve"); 
        case '0' -> System.out.println("Cero"); 
        default -> System.out.println("Valor no apto"); 
    }
    
    
    
    }    
    
    }