/* *****************************************************************************
* FUNCIONALIDAD: 
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio8 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int consonante=0,vocal=0;
    char caracter;
    final char FINAL_SECUENCIA='.';
    
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    caracter=LT.readChar();
    
     while (caracter!=FINAL_SECUENCIA){
         if((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')){
         vocal=vocal+1;
         }
         else {
             consonante=consonante+1;
         }
         caracter=LT.readChar();

    }
     if (consonante==(vocal*2)){
         System.out.print("Sí");
     }
     else {
         System.out.print("No");
     }
  }
}    
