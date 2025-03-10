/* *****************************************************************************
* FUNCIONALIDAD: Realizar un programa que solicite al usuario que introduzca por teclado 10 números enteros.
Posteriormente ha de visualizar el máximo y el mínimo de todos los números introducidos
acompañados del orden de introducción por teclado. Además también visualizar la media de los
números introducidos.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 01.11.2022
* Fecha ultima de modificacion: 01.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion9;
public class Ejercicio2{

    public static void main(String[] args) throws Exception {
        new Ejercicio2().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{
    
        int[]numeros=new int[10];
       
        
        for(int indice=0;indice<numeros.length;indice++){
            System.out.println("Dame el "+(indice+1)+" numero");
            numeros[indice]=LT.readInt();
            
        }
    operar(numeros);
    }
    
    private void operar(int [] num)throws Exception{
        int maximo=num[0],minimo=num[0],suma=0;
        
        for(int indice=0;indice<num.length;indice++){
            if(num[indice]>maximo){
                maximo=num[indice];
            }
        } 
        for(int indice=0;indice<num.length;indice++){
            if(num[indice]<minimo){
                minimo=num[indice];
            }
        }
        for(int indice=0;indice<num.length;indice++){
            suma=suma+num[indice];
    }
        
        System.out.println("El maximo es "+maximo);
        System.out.println("El minimo es "+minimo);
        System.out.println("La media es "+suma/num.length);
        }
    }