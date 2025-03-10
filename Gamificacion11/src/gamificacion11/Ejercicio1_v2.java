/* *****************************************************************************
* FUNCIONALIDAD:Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’, visualiza
todas aquellas palabras que tengan todos sus caracteres consonantes diferentes.
Llevar a cabo dos versiones de forma análoga a las soluciones planteadas en el problema 6 de la
actividad 10 de gamificación.
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 04.10.2022
* Fecha ultima de modificacion: 04.10.2022
* Autor: Lucas Sabater
***************************************************************************** */

package gamificacion11;
public class Ejercicio1_v2{
       static final char FIN_SECUENCIA='.';
       static final char ESPACIO=' ';
       static char caracter;
    public static void main(String[] args) throws Exception{
        new Ejercicio1_v2().metodoPrincipal();
    }
    
    private void metodoPrincipal()throws Exception{
        final char LONGITUD=20;
        char[]palabras=new char [LONGITUD];

        
        System.out.println("Dame un conjunto de caracteres: ");
        caracter=LT.readChar();
        buscarPalabra();
        
        while (caracter!=FIN_SECUENCIA){
            leerPalabra(palabras);
            if((vocales(palabras)==true)){
                visualizar(palabras);
                
            }
            buscarPalabra();
        }

        
    }
    
    private void buscarPalabra(){
        while (caracter==ESPACIO){
            caracter=LT.readChar();
        }
    }
    
    private void leerPalabra(char[]car){
             for (int indice=0;indice<car.length;indice++) {

            car[indice]=ESPACIO;
        }
             
        for(int indice=0;(caracter!=ESPACIO)&&(caracter!=FIN_SECUENCIA);indice++){
            car[indice]=caracter;
            caracter=LT.readChar();
        }
    }
    private boolean vocales(char[]datos){
        final char[]CONSONANTES={'b','c','d','f','g','h','j','q','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
        int [] apariciones=new int[22];
         for (int indice=0;indice<apariciones.length;indice++) {
             apariciones[indice]=0;
         }
        //ACCIONES
        //bucle para detectar las apariciones de las vocales en la palabra
        for (int indice=0;datos[indice]!=ESPACIO;indice++) {
            if (esConsonante(datos[indice])) {
                //asignar true en la componente corespondiente a la vocal
                apariciones[indiceVocal(CONSONANTES,datos[indice])]++;
            }
        }
        
        return verificar(apariciones);
    }
    
        private int indiceVocal(final char [] DATOS, char car) {
        //declaraciÃ³n variable entera indice
        int indice;
        //obtener el indice de la componente del array  donde estÃ¡ el caracter dado
        for (indice=0;car!=DATOS[indice];indice++) {}
        
        //devoluciÃ³n indice
        return indice; 
    }
    
    //declaraciÃ³n mÃ©todo funciÃ³n esVocal que verifica si el caracter
    //dado por parÃ¡metro es una vocal
    private boolean esConsonante(char car) {
        return ((car=='b')||(car=='c')||(car=='d')||(car=='f')||(car=='g')
                ||(car=='h')||(car=='j')||(car=='k')||(car=='l')||(car=='m')||(car=='n')||(car=='p')||(car=='q')
                ||(car=='r')||(car=='s')||(car=='t')||(car=='v')||(car=='w')||(car=='x')||(car=='y')||(car=='z'));
    }
    
     private boolean verificar(int [] datos) {
  
        for (int indice=0;indice<datos.length;indice++) {
            if (datos[indice]>=2){
                return false;
            }
        }
        
        return true;
    }
    
    private void visualizar(char[]car){
        for(int indice=0;indice<car.length;indice++){
            System.out.print(car[indice]);
        }
        System.out.print("\n");
    }
    }