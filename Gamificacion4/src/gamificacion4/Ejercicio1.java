//Dado un conjunto de caracteres visualizar el numero de caracteres vocales, el numero de  aracteres consonantes y el numero de caracteres " "
//Dada una secuencia de caaracteres introducidap or teclado y acabada en . visualizar los caracteres de la secuencia por pantalla
/* *****************************************************************************
* FUNCIONALIDAD: Dado un conjunto de caracteres visualizar el numero de caracteres vocales, el numero de  aracteres consonantes y el numero de caracteres " "
* ONJETIVO: Introducir en la creacion de un programa en Java utilizando Netbeans
* Fecha de creacion: 07.10.2022
* Fecha ultima de modificacion: 07.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion4; //este programa pertenece al proyecto

public class Ejercicio1 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    char caracter;
    final char FINAL_SECUENCIA='.';
    int vocales=0,consonantes=0,espacios=0;
    
    System.out.println("Dame un conjunto de caracteres acabado en . ");
    caracter=LT.readChar();
    
    while(caracter!=FINAL_SECUENCIA){
        if (caracter==' '){
            espacios=espacios+1;
        }
        else if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')){
            vocales=vocales+1;
        }
        else {
            consonantes=consonantes+1;
            
        }
        caracter=LT.readChar();
    }
    System.out.println("Hay "+vocales+" vocales, "+consonantes+" consonantes y "+espacios+ " espacios");
    }
}