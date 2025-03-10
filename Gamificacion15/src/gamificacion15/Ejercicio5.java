/* *****************************************************************************
* FUNCIONALIDAD: Dado un fichero de texto, de nombre problema1.txt, visualizar en pantalla el número de
caracteres vocales contenidos en dicho fichero. Generar el fichero problema1.txt con un editor
de texto con el formato texto.
* ONJETIVO: Practica en el uso de ficheros NetBeans
* Fecha de creacion: 24.11.2022
* Fecha ultima de modificacion: 24.11.2022
* Autor: Lucas Sabater
***************************************************************************** */
// Dado un fichero de texto de nombre "texto.txt", generar dos ficheros, de nombe "impares.txt" y "pares.txt"
//cuyos contenidos respectivamente seran las palabras con un numero impar de caracteres y las palabras con un numero
//par de caracteres contenidas en el primer fichero
package gamificacion15;

import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio5{
    public static void main(String[] args)throws Exception {
        new Ejercicio5().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        
        FileReader fichero;
        FileWriter ficheroOut;
        
        final int FINAL_FICHERO=-1;
        
        int codigo;
        
        fichero=new FileReader("problema5.txt");
        ficheroOut=new FileWriter("problema5Salida.txt");
        
        codigo=fichero.read();
        
        while (codigo!=FINAL_FICHERO){
                
            
            ficheroOut.write(codigo & 0x5f);
            
            codigo=fichero.read();
        }
        
        ficheroOut.close();
        fichero.close();
    }
}