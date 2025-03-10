/* *****************************************************************************
* FUNCIONALIDAD: Dados los datos electorales de un municipio en el que se han presentado 10 partidos políticos,
visualiza los resultados generales siguiendo el siguiente formato:
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 03.10.2022
* Fecha ultima de modificacion: 03.10.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion10;
public class Ejercicio4 {
    public static void main(String[] args)throws Exception {
        new Ejercicio4().metodoPrincipal();
    }

    private void metodoPrincipal()throws Exception {
        int[] votos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] partidos = {"PARTIDO ROJO", "PARTIDO AZUL", "PARTIDO VERDE", "PARTIDO AMARILLO",
                "PARTIDO VIOLETA", "PARTIDO MAGENTA", "PARTIDO ROSA", "PARTIDO MARRÓN", "PARTIDO BLANCO",
                "PARTIDO NEGRO"};

        double votosTotales;
        
        votosTotales=suma(votos);

        for (int indice = 0; indice < partidos.length; indice++) {
            System.out.print(partidos[indice]+"-> Números de votos: "+votos[indice]+" Porcentaje votos: " +((votos[indice] / votosTotales) * 100)+"% \n");
        }
    }

    private double suma(int[] vot) {
        int x=0;

        for (int indice = 0; indice < vot.length; indice++) {
            x=x+vot[indice];
        }

        return x;
    }
}