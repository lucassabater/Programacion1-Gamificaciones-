/* *****************************************************************************
* FUNCIONALIDAD: Dado un fichero de texto, de nombre problema3.txt, visualizar el número de parejas de
caracteres ‘l’’a’ contenidas en el fichero. Generar el fichero problema3.txt con un editor de texto
con el formato texto. 
* ONJETIVO: Practica en el uso de ficheros NetBeans
* Fecha de creacion: 24.11.2022
* Fecha ultima de modificacion: 24.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion15;

import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio3{
    public static void main(String[] args)throws Exception {
        new Ejercicio3().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        final int FINAL_FICHERO=-1;
        int codigo;
        int parejas=0;
        FileReader fichero;
        FileWriter ficheroOut;
        
        
        ficheroOut=new FileWriter("resultados.txt");
        fichero=new FileReader("problema3.txt");
        
        codigo=fichero.read();
        
        while(codigo!=FINAL_FICHERO){
            if (codigo=='l') {
                codigo=fichero.read();
                if (codigo=='a') {
                    parejas++;
                }
            }
            codigo=fichero.read();
        }
    ficheroOut.write("Hay "+ parejas+ " parejas");
    
    fichero.close();
    ficheroOut.close();
    }
}