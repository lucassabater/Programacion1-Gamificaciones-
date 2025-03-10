/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’, visualiza
la primera palabra, contenida en la secuencia, que tenga un número impar de caracteres
consonantes.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 03.10.2022
* Fecha ultima de modificacion: 03.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion11;
public class Ejercicio3{
       static final char FIN_SECUENCIA='.';
       static final char ESPACIO=' ';
       static char caracter;
    public static void main(String[] args) throws Exception{
        new Ejercicio3().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{
        final char LONGITUD=20;
        char[]palabras=new char [LONGITUD];
        int x=0;
        
        System.out.println("Dame un conjunto de caracteres: ");
        caracter=LT.readChar();
        
        buscarPalabra();
        
        while (caracter!=FIN_SECUENCIA){
            leerPalabra(palabras);
            if((impar(palabras)==true)&&(x==0)){
                visualizar(palabras);
                x++;
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
        private boolean impar(char [] datos) {
            int contador=0;
            for (int indice=0;((indice<datos.length)&&(datos[indice]!=ESPACIO));indice++){
                if(esConsonante(datos[indice])){
                       
                contador++;
                }
            }
            if(contador%2==1){
                return true;
            }
            else{
                return false;
            }
 }
        
    private boolean esConsonante(char car) {
        return ((car=='b')||(car=='c')||(car=='d')||(car=='f')||(car=='g')
                ||(car=='h')||(car=='j')||(car=='k')||(car=='l')||(car=='m')||(car=='n')||(car=='p')||(car=='q')
                ||(car=='r')||(car=='s')||(car=='t')||(car=='v')||(car=='w')||(car=='x')||(car=='y')||(car=='z'));
    }
    
    private void visualizar(char[]car){
        for(int indice=0;indice<car.length;indice++){
            System.out.print(car[indice]);
        }
        System.out.print("\n");
    }
    }
