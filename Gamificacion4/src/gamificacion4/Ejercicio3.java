/* *****************************************************************************
* FUNCIONALIDAD:Visualizar Primer Caracter Vocal y su posicion en la secuencia
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio3 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int posicion=1,n=1;
    char caracter;
    final char FINAL_SECUENCIA='.';
    
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    caracter=LT.readChar();
    
     while ((caracter!=FINAL_SECUENCIA)&&(!(caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u'))){
         posicion=posicion+1;  
         caracter=LT.readChar();
     }     
        if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')){
             System.out.println("El primer caracter vocale es "+caracter+ " y esta en la posicion "+posicion);
            
         
       }
        else {
            for(;n<posicion;n++){
               
            System.out.println ("El caracter ocupa la posicion "+n);
            }
        }
    }
    }
    
