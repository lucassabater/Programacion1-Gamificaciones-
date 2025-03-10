/* *****************************************************************************
* FUNCIONALIDAD: Llevar a cabo la solución algorítmica y el programa java correspondiente al problema de dada
una secuencia de caracteres, introducida por teclado y acabada con el carácter ‘.’, visualizar el
número de palabras, contenidas en la secuencia, que tengan todos sus caracteres vocales.
Hay que utilizar la clase Palabra.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 17.11.2022
* Fecha ultima de modificacion: 17.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion13;
public class Ejercicio2{
    public static void main(String[] args)throws Exception {
        new Ejercicio2().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        int contador=0;
        Palabra palabra=new Palabra();
        
        
        System.out.println("Dame una secuencia de caracteres");
        
        while(Palabra.hayPalabras()){
            palabra.lectura();

              if (palabra.todoVocales()) {
             contador++;   
            }  

        }
        System.out.println("Las palabras con solo vocales "+contador);
        
        
    }
 }