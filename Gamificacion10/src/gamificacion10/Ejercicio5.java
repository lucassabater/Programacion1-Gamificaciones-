/* *****************************************************************************
* FUNCIONALIDAD: Realizar un programa que cree un array de números enteros cuya dimensión (número de
componentes) será introducida por teclado a petición del programa. Después llevar a término
la asignación de valores a cada una de las componentes del array introduciéndolos por teclado.
Por último visualizar el contenido del array indicando tanto el número de componente como
el contenido o valor de dicha componente.
Nota: tanto la asignación de valores por teclado como la visualización tiene que llevarse a
término a través de subprogramas.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 03.10.2022
* Fecha ultima de modificacion: 03.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion10;
public class Ejercicio5{
           
        
    public static void main(String[] args) throws Exception{
        new Ejercicio5().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{
       int longitud;
       
        System.out.println("Dame la longitud de la array:");
        longitud=LT.readInt();
        
        int [] numeros=new int [longitud];

            asignacion(numeros);
            
            visualizacion(numeros);
            }
        
          
    
    private void asignacion(int[]num)throws Exception{
        for(int indice =0; indice<num.length;indice++){
            System.out.println("Dame el componente "+(indice+1)+ ":");
            num[indice]=LT.readInt();
            
        }
    }
   
    
       private void visualizacion(int[]num)throws Exception{
        for(int indice =0; indice<num.length;indice++){
            System.out.println("El componente "+(indice+1)+ " es "+num[indice]);
            
        }
    }

}
