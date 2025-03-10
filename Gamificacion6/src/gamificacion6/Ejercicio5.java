/* *****************************************************************************
* FUNCIONALIDAD: Decir si un numero es mayor que otro usando un subprograma
* ONJETIVO: Introducir en la creacion de un subprograma en Java utilizando Netbeans
* Fecha de creacion: 20.10.2022
* Fecha ultima de modificacion: 20.10.2022
* Autor: Lucas Sabater
***************************************************************************** */   
package gamificacion6;
public class Ejercicio5{
    public static void main(String[] args)throws Exception {
        int numero,solucion;
        
        System.out.println("Dame un numero para hacer el factorial");
        numero=LT.readInt();
        
        solucion=factorial(numero);
        
        System.out.println("El factorial de "+numero+" es "+solucion);
    }
    
    public static int factorial(int num){
        int factorial=1;
        for(int x=1;x<=num;x++){
           factorial=factorial*x;
    }
        return factorial;
    }
}