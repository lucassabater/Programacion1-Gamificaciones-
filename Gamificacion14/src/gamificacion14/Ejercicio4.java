/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
verificar si constituye un monovalismo. Un monovalismo es un texto con una sola vocal.
Nota: Usar la clase Palabra si creéis que es necesario.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 18.11.2022
* Fecha ultima de modificacion: 18.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion14;
public class Ejercicio4{
    public static void main(String[] args)throws Exception {
        new Ejercicio4().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
     Palabra palabra=new Palabra();
     boolean comprobar=false;
        
        System.out.println("Introduce una secuencia de caracteres");
        
        
        while (Palabra.hayPalabras()){
            
            palabra.lectura();
            comprobar=palabra.monoVocal();
            
            
        }  
        if (comprobar) {
            System.out.println("No es monovalismo");
        }
        else {
            System.out.println("Es ");
        }
        
    }
}