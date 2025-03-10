/* *****************************************************************************
* FUNCIONALIDAD: Calcular n primeros teminos sumatorio 2*i
* ONJETIVO: Ejercicios de practica Gamificacion 3
* Fecha de creacion: 05.10.2022
* Fecha ultima de modificacion: 05.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion3; //este programa pertenece al proyecto


         //MiPirmerProyectoJava1

//Clase principal
public class Ejercicio4 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int maximo, termino,i=1;
    
    
    System.out.println("Hasta que termino quieres calcular ");
    maximo=LT.readInt();
    
    do {
        termino=2*i;
        i++;
        System.out.print(termino+" + ");
    }
    while (i<=maximo);
    

    }
}