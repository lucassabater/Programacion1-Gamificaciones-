/* *****************************************************************************
* FUNCIONALIDAD: Dado un numero visualiza tantas lineas como el valor del numero introducido
* ONJETIVO: Practica en la resolucion de problermas utilizando un suprograma en Java utilizando Netbeans
* Fecha de creacion: 25.10.2022
* Fecha ultima de modificacion: 25.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion7;
public class Ejercicio12{

    public static void main(String[] args)throws Exception {
    
        int numero;
        
        System.out.println("Dame un numero ");
        numero=LT.readInt();        
        
        imprimir(numero);
        
        
    }
    public static void imprimir(int num) throws Exception{
        
        for(int x=0;x<num;x++){
            for(int y=0;y<=x;y++){
                System.out.print("*");
            }
            System.out.println("\n");    
        }   
    }
}
    
    