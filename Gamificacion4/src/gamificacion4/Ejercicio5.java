/* *****************************************************************************
* FUNCIONALIDAD: MINUSCULA A MAYUSCULA
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio5 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    char caracter,mayuscula;
    final char FINAL_SECUENCIA='.';
    
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    caracter=LT.readChar();
    
     while (caracter!=FINAL_SECUENCIA){
         if(caracter!=' '){
         mayuscula=(char)(caracter&0x5f);
         System.out.print(mayuscula);
         }
         else{
             System.out.print(' ');
         }
         caracter=LT.readChar();

    }
  }
}    
