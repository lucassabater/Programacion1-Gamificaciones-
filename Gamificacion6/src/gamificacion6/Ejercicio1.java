
/* *****************************************************************************
* FUNCIONALIDAD: Mostrar el mensaje "PROGRAMACIONI - 2022" utilizando distintos subprogramas
* ONJETIVO: Introducir en la creacion de un suprograma en Java utilizando Netbeans
* Fecha de creacion: 20.10.2022
* Fecha ultima de modificacion: 20.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion6; //este programa pertenece al proyecto

public class Ejercicio1 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
   
    String texto="PROGRAMACIÓNI - 2022";
    
   version1();
   version2();
   version3("PROGRAMACIONI - 2022");
   version4(texto);
        
}
    public static void version1(){
        System.out.println("PROGRAMACIÓNI - 2022");
    }
    public static void version2(){
        String nombre="PROGRAMACIÓNI - 2022";
        System.out.println(nombre);
    }

    public static void version3(String devolver){
       System.out.println(devolver);
    }

public static void version4(String devolver2){
        System.out.println(devolver2);
    }



}




    