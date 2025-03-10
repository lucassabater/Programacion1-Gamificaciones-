/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’, visualiza
todas aquellas palabras que tengan las 5 vocales.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 03.10.2022
* Fecha ultima de modificacion: 03.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion10;
public class Ejercicio6{
       static final char FIN_SECUENCIA='.';
       static final char ESPACIO=' ';
       static char caracter;
    public static void main(String[] args) throws Exception{
        new Ejercicio6().metodoPrincipal();
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
            //asignaciÃ³n del caracter ESPACIO en la componente indice
            //del array pal
            car[indice]=ESPACIO;
        }
             
        for(int indice=0;(caracter!=ESPACIO)&&(caracter!=FIN_SECUENCIA);indice++){
            car[indice]=caracter;
            caracter=LT.readChar();
        }
    }
    private boolean vocales(char[]car){
        int A=0,E=0,I=0,O=0,U=0;
        for(int indice=0;indice<car.length;indice++){
            switch(car[indice]){
                case 'a'->A++;
                case 'e'->E++;
                case 'i'->I++;
                case 'o'->O++;
                case 'u'->U++;
            }
        }
        return ((A>=1)&&(E>=1)&&(I>=1)&&(O>=1)&&(U>=1));

        }
    
    private void visualizar(char[]car){
        for(int indice=0;indice<car.length;indice++){
            System.out.print(car[indice]);
        }
        System.out.print("\n");
    }
    }

       
        
          
    
    
