/* *****************************************************************************
* FUNCIONALIDAD: Realizar un programa que pida el valor de 10 números enteros distintos. Si se da el caso de
introducir un número repetido, el programa advertirá al usuario, y solicitará nuevamente el
número hasta que sea diferente de todos los anteriores. A continuación, el programa visualizará
los 10 números por pantalla.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 03.10.2022
* Fecha ultima de modificacion: 03.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion10;
public class Ejercicio2{
    public static void main(String[] args) throws Exception{
        new Ejercicio2().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{
        final int LONGITUD=10;
        int[]numeros=new int [LONGITUD];
        
        for (int indice=0; indice<LONGITUD;indice++){
            System.out.println("Dame un numero: ");
            numeros[indice]=LT.readInt();
            if (comprobar(numeros,indice)!= true){
                System.out.println("El numero dado se repite, introduce uno nuevo");
                indice=indice-1;
            }
        }
        visualizar(numeros);
    }
    
    private boolean comprobar(int [] num, int ind){
        int x=0;
        
        for (int indice=0; indice<ind; indice++){
            if(num[indice]==num[ind]){
                x++;
            }
        }
        return x==0;
    }
    
     private void visualizar(int [] num)throws Exception{
        System.out.println("Tu conjunto de numeros del reves es: ");
        for(int indice=0;indice<num.length;indice++){
            System.out.print(num[indice]+", ");
        }
     }
}