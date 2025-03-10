/* *****************************************************************************
* FUNCIONALIDAD: Vocales par o impar
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio6 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int contador=0;
    char caracter;
    final char FINAL_SECUENCIA='.';
    
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    caracter=LT.readChar();
    
     while (caracter!=FINAL_SECUENCIA){
         if((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')){
         contador=contador+1;
         }
         caracter=LT.readChar();

    }
     if ((contador%2)==1){
         System.out.print("Impar");
     }
     else {
         System.out.print("Par");
     }
  }
}    
