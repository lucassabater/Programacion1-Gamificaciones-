/* *****************************************************************************
* FUNCIONALIDAD: Dado un fichero de texto, de nombre problema2.txt, visualizar el primer carácter vocal
contenido en el fichero. En caso que no hubiese ningún carácter vocal se tiene que visualizar el
mensaje correspondiente. Generar el fichero problema2.txt con un editor de texto con el
formato texto. 
* ONJETIVO: Practica en el uso de ficheros NetBeans
* Fecha de creacion: 24.11.2022
* Fecha ultima de modificacion: 24.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion15;

import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio2{
    public static void main(String[] args)throws Exception {
        new Ejercicio2().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        final int FINAL_FICHERO=-1;
        int codigo;
        boolean vocales=true;
        FileReader fichero;
        FileWriter ficheroOut;
        
        fichero=new FileReader("problema2.txt");
        ficheroOut=new FileWriter("resultados.txt");
        
        codigo=fichero.read();
        
        while(codigo!=FINAL_FICHERO){
            if ((vocales)&&((codigo=='u')||(codigo=='o')||(codigo=='i')||(codigo=='e')||(codigo=='a'))) {
                ficheroOut.write(codigo);
                vocales=false;
            }
            codigo=fichero.read();
        }
        if (vocales==false) {
            ficheroOut.write("No hay vocales");
        }
        fichero.close();
    }
}