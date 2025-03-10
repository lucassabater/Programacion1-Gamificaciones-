/* *****************************************************************************
* FUNCIONALIDAD: Dado conjunto de caracteres acabado en . visualiza el numero de palabras constituidas por 
un numero impar de caracteres y tenga 2 o mas caracteres
* ONJETIVO: Practica en la resolucion de problermas utilizando un suprograma en Java utilizando Netbeans
* Fecha de creacion: 25.10.2022
* Fecha ultima de modificacion: 25.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion7;
public class Ejercicio7{
    static final char FIN_SECUENCIA='.';
    
    static final char ESPACIO=' ';
    
    static int palabras=0;
    
    
    static char caracter;
    
    public static void main(String[] args)throws Exception {
    
        System.out.println("Dame un conjunto de caracteres");
        caracter=LT.readChar();
        
        buscarPalabra();
        
        while(caracter!=FIN_SECUENCIA){
            
            
            siguientePalabra();
            
            buscarPalabra();
        }
        
        System.out.println("El numero de palabras con un numero impar de caracteres y 2 vocales o mas "+palabras);
    }
    public static void buscarPalabra() throws Exception{
        while(caracter==ESPACIO){
            caracter=LT.readChar();
           
        }
          
    }
    
    public static void siguientePalabra() throws Exception {
        int vocales=0;
        int letras=0;
        while ((caracter!=ESPACIO)&&(caracter!=FIN_SECUENCIA)){
            if((caracter=='a')||(caracter=='e')||(caracter=='i')||
                (caracter=='o')||(caracter=='u')){
                vocales=vocales+1;
            }
            letras++;    
            caracter=LT.readChar();
        }
        if((letras%2==1)&&(vocales>=2)){
            palabras=palabras+1;
        }
    }
}