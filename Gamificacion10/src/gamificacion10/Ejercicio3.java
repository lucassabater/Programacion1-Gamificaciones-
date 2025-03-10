/* *****************************************************************************
* FUNCIONALIDAD: Realizar un programa que vaya solicitando números enteros mientras que no se introduzca el
cero y rellene dos vectores, uno con los números pares, y otro con los números impares. El
máximo número de números a introducir será de 25. Al final, se debe mostrar por pantalla, por
separado, tanto los números pares como los impares.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 03.10.2022
* Fecha ultima de modificacion: 03.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion10;
public class Ejercicio3{
            final int LONGITUD=25;
            int [] par=new int [LONGITUD];
            int [] impar=new int [LONGITUD];
            int x=0, y=0;
        
    public static void main(String[] args) throws Exception{
        new Ejercicio3().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{
        final int FIN=0;
        
        int [] numeros=new int [LONGITUD];

        
        
            for (int indice=0; indice<LONGITUD;indice++){
            System.out.println("Dame un numero: ");
            numeros[indice]=LT.readInt();
            if (numeros[indice]==FIN){
                
                indice=LONGITUD;
            }
        }
            filtrar(numeros);
            visualizar();
        
     }
    
    
    private void filtrar (int [] num){
        for (int indice=0; indice<LONGITUD;indice++){
            if((num[indice]%2==0)&&(num[indice]!=0)){
                par[x]=num[indice];
                x++;
            }
        }
        for (int indice=0; indice<LONGITUD;indice++){
            if(num[indice]%2==1){
                impar[y]=num[indice];
                y++;
    }
    
}
    }
    
    private void visualizar(){
        
    System.out.print("Numeros pares: ");
        for(int indice=0;indice<x;indice++){
            System.out.print(par[indice]);
    }
          System.out.print("\n Numeros impares: ");
        for(int indice=0;indice<y;indice++){
            System.out.print(impar[indice]);
    }
        
}
}
