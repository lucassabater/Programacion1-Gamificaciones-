/* *****************************************************************************
* FUNCIONALIDAD: Dado un numero y un exponente visualizar el numero exponenciado.
* ONJETIVO: Practica en la resolucion de problermas utilizando un suprograma en Java utilizando Netbeans
* Fecha de creacion: 25.10.2022
* Fecha ultima de modificacion: 25.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion7;
public class Ejercicio10{

    public static void main(String[] args)throws Exception {
    
        int solucion=0;
        int numero;
        int exponente;
        
        System.out.println("Dame un numero ");
        numero=LT.readInt();
        
        System.out.println("Dame un exponente ");
        exponente=LT.readInt();
        
       solucion=exponenciar(numero,exponente);
        
        
        System.out.println("El numero elevado es "+solucion);
    }
    public static int exponenciar(int num, int exp) throws Exception{
        int sol=1;
         for(int x=0;x<exp;x++){
             sol=sol*num;
        }

         return sol;
          
    }
}
    
    