/* *****************************************************************************
* FUNCIONALIDAD: Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
visualizar las palabras que contengan a su vez a la palabra tele.
Nota: Usar la clase Palabra si creéis que es necesario 
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 18.11.2022
* Fecha ultima de modificacion: 18.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion14;
public class Ejercicio7{
    public static void main(String[] args)throws Exception {
        new Ejercicio7().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        Palabra palabra=new Palabra();
        char[] contiene={'t','e','l','e'};
        char []caracter=new char [20];
        int suma,x,j;
        
        System.out.println("Caracteres");
        
        while (Palabra.hayPalabras()){
            suma=1;
            
            palabra.lectura();
            for (int i = 0; i < palabra.getNumeroCaracteres(); i++) {
                caracter[i]=palabra.getCaracteres(i);
            }
            for (x = 0; x < caracter.length; x++) {
                if (caracter[x]==contiene[0]) {
                    for ( j = 1; j < contiene.length; j++) {
                        
                        if (caracter[x+1]==contiene[j]) {
                            suma++;
                            x++;
                          
                            
                        }
    
                    }
                }
            }
            if (suma==contiene.length) {
                System.out.println(palabra.toString());
            }
        }
    }
    
}