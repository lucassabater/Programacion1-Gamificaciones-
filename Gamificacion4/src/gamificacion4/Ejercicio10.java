/* *****************************************************************************
* FUNCIONALIDAD: Verificar si el caracter es alfabetico
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio10 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    char secuencia;
    final char FINAL_SECUENCIA='.';
    boolean comprobar=false;
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    secuencia=LT.readChar();

    
     while (secuencia!=FINAL_SECUENCIA){
         if (!((secuencia>='a' && secuencia<='z')||(secuencia>='A'&& secuencia<='Z'))){
             comprobar=true;
         }
         secuencia=LT.readChar();

    }
     if (comprobar!=false){
         System.out.print("No todos los caracteres son alfabeticos");
     }
     else {
         System.out.print("Todos los caracteres son alfabeticos");
     }
  }
}    
