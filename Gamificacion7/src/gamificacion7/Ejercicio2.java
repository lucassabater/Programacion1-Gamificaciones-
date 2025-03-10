/* *****************************************************************************
* FUNCIONALIDAD: Dado conjunto de caracteres acabado en . visualiza el numero de palabras constituidas por 
un numero impar de caracteres vocales y las constituidas por un numero par de caracteres consonantes.
* OBJETIVO: Practica en la resolucion de problermas utilizando un suprograma en Java utilizando Netbeans
* Fecha de creacion: 25.10.2022
* Fecha ultima de modificacion: 25.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion7;
public class Ejercicio2{
    static final char FIN_SECUENCIA='.';
    
    static final char ESPACIO=' ';
    
    static int palabrasV=0;
    
    static int palabrasC=0;
    
    
    static char caracter;
    
    public static void main(String[] args)throws Exception {
    
        System.out.println("Dame un conjunto de caracteres");
        caracter=LT.readChar();
        
        buscarPalabra();
        
        while(caracter!=FIN_SECUENCIA){
            
            
            siguientePalabra();
            
            buscarPalabra();
        }
        
        System.out.println("El numero de palabras con vocales impares es "+palabrasV+" y el numero de palabras con consonantes pares es "+palabrasC);
    }
    public static void buscarPalabra() throws Exception{
        while(caracter==ESPACIO){
            caracter=LT.readChar();
           
        }
          
    }
    
    public static void siguientePalabra() throws Exception {
        int vocales=0;
        int consonantes=0;
        while ((caracter!=ESPACIO)&&(caracter!=FIN_SECUENCIA)){
            if((caracter=='a')||(caracter=='e')||(caracter=='i')||
                (caracter=='o')||(caracter=='u')){
                vocales=vocales+1;
            }
            else{
                consonantes++;
            }
            caracter=LT.readChar();
        }
        if(vocales%2==1){
            palabrasV=palabrasV+1;
        }
        if (consonantes%2==0){
            palabrasC++;
        }
    }
}