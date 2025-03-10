/* *****************************************************************************
* FUNCIONALIDAD: Dado un fichero de texto, de nombre problema1.txt, visualizar en pantalla el número de
caracteres vocales contenidos en dicho fichero. Generar el fichero problema1.txt con un editor
de texto con el formato texto.
* ONJETIVO: Practica en el uso de ficheros NetBeans
* Fecha de creacion: 24.11.2022
* Fecha ultima de modificacion: 24.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion15;

import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio1{
    public static void main(String[] args)throws Exception {
        new Ejercicio1().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        int vocales=0;
        
        FileReader fichero;
        FileWriter ficheroOut;
        
        final int FINAL_FICHERO=-1;
        
        int codigo;
        
        fichero=new FileReader("problema1.txt");
        ficheroOut=new FileWriter("resultados.txt");
        
        codigo=fichero.read();
        
        while (codigo!=FINAL_FICHERO){
            
            if ((codigo=='u')||(codigo=='o')||(codigo=='i')||(codigo=='e')||(codigo=='a')){
                vocales++;
            }
            codigo=fichero.read();
        }
        ficheroOut.write("Hay "+ vocales+" vocales");
        ficheroOut.close();
        fichero.close();
    }
}