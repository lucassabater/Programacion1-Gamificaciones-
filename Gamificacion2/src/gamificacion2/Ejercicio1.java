/* *****************************************************************************
* FUNCIONALIDAD: Dado un caracter alfabetico minuscula, visualizar el mismo caracter en mayuscula
* ONJETIVO: Ejercicios de practica Gamificacion 2
* Fecha de creacion: 02.10.2022
* Fecha ultima de modificacion: 02.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion2; //este programa pertenece al proyecto


         //MiPirmerProyectoJava1

//Clase principal
public class Ejercicio1 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    char letra;
    char mayuscula;
    
    System.out.println("Dame un caracter alfabetico minuscula");
    letra=LT.readChar();
    
    mayuscula= (char) (letra & 0x5f);
    
    System.out.println(mayuscula);
    
    }
}