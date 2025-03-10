/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’, visualiza
las palabras que tienen un número impar de caracteres de manera invertida y las que tienen un
número par de caracteres las visualiza en mayúsculas.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 18.11.2022
* Fecha ultima de modificacion: 18.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion14;
public class Ejercicio5{
    public static void main(String[] args)throws Exception {
        new Ejercicio5().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
     Palabra palabra=new Palabra();
     char[]caracteres=new char[20];
     int longitud=0;
     
        System.out.println("Dame palabras");
        while   (Palabra.hayPalabras()){
            palabra.lectura();
            longitud=palabra.getNumeroCaracteres();
            
            if (longitud%2==1) {
                System.out.println(palabra.toStringInverso());
            }
            else{
                System.out.println((palabra.toString()).toUpperCase());
            }
        }
     
    }
}