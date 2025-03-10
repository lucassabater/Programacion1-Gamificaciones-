/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
verificar si constituye un lipograma. Un lipograma es un texto en el que falta una letra del
alfabeto. En caso afirmativo se tiene que indicar qué letra es la que falta.
Nota: Usar la clase Palabra si creéis que es necesario. 
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 18.11.2022
* Fecha ultima de modificacion: 18.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion14;
public class Ejercicio9{
    public static void main(String[] args)throws Exception {
        new Ejercicio9().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        final char[]LETRAS={'a','e','i','o','u','b','c','d','f','g','h','j','q','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
        int [] apariciones=new int[27];
        char [] caracteres=new char[20];
        int x=0;
         for (int indice=0;indice<apariciones.length;indice++) {
             apariciones[indice]=0;
         }
        //ACCIONES
        //bucle para detectar las apariciones de las vocales en la palabra
        for (int indice=0;indice<caracteres.length;indice++) {
            if (todosLosCaracteres(caracteres[indice])) {
                //asignar true en la componente corespondiente a la vocal
                apariciones[indiceVocal(LETRAS,caracteres[indice])]++;
            }
        }
            for (int i = 0; i < apariciones.length; i++) {
                if (apariciones[i]==0) {
                    x++;
                }
            }
    }
            
            private int indiceVocal(final char [] DATOS, char car) {
        //declaraciÃ³n variable entera indice
        int indice;
        //obtener el indice de la componente del array  donde estÃ¡ el caracter dado
        for (indice=0;car!=DATOS[indice];indice++) {}
        
        //devoluciÃ³n indice
        return indice; 
    }
        
     private boolean todosLosCaracteres(char car){
         return((car=='b')||(car=='c')||(car=='d')||(car=='f')||(car=='g')
                ||(car=='h')||(car=='j')||(car=='k')||(car=='l')||(car=='m')||(car=='n')||(car=='p')||(car=='q')
                ||(car=='r')||(car=='s')||(car=='t')||(car=='v')||(car=='w')||(car=='x')||(car=='y')||(car=='z')
                 ||(car=='u')||(car=='o')||(car=='i')||(car=='e')||(car=='a'));
     }
     private boolean verificar(int [] datos) {
  
        for (int indice=0;indice<datos.length;indice++) {
            if (datos[indice]>=2){
                return false;
            }
        }
        
        return true;
    }
    
    
    }