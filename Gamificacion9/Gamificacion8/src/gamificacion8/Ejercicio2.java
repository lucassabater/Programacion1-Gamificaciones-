/* *****************************************************************************
* FUNCIONALIDAD: declara un array de 10 componentes inicializándolas con valores numéricos enteros variados y 
visualiza la media aritmética de dichos valores. Utiliza un método para calcular la media aritmética.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 26.10.2022
* Fecha ultima de modificacion: 26.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion8;
public class Ejercicio2{
         
    static int [] valores={10,20,30,40,50,60,70,80,90,100};
    
    public static void main(String[] args) throws Exception{
    

         visualizar();
        
         
    }

   public static void visualizar() throws Exception{
       int suma=0,media;
       for (int indice=0;indice<valores.length;indice++){
             suma=suma+valores[indice];
     
         }
       media=suma/valores.length;
       System.out.println(media);
   }
}
