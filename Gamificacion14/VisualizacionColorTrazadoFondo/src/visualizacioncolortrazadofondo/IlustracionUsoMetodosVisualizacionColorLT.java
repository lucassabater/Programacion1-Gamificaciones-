/*
FUNCIONALIDAD: visualización de un texto:
    - seleccionando el color para cada caracter del texto a través 
    del método visualizadorColorTrazado de LT.
    Los caracteres serán visualizados con la intercalación de un caracter
    espacio entre ellos.
    SINTAXIS MÉTODO visualizadorColorTrazado
                visualizadorColorTrazado(String texto, int [] colores)
            donde,
                    texto:es un String con el texto a visualizar.
                    colores: es un array de componentes enteras cuyo contenidos 
                             son los códigos de los colores correspondientes a 
                             los caracteres del texto. 

            nota: entre el String texto y el array colores debe existir una 
            correspondencia posicional de componentes y por ello, el número de 
            caracteres del String texto debe coincidir con el número de 
            componentes del array colores.

    - seleccionando el color para el fondo de cada caracter del texto a través 
    del método visualizadorColorFondo de LT.
    Los caracteres serán visualizados con la intercalación de un caracter
    espacio entre ellos.
    SINTAXIS MÉTODO visualizadorColorFondo
                visualizadorColorFondo(String texto, int [] colores)
            donde,
                    texto: es un String con el texto a visualizar.
                    colores: es un array de componentes enteras cuyo contenidos 
                             son los códigos de los colores correspondientes a los 
                             fondos de la visualización de los caracteres del texto. 

            nota: entre el String texto y el array colores debe existir una 
            correspondencia posicional de componentes y por ello, el número de 
            caracteres del String texto debe coincidir con el número de 
            componentes del array colores.

    CÓDIGOS CON COLORES:
                              ROJO     --> 0
                              VERDE    --> 1
                              AZUL     --> 2
                              AMARILLO --> 3
                              MAGENTA  --> 4
                              CYAN     --> 5
                              GRIS     --> 6
 */
package visualizacioncolortrazadofondo;


public class IlustracionUsoMetodosVisualizacionColorLT {
    public static void main(String [] argumentos) throws Exception {
        String texto=  "palabra";
        int [] colores={0,1,2,3,4,5,6};
        //visualización del String texto con el trazado correspondiente a los
        //colores del array colores a través del método de LT visualizadorColorTrazado
        LT.visualizadorColorTrazado(texto, colores);
        //Salto de línea
        System.out.println();
        //visualización del String texto con el fondo correspondiente a los
        //colores del array colores a través del método de LT visualizadorColorFondo       
        LT.visualizadorColorFondo(texto, colores);
        //Salto de línea
        System.out.println();
    }
    
}
