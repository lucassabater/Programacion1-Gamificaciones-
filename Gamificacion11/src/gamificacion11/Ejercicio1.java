/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’, visualiza
todas aquellas palabras que tengan todos sus caracteres consonantes diferentes.
Llevar a cabo dos versiones de forma análoga a las soluciones planteadas en el problema 6 de la
actividad 10 de gamificación.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 03.10.2022
* Fecha ultima de modificacion: 03.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion11;
public class Ejercicio1{
       static final char FIN_SECUENCIA='.';
       static final char ESPACIO=' ';
       static char caracter;
    public static void main(String[] args) throws Exception{
        new Ejercicio1().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{
        final char LONGITUD=20;
        char[]palabras=new char [LONGITUD];
 
        
        System.out.println("Dame un conjunto de caracteres: ");
        caracter=LT.readChar();
        
        buscarPalabra();
        
        while (caracter!=FIN_SECUENCIA){
            leerPalabra(palabras);
            if(vocales(palabras)==true){
                visualizar(palabras);
            }
            buscarPalabra();
        }
        
    }
    
    private void buscarPalabra(){
        while (caracter==ESPACIO){
            caracter=LT.readChar();
        }
    }
    
    private void leerPalabra(char[]car){
             for (int indice=0;indice<car.length;indice++) {

            car[indice]=ESPACIO;
        }
             
        for(int indice=0;(caracter!=ESPACIO)&&(caracter!=FIN_SECUENCIA);indice++){
            car[indice]=caracter;
            caracter=LT.readChar();
        }
    }
        private boolean vocales(char [] datos) {
       
        int [] apariciones={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
   
        for (int indice=0;datos[indice]!=ESPACIO;indice++) {
        
            switch (datos[indice]) {
                case 'b' -> apariciones[0]++;
                case 'c' -> apariciones[1]++;
                case 'd' -> apariciones[2]++;
                case 'f' -> apariciones[3]++;
                case 'g' -> apariciones[4]++;
                case 'h' -> apariciones[5]++;
                case 'j' -> apariciones[6]++;
                case 'k' -> apariciones[7]++;
                case 'l' -> apariciones[9]++;
                case 'm' -> apariciones[10]++;
                case 'n' -> apariciones[11]++;
                case 'ñ' -> apariciones[12]++;
                case 'p' -> apariciones[13]++;
                case 'q' -> apariciones[14]++;
                case 'r' -> apariciones[15]++;
                case 's' -> apariciones[16]++;
                case 't' -> apariciones[17]++;
                case 'v' -> apariciones[18]++;
                case 'w' -> apariciones[19]++;
                case 'x' -> apariciones[20]++;
                case 'y' -> apariciones[21]++;
                case 'z' -> apariciones[22]++;
           
            }
        }
    
          return verificar(apariciones);
    }
        
 private boolean verificar(int [] datos) {
  
        for (int indice=0;indice<datos.length;indice++) {
            if (datos[indice]>=2) {
                return false;
            }
        }
        
        return true;
    }
    private void visualizar(char[]car){
        for(int indice=0;indice<car.length;indice++){
            System.out.print(car[indice]);
        }
        System.out.print("\n");
    }
    }
