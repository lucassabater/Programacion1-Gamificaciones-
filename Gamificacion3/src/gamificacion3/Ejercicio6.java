/* *****************************************************************************
* FUNCIONALIDAD: Visualizar n primeros terminos del sumatorio i*i/i2
* ONJETIVO: Ejercicios de practica Gamificacion 3
* Fecha de creacion: 05.10.2022
* Fecha ultima de modificacion: 05.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion3; //este programa pertenece al proyecto


         //MiPirmerProyectoJava1

//Clase principal
public class Ejercicio6 { //Cabecera declarativa de la clase pincipal
    //método main necesario para que la clase pueda ser ejecutada directamente
    public static void main(String [] argumentos) throws Exception{
    
       int maximo; 
       double termino,i;
    
    
    System.out.println("Hasta que termino quieres calcular ");
    maximo=LT.readInt();
    
   for(i=1;i<maximo;i++){
      
       termino=i*i/(i*2);
     System.out.print(termino+" + ");
   }
 }
}