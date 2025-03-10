/* *****************************************************************************
* FUNCIONALIDAD: Consonantes par o impar
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
    /* Solucion algoritmica
        
        Algoritmo Problema 7{
            Mensaje usuario secuencai caracteres;
            LECTURA CARACTER;
            TRATAMIENTO DE RECORRIDO;
            VISUALIZACION RESULTADO;
        }
        TRATAMIENTO DE RECORRIDO {
            MIENTRAS (CARACTER LEIDO NO SEA EL ULTIMO CARACTER DE LA SECUENCIA){
                TRATAMIENTO DEL CARACTER LEIDO;
                LECTURA CARACTER;
        }
            }
        
        TRATAMIENTO CARACTER LEIDO {
            SI(CARACTER LEIDO ES CONSONANTE){
                INCREMENTAR CONTADOR DE CONSONANTES;
            }
        }
       
    */

package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio7 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int contador=0;
    char caracter;
    final char FINAL_SECUENCIA='.';
    
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    caracter=LT.readChar();
    
     while (caracter!=FINAL_SECUENCIA){
         if(!(caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')||(caracter==' ')){
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