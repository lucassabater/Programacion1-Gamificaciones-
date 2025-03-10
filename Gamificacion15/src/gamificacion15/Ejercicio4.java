/* *****************************************************************************
* FUNCIONALIDAD: Dado un fichero de texto, de nombre problema4.txt, visualizar el número de caracteres vocales,
el número de caracteres consonantes y el número de espacios en blanco contenidos en el
fichero. Generar el fichero problema4.txt con un editor de texto con el formato texto.  
* ONJETIVO: Practica en el uso de ficheros NetBeans
* Fecha de creacion: 24.11.2022
* Fecha ultima de modificacion: 24.11.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion15;

import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio4{
    public static void main(String[] args)throws Exception {
        new Ejercicio4().metodoPrincipal();
    }
    
    
    private void metodoPrincipal()throws Exception{
        final int FINAL_FICHERO=-1;
        int codigo;
        int vocales=0;
        int espacios=0;
        int consonantes=0;
        FileReader fichero;
        FileWriter ficheroOut;
        
        
        ficheroOut=new FileWriter("resultados.txt");
        fichero=new FileReader("problema3.txt");
        
        codigo=fichero.read();
        
        while(codigo!=FINAL_FICHERO){
            if ((codigo=='u')||(codigo=='o')||(codigo=='i')||(codigo=='e')||(codigo=='a')){
                vocales++;
            }
            else if (codigo==' '){
                espacios++;
            }
            else {
                consonantes++;
            }
            codigo=fichero.read();
        }
        ficheroOut.write("Hay: "+vocales+" vocales, "+espacios+" espacios y "+consonantes+ " consonantes");
        fichero.close();
        ficheroOut.close();
    }
}