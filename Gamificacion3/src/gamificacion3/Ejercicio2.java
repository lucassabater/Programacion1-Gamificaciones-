/* *****************************************************************************
* FUNCIONALIDAD: Visualizar numeros del intervalo (1,n) de dos en dos
* ONJETIVO: Ejercicios de practica Gamificacion 3
* Fecha de creacion: 05.10.2022
* Fecha ultima de modificacion: 05.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion3; //este programa pertenece al proyecto


         //MiPirmerProyectoJava1

//Clase principal
public class Ejercicio2 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int maximo, numero=1;
    
    
    System.out.println("Dime hasta que numero llega el intervalo");
    maximo=LT.readInt();
    System.out.print("El intervalo es: ");
            
    while (numero<=maximo){
        System.out.print(numero+", ");
        numero=numero+2;
             
    }
    }
}