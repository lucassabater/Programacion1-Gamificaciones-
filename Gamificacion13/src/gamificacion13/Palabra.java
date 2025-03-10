/*
CLASE Palabra
AGLUTINA LA DESCRIPCIÓN (ESTADO) Y FUNCIONALIDADES (COMPORTAMIENTO) QUE DEFINEN
A UN OBJETO Palara
*/
package gamificacion13;


public class Palabra {
    //DECLARACIONES ATRIBUTOS DE LA CLASE
    //declaración atributo de clase constante entera para representar
    //el número máximo de caracteres que puede tener un objeto Palabra
    private static final int MAXIMO_NUMERO_CARACTERES=20;
    //declaración atributo de clase constante caracter para representar
    //el caracter que identifica el final de una secuencia de caracteres
    //a introducir por teclado
    private static final char FIN_SECUENCIA='.';
    //declaración atributo de clase constante caracter para representar
    //el caracter espacio 
    private static final char ESPACIO=' ';
    //declaración atributo de clase variable char para almacenar el último
    //caracter leído de la secuencia de caracteres introducida por teclado
    private static char caracter=ESPACIO;
    
    //declaración atributo de objeto array de componentes caracteres
    private char [] caracteres=new char[MAXIMO_NUMERO_CARACTERES];
    //declaración atributode objeto variable entera para almacenar el número
    //de caracteres de un objeto Palabra
    private int numeroCaracteres;
    
    //MÉTODOS CONSTRUCTORES
    //declaración método constructor sin parámetros
    public Palabra() {
        //inicialización atributo numeroCaracteres a 0
        numeroCaracteres=0;
    }
    
    //MÉTODOS FUNCIONALES
    //declaración método de clase hayPalabras que verifica si hay alguna palabra
    //por leer en la secuencia de caracteres introducida por teclado
    public static boolean hayPalabras() throws Exception {
        buscarPalabra();
        return (caracter!=FIN_SECUENCIA);
    }
    
    //declaración método privado buscarPalabra que lleva cabo la búsqueda
    //de una palabra en la secuencia de caracteres introducida por teclado
    private static void buscarPalabra() throws Exception {
        while (!(((caracter>='a')&&(caracter<='z'))||((caracter>='A')&&(caracter<='Z')))&&(caracter!=ESPACIO)) {
            caracter=LT.readChar();
        }
    }
    
    //declaración método de objeto lectura que lleva a cabo la lectura, caracter
    //a caracter, de un objeto Palabra desde la secuencia de caracteres introducida
    //por teclado
    public void lectura() throws Exception {
        //inicialización atributo numeroCaracteres a 0 para incializar el
        //objeto Palabra donde vamos a almacenar la palabra a leer desde
        //la secuencia de caracteres
        numeroCaracteres=0;
        //bucle lectura de la palabra caracter a caracter
        while ((caracter!=FIN_SECUENCIA)&&(caracter!=ESPACIO)) {
            //almacenar el caracter leído en la componente correspondiente
            //del atributo caracteres
            caracteres[numeroCaracteres]=caracter;
            //incrementar atributo numeroCaracteres
            numeroCaracteres++;
            //lectura siguiente caracter de la secuencia de caracteres
            caracter=LT.readChar();
        }
    }
    
        public boolean vocales() {
        boolean a=false, e=false, i=false, o=false, u =false;
        for(int indice=0;indice<caracteres.length;indice++){
            switch(caracteres[indice]){
                case 'a' -> a=true;
                case 'e' -> e=true;
                case 'i' -> i=true;
                case 'o' -> o=true;
                case 'u' -> u=true;
            }
        }
        return ((a==true)&&(e==true)&&(i==true)&&(o==true)&&(u==true));
    }
        
        
        public boolean todoConsonantes() {
        final char[]VOCALES={'a','e','i','o','u'};
        int [] apariciones=new int[5];
         for (int indice=0;indice<apariciones.length;indice++) {
             apariciones[indice]=0;
         }
        //ACCIONES
        //bucle para detectar las apariciones de las vocales en la palabra
        for (int indice=0;indice<caracteres.length;indice++) {
            if (esVocal(caracteres[indice])) {
                //asignar true en la componente corespondiente a la vocal
                apariciones[indiceVocal(VOCALES,caracteres[indice])]++;
            }
        }
        
        return verificar(apariciones);
    }
        
        public boolean todoVocales() {
        final char[]CONSONANTES={'b','c','d','f','g','h','j','q','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
        int [] apariciones=new int[22];
         for (int indice=0;indice<apariciones.length;indice++) {
             apariciones[indice]=0;
         }
        //ACCIONES
        //bucle para detectar las apariciones de las vocales en la palabra
        for (int indice=0;indice<caracteres.length;indice++) {
            if (esConsonante(caracteres[indice])) {
                //asignar true en la componente corespondiente a la vocal
                apariciones[indiceVocal(CONSONANTES,caracteres[indice])]++;
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
        
        private boolean esVocal(char car){
            return ((car=='u')||(car=='o')||(car=='i')||(car=='e')||(car=='a'));
        }
        
     private boolean esConsonante(char car) {
        return ((car=='b')||(car=='c')||(car=='d')||(car=='f')||(car=='g')
                ||(car=='h')||(car=='j')||(car=='k')||(car=='l')||(car=='m')||(car=='n')||(car=='p')||(car=='q')
                ||(car=='r')||(car=='s')||(car=='t')||(car=='v')||(car=='w')||(car=='x')||(car=='y')||(car=='z'));
    }
     
     private boolean verificar(int [] datos) {
  
        for (int indice=0;indice<datos.length;indice++) {
            if (datos[indice]>=1){
                return false;
            }
        }
        
        return true;
    }
    
    //delcaración método de objeto getNumeroCaracteres que devuelve el número
    //de caracteres de un objeto Palabra
    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }
    
    public char ultimoCaracter() {
       return caracteres[numeroCaracteres-1];
    }

public char primerCaracter() {
       
       return caracteres[0];
    }
}
