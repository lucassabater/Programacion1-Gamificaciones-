/* *****************************************************************************
* FUNCIONALIDAD: declara un array de 100 componentes con los valores del 1 al 100. 
Visualiza la suma de todas las componentes y la media. Utiliza los métodos que creas convenientes. 
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 26.10.2022
* Fecha ultima de modificacion: 26.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion8;
public class Ejercicio3{
    final static int LONGITUD=100;
         
    static int [] valores=new int [LONGITUD];
    
    public static void main(String[] args) throws Exception{
    
         for (int indice=0;indice<LONGITUD;indice++){
             valores[indice]=0;
         }
         declarar();
         
         operar();
         
        
         
    }
    
   public static void declarar()throws Exception{
       
         for (int indice=0;indice<LONGITUD;indice++){
             valores[indice]=(indice+1);
        }
   }
   public static void operar() throws Exception{
       int suma=0;
       double media;
       
       for (int indice=0;indice<LONGITUD;indice++){
             suma=suma+valores[indice];
             
         }
       media=(double)suma/(double)LONGITUD;
       System.out.println("La suma es "+suma);
       System.out.println("La media es "+media);
   }
}
