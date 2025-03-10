/* *****************************************************************************
* FUNCIONALIDAD: Dado conjunto de caracteres acabado en . visualiza el numero de palabras que terminan en vocal
* ONJETIVO: Practica en la resolucion de problermas utilizando un suprograma en Java utilizando Netbeans
* Fecha de creacion: 25.10.2022
* Fecha ultima de modificacion: 25.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion7;
public class Ejercicio3{
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
        
        System.out.println("El numero de palabras acabadas en vocal es "+palabras);
    }
    public static void buscarPalabra() throws Exception{
        while(caracter==ESPACIO){
            caracter=LT.readChar();
           
        }
          
    }
    
    public static void siguientePalabra() throws Exception {
        char penUltimo=' ';

        while ((caracter!=ESPACIO)&&(caracter!=FIN_SECUENCIA)){

            penUltimo=caracter;
            caracter=LT.readChar();
        }
               if((penUltimo=='a')||(penUltimo=='e')||(penUltimo=='i')||
                (penUltimo=='o')||(penUltimo=='u')){
                palabras++;
            }
    }
}