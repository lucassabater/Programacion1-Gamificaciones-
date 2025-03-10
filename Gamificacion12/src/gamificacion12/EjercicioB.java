/* *****************************************************************************
* FUNCIONALIDAD: Implementar un programa que declare dos objetos Persona, uno de ellos debe ser
inicializado en la declaración y el otro debe ser inicializado a través de la lectura por
teclado. Posteriormente llevar a cabo el cálculo de sus respectivos IMC y visualizar en
pantalla cada uno de ellos seguidos del mensaje correspondiente al resultado de su IMC.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 13.11.2022
* Fecha ultima de modificacion: 13.11.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion12;


public class EjercicioB {
    public static void main(String[] args) {
        new EjercicioB().metodoPrincipal();
    }
    
    private void metodoPrincipal(){
        double resultado;
        Persona numero2=new Persona("Eduardo Roig Riutort",47,"42222222G",07002,175,73);
        Persona numero1=new Persona();
        
        numero1.lectura();
        
        System.out.println(numero2.toString());
        resultado=numero2.IMC();
                if (resultado<20) {
                    System.out.println("Su IMC es de: "+resultado+"\n"+
                    numero2.getNombre()+"Esta por debajo de su peso ideal");
            
        }
        else if ((resultado>20)&&(resultado<25)){
                    System.out.println("Su IMC es de: "+resultado+"\n"+
                    numero2.getNombre()+" esta en su peso ideal");
        }
        else{
                    System.out.println("Su IMC es de: "+resultado+"\n"+
                    numero2.getNombre()+" esta por encima de su peso ideal");            
        }
           System.out.println("");     
        System.out.println(numero1.toString());
        resultado=numero1.IMC();
                if (resultado<20) {
                    System.out.println("Su IMC es de: "+resultado+"\n"+
                    numero1.getNombre()+"Esta por debajo de su peso ideal");
            
        }
        else if ((resultado>20)&&(resultado<25)){
                    System.out.println("Su IMC es de: "+resultado+"\n"+
                    numero1.getNombre()+" esta en su peso ideal");
        }
        else{
                    System.out.println("Su IMC es de: "+resultado+"\n"+
                    numero1.getNombre()+" esta por encima de su peso ideal");            
        }
    }
    
}
