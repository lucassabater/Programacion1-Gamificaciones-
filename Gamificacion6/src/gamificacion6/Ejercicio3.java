/* *****************************************************************************
* FUNCIONALIDAD: Decir si un numero es par o impar utlizando un subprograma
* ONJETIVO: Introducir en la creacion de un subprograma en Java utilizando Netbeans
* Fecha de creacion: 20.10.2022
* Fecha ultima de modificacion: 20.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion6;

public class Ejercicio3{
    public static void main(String[]args)throws Exception{
        int numero1;
        boolean x;
        
        System.out.println("Dame un numero para comprobar su paridad");
        numero1=LT.readInt();

        
        x=parImpar(numero1);
        
        if (x!=false){
            System.out.println("El numero introducido es par");
        }
        else{
            System.out.println("El numero intorducido es impar");
          
        }
    }
    
    public static boolean parImpar(int num1){
        boolean y=false;
        if(num1%2==0){
            y=true;
        }
        return y;
    }
}
