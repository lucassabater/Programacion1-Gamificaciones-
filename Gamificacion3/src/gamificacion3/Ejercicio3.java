/* *****************************************************************************
* FUNCIONALIDAD: Factorial de un numero dado
* ONJETIVO: Ejercicios de practica Gamificacion 3
* Fecha de creacion: 05.10.2022
* Fecha ultima de modificacion: 05.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion3; //este programa pertenece al proyecto


         //MiPirmerProyectoJava1

//Clase principal
public class Ejercicio3 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int numero, factorial=0,x=0;
    
    
    System.out.println("Dame un numero mayor o igual a 0: ");
    numero=LT.readInt();
    
    if (numero<0){
        System.out.println("Numero Incorrecto");
             
    }
    else if (numero==0){
        factorial=0;
        System.out.println("El factorial es "+factorial);
    }
    else {
        
       while (x<numero){
           x++;
            factorial=factorial*x;
            
        }     
       System.out.println("El factorial es "+factorial);
    }

    }
}