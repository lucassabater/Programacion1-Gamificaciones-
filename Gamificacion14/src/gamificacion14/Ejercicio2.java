/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’, visualiza
la primera palabra que tenga el mismo número de vocales que consonantes. En caso, que no
haya ninguna palabra que verifique la condición del problema se visualizará el mensaje
correspondiente.
Nota: Usar la clase Palabra si creéis que es necesario.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 18.11.2022
* Fecha ultima de modificacion: 18.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion14;
public class Ejercicio2{
    public static void main(String[] args)throws Exception {
        new Ejercicio2().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        Palabra palabra=new Palabra();
        boolean comprobar=false;
        
        System.out.println("Dame un ocnjunto de caracteres: ");
        
        while (Palabra.hayPalabras()){
            
            palabra.lectura();
            
            if((palabra.numeroVocales()==palabra.getNumeroCaracteres()-palabra.numeroVocales())&&(comprobar!=true)){
                
                System.out.println(palabra.toString());
                comprobar=true;
            }
        }
        if(comprobar==false){
            
        
        System.out.println("No hay palabras con el mismo numero de vocales y consonantes");
        }
    }
}