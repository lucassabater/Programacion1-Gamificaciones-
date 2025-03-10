/* *****************************************************************************
* FUNCIONALIDAD: declara un array de 5 componentes, asígnale valores numéricos enteros por teclado y visualiza todas las
    componentes por pantalla. Utiliza un método para la asignación y otro para la visualización. 
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 26.10.2022
* Fecha ultima de modificacion: 26.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion8;
public class Ejercicio1{
    final static int longitud=5;
         
    static int [] valores=new int [longitud];
    
    public static void main(String[] args) throws Exception{
    
         for (int indice=0;indice<longitud;indice++){
             valores[indice]=0;
         }
         declarar();
         
         visualizar();
    }
    
   public static void declarar()throws Exception{
       
         for (int indice=0;indice<longitud;indice++){
             System.out.println("Dame un numero");
             valores[indice]=LT.readInt();
        }
   }
   public static void visualizar() throws Exception{
       for (int indice=0;indice<longitud;indice++){
             System.out.print(valores[indice]+", ");
         }
   }
   
}
    
    
