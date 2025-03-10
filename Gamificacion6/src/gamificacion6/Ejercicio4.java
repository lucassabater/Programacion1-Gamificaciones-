/* *****************************************************************************
* FUNCIONALIDAD: Decir si un numero es primo usando un subprograma
* ONJETIVO: Introducir en la creacion de un subprograma en Java utilizando Netbeans
* Fecha de creacion: 20.10.2022
* Fecha ultima de modificacion: 20.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion6;
public class Ejercicio4{
    public static void main (String[]args)throws Exception{
        int numero;
        boolean x;
        
        System.out.println("Dame un numero"); 
        numero=LT.readInt();
        
        x=primo(numero);
        
        if (x!=false){
            System.out.println("El numero es primo");
        }
        else{
            System.out.println("El numero no es primo");
        }
    }
    public static boolean primo(int num) {
        boolean y=false;
        int contador=0,longitud=1;
        
        while(longitud<=num){
            if(num%longitud==0){
                contador=contador+1;
            }
        longitud=longitud+1;
        
        
    }
        if ((contador==1)||(contador==2)){
        y=true;
    }
    return y;
}
}
