/* *****************************************************************************
* FUNCIONALIDAD: declara 3 arrays de 10 componentes enteras. La inicialización de uno de ellos se lleva a cabo en 
declaración; la del otro a través del teclado, y las componentes del tercero contendrán la suma de las componentes
de los otros dos por correspondencia posicional. Visualización de las componentes del tercer
array
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 26.10.2022
* Fecha ultima de modificacion: 26.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion8;
public class Ejercicio4{
    final static int longitud=10;
         
    static int [] valores1=new int [longitud];
    static int [] valores2={10,20,30,40,50,60,70,80,90,100};
    static int [] valores3=new int [longitud];
    
    public static void main(String[] args) throws Exception{
    
         for (int indice=0;indice<longitud;indice++){
             valores1[indice]=0;
         }
         declarar();
         
         asignar();
         
         visualizar();
        
         
    }
    
   public static void declarar()throws Exception{
       
         for (int indice=0;indice<longitud;indice++){
             System.out.println("Dame un numero");
             valores1[indice]=LT.readInt();
        }
   }
      public static void asignar() throws Exception{
       for (int indice=0;indice<longitud;indice++){
           valores3[indice]=valores2[indice]+valores1[indice];
         }
   }
   public static void visualizar() throws Exception{
       for (int indice=0;indice<longitud;indice++){
           valores3[indice]=valores2[indice]+valores1[indice];
             System.out.println("Componente"+(indice+1)+": valor"+valores3[indice]);
         }
   }
}
