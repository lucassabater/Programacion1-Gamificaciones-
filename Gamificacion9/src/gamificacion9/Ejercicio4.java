 /* *****************************************************************************
* FUNCIONALIDAD: Realizar un programa que dados dos arrays de 10 componentes enteras, inicializados en la
declaración, cree un tercer array asignándole como valor la resta, componente a componente,
de los dos primeros arrays. Posteriormente llevar a cabo la visualización siguiendo el siguiente
formato:
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 26.10.2022
* Fecha ultima de modificacion: 26.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion9;
public class Ejercicio4{
    
    public static void main(String[] args) throws Exception {
        new Ejercicio4().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{

        int[]val1={1,2,3,4,5,6,7,8,9,10};
        int[]val2={1,2,3,4,5,6,7,8,9,10};
        int[]val3=new int [10];
        
        
        for(int indice=0;indice<val1.length;indice++){
            val3[indice]=val1[indice]-val2[indice];
            
            System.out.println(val1[indice]+" - "+val2[indice]+" = "+val3[indice]);
        }
               
    }
    
}