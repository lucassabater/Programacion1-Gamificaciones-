/* *****************************************************************************
* FUNCIONALIDAD: Dado un caracter decir si se trata de un numero, un caracter alfabetico y 
que comienzan por "ab"
* ONJETIVO: Practica en la resolucion de problermas utilizando un suprograma en Java utilizando Netbeans
* Fecha de creacion: 25.10.2022
* Fecha ultima de modificacion: 25.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion7;
public class Ejercicio11{

public static void main(String[] args)throws Exception {
    char caracter;
        System.out.println("Dame un caracter");
        caracter=LT.readChar();
        
        seleccionar(caracter);

    }
    public static void seleccionar(char car) throws Exception{
        if ((car>='a'&&car<='z')||(car>='A'&&car<='Z')){
            System.out.println("El caracter es alfabetico");
        }
        else if((car=='0')||(car=='1')||(car=='2')||
                (car=='3')||(car=='4')||(car=='5')||(car=='6')||(car=='7')||
                (car=='9')||(car=='8')){
            System.out.println("El caracter es numerico ");
        }
        else{
            System.out.println("El caracter es de otro tipo");
            
        }
            
           
    }
}