/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’, visualiza
todas las palabras, contenidas en la secuencia, que contengan la secuencia de caracteres
‘m’’e’’n’’t’’e’.
Ejemplo:
Secuencia de entrada: como vamos desesperadamente por la vida todo se nos va de la mente.
Visualización:
desesperadamente
mente
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 03.10.2022
* Fecha ultima de modificacion: 03.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion11;
public class Ejercicio5{
       static final char FIN_SECUENCIA='.';
       static final char ESPACIO=' ';
       static char caracter;
    public static void main(String[] args) throws Exception{
        new Ejercicio5().metodoPrincipal();
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
            if((vocales(palabras)==true)&&(x==0)){
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
        final char[]terminacion={'m','e','n','t','e'};
        int x=0,suma=0,y=0;
        for(int indice=0;((indice<car.length)&&(car[indice]!=ESPACIO));indice++){
           x++;
            }
        for(;y<car.length;y++){
           if(car[y]==terminacion[0]){
             for(int indice1=x-1,indice2=terminacion.length-1;indice2>=0;indice1--,indice2--){
            if(terminacion[indice2]==car[indice1]){
                suma++;
            }
        }
        }
            }
        return suma==terminacion.length;
    }
    
    private void visualizar(char[]car){
        for(int indice=0;indice<car.length;indice++){
            System.out.print(car[indice]);
        }
        System.out.print("\n");
    }
    }
    
