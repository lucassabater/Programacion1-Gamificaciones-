
/* *****************************************************************************
* FUNCIONALIDAD: Decir si un numero es mayor que otro usando un subprograma
* ONJETIVO: Introducir en la creacion de un subprograma en Java utilizando Netbeans
* Fecha de creacion: 20.10.2022
* Fecha ultima de modificacion: 20.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion6; //este programa pertenece al proyecto

public class Ejercicio2 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
    int numero1, numero2;
    boolean x;
    
    System.out.println("Dame dos numeros");
    numero1=LT.readInt();
    numero2=LT.readInt();
    
    x=mayorMenor(numero1,numero2);
    
    if (x!=false){
        System.out.println("El "+numero1+" es mayor o igual que "+numero2);
    }
    else{
        System.out.println("El "+numero2+" es mayor o igual que "+numero1);
    }

    }
    public static boolean mayorMenor(int num1,int num2){
    boolean y=false;
    
    if(num1>=num2){
        y=true;
    }
    return y;
    }
}