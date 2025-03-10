/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’, visualiza
la primera palabra que tenga un número par de caracteres. En caso, que no haya ninguna
palabra que verifique la condición del problema se visualizará el mensaje correspondiente.
Nota: Usar la clase Palabra si creéis que es necesario.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 18.11.2022
* Fecha ultima de modificacion: 18.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion14;
public class Ejercicio3{
    public static void main(String[] args)throws Exception {
        new Ejercicio3().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        Palabra palabra=new Palabra();
        boolean primera=false;
        System.out.println("Dame un conjunto de caracteres:" );
        
        while (Palabra.hayPalabras()){
            
            palabra.lectura();
            
            if ((palabra.getNumeroCaracteres()%2==0)&&(primera!=true)) {
                System.out.println(palabra.toString());
                primera=true;
            }
        }   
    }
}