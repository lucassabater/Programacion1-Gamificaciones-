
/* *****************************************************************************
* FUNCIONALIDAD:Dada una secuencia de caaracteres introducidap or teclado y acabada en . visualizar los caracteres de la secuencia por pantalla
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio2 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    char caracter;
    final char FINAL_SECUENCIA='.';
    
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    caracter=LT.readChar();
    
        do {
            System.out.print(caracter);
            caracter=LT.readChar();
        } while (caracter!=FINAL_SECUENCIA);
        System.out.print(caracter);
    }
}