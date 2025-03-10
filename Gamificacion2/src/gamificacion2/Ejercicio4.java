/* *****************************************************************************
* FUNCIONALIDAD: N primeros multiplos de un numero
* ONJETIVO: Ejercicios de practica Gamificacion 2
* Fecha de creacion: 02.10.2022
* Fecha ultima de modificacion: 02.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion2; //este programa pertenece al proyecto


         //MiPirmerProyectoJava1

//Clase principal
public class Ejercicio4 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int numero,multiplos,siguiente;
    
    System.out.println("Dame un numero");
    numero=LT.readInt();
    System.out.println("Cuantos multiplos quieres calcular");
    multiplos=LT.readInt();
    
    for (int auxiliar=0;auxiliar < multiplos;auxiliar++){
        siguiente=auxiliar*numero;
        System.out.println("El multiplo numero "+auxiliar+" de "+numero+" es "+siguiente);
       
        
    }
 }   
}
