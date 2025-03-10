/* *****************************************************************************
* FUNCIONALIDAD: Realizar un programa que, dados dos arrays de 10 componentes enteras, inicializados en la
declaración, verifiquen si son iguales o no.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 26.10.2022
* Fecha ultima de modificacion: 26.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion9;
public class Ejercicio3{
    
    public static void main(String[] args) throws Exception {
        new Ejercicio3().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{

        int[]val1={1,2,3,4,5,6,7,8,9,10};
        int[]val2={1,2,3,4,5,6,7,8,9,10};
        
        comprobacion(val1,val2);
        
        
    }
    
    
        private void comprobacion (int [] num1,int [] num2){
            int x=0;
            for(int indice=0;indice<num2.length;indice++){
            if (num1[indice]==num2[indice]){
                x++;
            }
            
        }
            if (x==num1.length) {
                System.out.println("Ambas arrays son iguales");
                
            }
            else{
                System.out.println("Las Arrays son diferentes");
            }
                    
        }
}
