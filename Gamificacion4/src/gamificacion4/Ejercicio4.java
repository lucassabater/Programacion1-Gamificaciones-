/* *****************************************************************************
* FUNCIONALIDAD:visualizar todas las vocales y su posicion
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio4 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int posicion=1,n=1,x=0;
    char caracter;
    final char FINAL_SECUENCIA='.';
    
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    caracter=LT.readChar();
    
     while (caracter!=FINAL_SECUENCIA){
         posicion=posicion+1;  
         caracter=LT.readChar();
         
        if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')){
             System.out.println("El primer caracter vocale es "+caracter+ " y esta en la posicion "+posicion);
            x=1;
         
       }
     }
        if (x==0){
            for(;n<posicion;n++){
               
            System.out.println ("El caracter ocupa la posicion "+n);
            }
        }
    }
    }
    