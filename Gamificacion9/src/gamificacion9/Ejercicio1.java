/* *****************************************************************************
* FUNCIONALIDAD: Realizar un programa que solicite al usuario que introduzca por teclado una 
secuencia de caracteres y visualize dicha secuencia invertida, el maximo numero de caracteres de la secuencia sera de 100
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 26.10.2022
* Fecha ultima de modificacion: 26.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion9;
public class Ejercicio1{
    
    char caracter;
    final char FIN_SECUENCIA='.';
    public static void main(String[] args) throws Exception {
        new Ejercicio1().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{
        int indice=0;
        char[]almacenar=new char[100];
        
        System.out.println("Dame un conjunto de caracteres con un maximo de 100 caracteres");
        caracter=LT.readChar();
        
        while(caracter!=FIN_SECUENCIA){
            
            almacenar[indice]=caracter;
            caracter=LT.readChar();
            indice++;
        }
        
        visualizar(almacenar,indice);
    }
    
    private void visualizar(char []datos,int numero)throws Exception{
        System.out.println("Tu ocnjunto de caracteres del reves es: ");
        for(int indice=numero-1;indice>=0;indice--){
            System.out.print(datos[indice]);
        }
    }
}

    
    

