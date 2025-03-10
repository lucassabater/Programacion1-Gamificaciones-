/* *****************************************************************************
* FUNCIONALIDAD: Dado conjunto de caracteres acabado en . visualiza el numero de palabras que contengan un caracter vocal.
* ONJETIVO: Practica en la resolucion de problermas utilizando un suprograma en Java utilizando Netbeans
* Fecha de creacion: 25.10.2022
* Fecha ultima de modificacion: 25.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion7;
public class Ejercicio5{
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
        
        System.out.println("El numero de palabras que contienen minimo un caracter vocal es "+palabras);
    }
    public static void buscarPalabra() throws Exception{
        while(caracter==ESPACIO){
            caracter=LT.readChar();
           
        }
          
    }
    
    public static void siguientePalabra() throws Exception {

        int vocales=0;
        while ((caracter!=ESPACIO)&&(caracter!=FIN_SECUENCIA)){

             if((caracter=='a')||(caracter=='e')||(caracter=='i')||
                (caracter=='o')||(caracter=='u')){
                 vocales++;
             }
            caracter=LT.readChar();
        }
        if (vocales!=0){
            palabras++;
        }
        
    }
}