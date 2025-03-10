/* *****************************************************************************
* FUNCIONALIDAD: Suma de x cantidad de numero, x siendo dado por el usuario
* ONJETIVO: Ejercicios de practica Gamificacion 3
* Fecha de creacion: 05.10.2022
* Fecha ultima de modificacion: 05.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion3; //este programa pertenece al proyecto


         //MiPirmerProyectoJava1

//Clase principal
public class Ejercicio1 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int numero, suma=0, sumandos, x;
    
    
    System.out.println("Dame la cantidad de caracteres que quieres sumar;");
    sumandos=LT.readInt();
    
    
    for (x=0;x<sumandos;x++){
        System.out.println("Dame el numero que quieres sumar");
        numero=LT.readInt();
        suma=suma+numero;
        
    
    }
    System.out.println("Esta es la suma "+suma);
    }
}