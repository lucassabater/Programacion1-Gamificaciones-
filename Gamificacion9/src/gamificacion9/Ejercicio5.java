/* *****************************************************************************
* FUNCIONALIDAD: Realizar un programa que dado un array de 10 componentes enteras, inicializado en declaración,
lleve a cabo la visualización, por cada componente del array, de tantos caracteres ‘*’ como
represente el contenido de la componente:
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 26.10.2022
* Fecha ultima de modificacion: 26.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion9;
public class Ejercicio5{
    
    public static void main(String[] args) throws Exception {
        new Ejercicio5().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{

        int[]val={1,2,3,4,5,6,7,8,9,10};

        for(int indice=0;indice<val.length;indice++){
            for(int x=0;x<=val[indice];x++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}