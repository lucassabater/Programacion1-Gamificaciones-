/* *****************************************************************************
* FUNCIONALIDAD: Verificar si el caracter esta contenido
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio9 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int x=0;
    char caracter,secuencia;
    final char FINAL_SECUENCIA='.';
    
    System.out.println("Dame un caracter");
    caracter=LT.readChar();
    caracter=caracter;
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    secuencia=LT.readChar();

    
     while (secuencia!=FINAL_SECUENCIA){
         if (secuencia==caracter){
             x=1;
         }
         secuencia=LT.readChar();

    }
     if (x==1){
         System.out.print("El caracter "+caracter+" esta contenido");
     }
     else {
         System.out.print("El caracter no esta contenido");
     }
  }
}    
