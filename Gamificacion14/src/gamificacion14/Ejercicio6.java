/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
verificar si en dicha secuencia las palabras que la constituyen cumplen el siguiente criterio:
cada palabra tiene un carácter más que la anterior.
Nota: Usar la clase Palabra si creéis que es necesario.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 18.11.2022
* Fecha ultima de modificacion: 18.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion14;
public class Ejercicio6{
    public static void main(String[] args)throws Exception {
        new Ejercicio6().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
     Palabra palabra=new Palabra();
     int [] longitudes=new int[20];
     int x=0;
     boolean no=true;
     
        System.out.println("Palabras idk");
        
        while (Palabra.hayPalabras()){
            palabra.lectura();
            longitudes[x]=palabra.getNumeroCaracteres();
        x++;    
        }
        System.out.println(longitudes.length);
        for (int i = 1; i < longitudes.length; i++) {
            if ((longitudes[i-1]>=longitudes[i])&&(longitudes[i]!=0)) {
                
                no=false;
            }
        }
        if (no==false) {
            System.out.println("No se cumple el criterio");
            
        }
        else {
            System.out.println("Se cumple");
        }
    
        }
    }
