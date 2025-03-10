/* *****************************************************************************
* FUNCIONALIDAD: . Implementar un programa que declare un array de 5 objetos Persona y lleve a cabo la
inicialización de todos ellos a través del teclado. Posteriormente se llevará a cabo los
siguientes listados de visualización:
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 13.11.2022
* Fecha ultima de modificacion: 13.11.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion12;


public class EjercicioC {
    public static void main(String[] args) {
        new EjercicioC().metodoPrincipal();
    }
    
    private void metodoPrincipal(){
        Persona pj[]=new Persona[5];
        
        
        for (int i = 0; i <pj.length; i++) {
            pj[i]=new Persona ();
            pj[i].lectura();
        }
        menorEdad(pj);
        mayorEdad(pj);
        terceraEdad(pj);
        pesoIdeal(pj);
        sobrepeso(pj);
    }
    
    private void menorEdad(Persona[]xd){
        System.out.println("Personas menores de edad\n");
        for (int i = 0; i < xd.length; i++) {
            if (xd[i].menorEdad()) {
                System.out.println(xd[i].toString());
            }
        }
    }
    private void mayorEdad(Persona[]xd){
        System.out.println("Personas mayores de edad\n");
        for (int i = 0; i < xd.length; i++) {
            if (xd[i].menorEdad()!=true) {
                System.out.println(xd[i].toString());
            }
        }
    }
    private void terceraEdad(Persona[]xd){ 
        System.out.println("Personas de la tercera edad\n");
        for (int i = 0; i < xd.length; i++) {
            if (xd[i].terceraEdad()) {
                System.out.println(xd[i].toString());
            }
        }
    }
    private void pesoIdeal(Persona[]xd){
        System.out.println("Personas con un peso ideal\n");
        for (int i = 0; i < xd.length; i++) {
            if ((xd[i].IMC()<=20)&&(xd[i].IMC()>=25)) {
                System.out.println(xd[i].toString());
            }
        }
    }
    private void sobrepeso(Persona[]xd){
        System.out.println("Personas con sobrepeso\n");
        for (int i = 0; i < xd.length; i++) {
            if (xd[i].IMC()>25) {
                System.out.println(xd[i].toString());
            }
        }
    }
 
}