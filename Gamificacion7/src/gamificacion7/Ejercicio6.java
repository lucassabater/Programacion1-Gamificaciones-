/* *****************************************************************************
* FUNCIONALIDAD: Dado conjunto de caracteres acabado en . visualiza el numero de palabras constituidas por 2 vocales y 3 consonantes.
* ONJETIVO: Practica en la resolucion de problermas utilizando un suprograma en Java utilizando Netbeans
* Fecha de creacion: 25.10.2022
* Fecha ultima de modificacion: 25.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion7;
public class Ejercicio6{
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
        
        System.out.println("El numero de palabras con 3 consonantes y 2 vocales es "+palabras);
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
        if((consonantes==3)&&(vocales==2)){
            palabras=palabras+1;
        }
    }
}