/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
visualizar las palabras que constituyan un heterograma. Un heterograma es un palabra en la
que no se repite ninguna letra.
Nota: Usar la clase Palabra si creéis que es necesario. 
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 18.11.2022
* Fecha ultima de modificacion: 18.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion14;
public class Ejercicio8{
    public static void main(String[] args)throws Exception {
        new Ejercicio8().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        Palabra palabra=new Palabra();
        
        System.out.println("Cosa");
        
        while(Palabra.hayPalabras()){
            
            palabra.lectura();
            
            if (palabra.heterograma()) {
                System.out.println(palabra.toString());
            }
        }
    }
}