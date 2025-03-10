/* *****************************************************************************
* FUNCIONALIDAD: declaración de un array de componentes String inicializándolas con los nombres
de los meses del año. Declaración de un array de componentes reales en las que tenemos como valores las 
temperaturas medias de cada uno de los meses del año. Visualización de la temperatura media del año, el mes más 
cálido y el mes más frio.  
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 26.10.2022
* Fecha ultima de modificacion: 26.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion8;
public class Ejercicio5{
    final static int longitud=12;
    
    static int caliente=0,helado=0;
    static double med=0;
         
    static String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    
    static int [] temperatura=new int [longitud];
    
    public static void main(String[] args) throws Exception{
    
         for (int indice=0;indice<longitud;indice++){
             temperatura[indice]=0;
         }
         declarar();
         
         calido();
         
         frio();
         
         media();
         
         visualizar();
        
         
    }
    
   public static void declarar()throws Exception{
       
         for (int indice=0;indice<longitud;indice++){
             System.out.println("Dame la temperatura media de "+meses[indice]);
             temperatura[indice]=LT.readInt();
        }
   }
         
    public static void calido()throws Exception{
       int temp=0;
         for (int indice=0;indice<longitud;indice++){
             if(temperatura[indice]>temp){
                 temp=temperatura[indice];
                 caliente=indice;
             }
        }
    }
    public static void frio()throws Exception{
        int temp=0;
        for (int indice=0;indice<longitud;indice++){
             if(temperatura[indice]<temp){
                 temp=temperatura[indice];
                 helado=indice;
             }
        }
   }
   public static void media () throws Exception{
       double suma=0;
       for (int indice=0;indice<longitud;indice++){
           suma=suma+temperatura[indice];
       }
       med=suma/longitud;
   }
   public static void visualizar() throws Exception{
       System.out.println("Temperatura media año: "+med+" grados centigrados");
       System.out.println("Mes más calido del año: "+meses[caliente]);
       System.out.println("Mes más frio del año: "+meses[helado]);
   }
}
