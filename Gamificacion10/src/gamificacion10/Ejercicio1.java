/* *****************************************************************************
* FUNCIONALIDAD: Realizar un programa que teniendo para cada Comunidad Autónoma el número de contagios
COVID habidos durante el último mes visualice la Comunidad con más contagios y la media de
contagios a nivel nacional. La visualización debe seguir el siguiente formato:
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 03.10.2022
* Fecha ultima de modificacion: 03.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion10;
public class Ejercicio1{

    
    static int mayor=0;
    static double med=0;
         
    static String [] comunidades={"Andalucía", "Aragón", "Islas Baleares", "Canarias", "Cantabria", "Castilla-La Mancha", "Castilla y León", "Cataluña", "Comunidad de Madrid", "Comunidad Foral de Navarra", "Comunidad Valenciana", "Extremadura", "Galicia","País Vasco", "Principado de Asturias", "Región de Murcia", "La Rioja"};
    
    static int [] media={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
    
    public static void main(String[] args) throws Exception{

         
         mayor();
         
         media();
         
         visualizar();
        
         
    }
    
         
    public static void mayor()throws Exception{
       int temp=0;
         for (int indice=0;indice<comunidades.length;indice++){
             if(media[indice]>temp){
                 temp=media[indice];
                 mayor=indice;
             }
        }
    }
    
   public static void media () throws Exception{
       double suma=0;
       for (int indice=0;indice<comunidades.length;indice++){
           suma=suma+media[indice];
       }
       med=suma/comunidades.length;
   }
   public static void visualizar() throws Exception{
       System.out.println("Media nacional de contagios: "+med+" casos");
       System.out.println("Comunidad con mas contagios: "+comunidades[mayor]);

   }
}
