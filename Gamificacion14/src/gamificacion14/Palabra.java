/*
CLASE Palabra
AGLUTINA LA DESCRIPCIÃ“N (ESTADO) Y FUNCIONALIDADES (COMPORTAMIENTO) QUE DEFINEN
A UN OBJETO Palara
*/
package gamificacion14;


public class Palabra {
    //DECLARACIONES ATRIBUTOS DE LA CLASE
    //declaraciÃ³n atributo de clase constante entera para representar
    //el nÃºmero mÃ¡ximo de caracteres que puede tener un objeto Palabra
    private static final int MAXIMO_NUMERO_CARACTERES=20;
    //declaraciÃ³n atributo de clase constante caracter para representar
    //el caracter que identifica el final de una secuencia de caracteres
    //a introducir por teclado
    private static final char FIN_SECUENCIA='.';
    //declaraciÃ³n atributo de clase constante caracter para representar
    //el caracter espacio 
    private static final char ESPACIO=' ';
    //declaraciÃ³n atributo de clase variable char para almacenar el Ãºltimo
    //caracter leÃ­do de la secuencia de caracteres introducida por teclado
    private static char caracter=ESPACIO;
    
    private boolean repite=true;
    
    private boolean [] vocales={false,false,false,false,false};
    //declaraciÃ³n atributo de objeto array de componentes caracteres
    private char [] caracteres=new char[MAXIMO_NUMERO_CARACTERES];
    //declaraciÃ³n atributode objeto variable entera para almacenar el nÃºmero
    //de caracteres de un objeto Palabra
    private int numeroCaracteres;
    
    //MÃ‰TODOS CONSTRUCTORES
    //declaraciÃ³n mÃ©todo constructor sin parÃ¡metros
    public Palabra() {
        //inicializaciÃ³n atributo numeroCaracteres a 0
        numeroCaracteres=0;
    }
    
    //MÃ‰TODOS FUNCIONALES
    //declaraciÃ³n mÃ©todo de clase hayPalabras que verifica si hay alguna palabra
    //por leer en la secuencia de caracteres introducida por teclado
    public static boolean hayPalabras() throws Exception {
        buscarPalabra();
        return (caracter!=FIN_SECUENCIA);
    }
    
//    //declaraciÃ³n mÃ©todo privado buscarPalabra que lleva cabo la bÃºsqueda
//    //de una palabra en la secuencia de caracteres introducida por teclado
//    private static void buscarPalabra() throws Exception {
//        while (caracter==ESPACIO) {
//            caracter=LT.readChar();
//        }
//    }
    
    //declaraciÃ³n mÃ©todo privado buscarPalabra que lleva cabo la bÃºsqueda
    //de una palabra en la secuencia de caracteres introducida por teclado
    private static void buscarPalabra() throws Exception {
        while ((!(((caracter>='a')&&(caracter<='z'))||((caracter>='A')&&(caracter<='Z'))))
                &&(caracter!=FIN_SECUENCIA)){
            caracter=LT.readChar();
        }
    }
    
    //declaraciÃ³n mÃ©todo de objeto lectura que lleva a cabo la lectura, caracter
    //a caracter, de un objeto Palabra desde la secuencia de caracteres introducida
    //por teclado
    public void lectura() throws Exception {
        //inicializaciÃ³n atributo numeroCaracteres a 0 para incializar el
        //objeto Palabra donde vamos a almacenar la palabra a leer desde
        //la secuencia de caracteres
        numeroCaracteres=0;
        //bucle lectura de la palabra caracter a caracter
        while ((caracter!=FIN_SECUENCIA)&&(caracter!=ESPACIO)) {
            //almacenar el caracter leÃ­do en la componente correspondiente
            //del atributo caracteres
            caracteres[numeroCaracteres]=caracter;
            //incrementar atributo numeroCaracteres
            numeroCaracteres++;
            //lectura siguiente caracter de la secuencia de caracteres
            caracter=LT.readChar();
        }
    }  
    
    //declaraciÃ³n mÃ©todo de objeto toSTring que lleva a cabo la conversiÃ³n
    //de un objeto Palabra a String
    @Override
    public String toString() {
        //DECLARACIONES
        //declaraciÃ³n variable String para almacenar a travÃ©s de la operaciÃ³n
        //de concatenaciÃ³n los diferentes caracteres del objeto Palabra
        //correspondiente
        String resultado="";
        
        //bucle de concatenaciÃ³n para almacenar en el String resultado
        //los caracteres del objeto Palabra correspondiente
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //concatenaciÃ³n en resultado del caracter del objeto
            //Palabra correspondiente a la iteraciÃ³n indice-Ã©sima
            resultado=resultado+caracteres[indice];
        }
        //DevoluciÃ³n resultado
        return resultado;   
    }
    
    public String toStringInverso() {
        //DECLARACIONES
        //declaraciÃ³n variable String para almacenar a travÃ©s de la operaciÃ³n
        //de concatenaciÃ³n los diferentes caracteres del objeto Palabra
        //correspondiente
        String resultado="";
        
        //bucle de concatenaciÃ³n para almacenar en el String resultado
        //los caracteres del objeto Palabra correspondiente
        for (int indice=numeroCaracteres;indice>=0;indice--) {
            //concatenaciÃ³n en resultado del caracter del objeto
            //Palabra correspondiente a la iteraciÃ³n indice-Ã©sima
            resultado=resultado+caracteres[indice];
        }
        //DevoluciÃ³n resultado
        return resultado;   
    }
    
    //delcaraciÃ³n mÃ©todo de objeto getNumeroCaracteres que devuelve el nÃºmero
    //de caracteres de un objeto Palabra
    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }
    
        public boolean  monoVocal(){
            comprobarVocales();
            for (int i=0;i<vocales.length; i++) {
                for (int j = 0; j < vocales.length; j++) {
                    if ((vocales[i]==vocales[j])&&(i!=j)) {
                        repite=false;
                        
                    }
                }
                
            }
            return repite;
        }
        private void comprobarVocales() {
        //DECLARACIONES
        //declaraciÃ³nvaribale array de componentes booleanas para almacenar
        //la aparaciÃ³n o no de cada una de las vocales en el array dado
        //que contiene la palabra
        
        //ACCIONES
        //bucle para detectar las apariciones de las vocales en la palabra
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //si el caracter es vocal actualizar componente correspondiente del
            //array apariciones
            switch (caracteres[indice]) {
                case 'a' -> vocales[0]=true;
                case 'e' -> vocales[1]=true;
                case 'i' -> vocales[2]=true;
                case 'o' -> vocales[3]=true;
                case 'u' -> vocales[4]=true;
            }
        }
 
    }
    
    //declaraciÃ³n mÃ©todo de objeto funciÃ³n tieneLasCincoVocales que verifica si la
    //el objeto Palabra correspondiente tiene las 5 vocales entre sus caracteres
    public boolean tieneLasCincoVocales() {
        //DECLARACIONES
        //declaraciÃ³nvaribale array de componentes booleanas para almacenar
        //la aparaciÃ³n o no de cada una de las vocales en el array dado
        //que contiene la palabra
        boolean [] apariciones={false,false,false,false,false};
        
        //ACCIONES
        //bucle para detectar las apariciones de las vocales en la palabra
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //si el caracter es vocal actualizar componente correspondiente del
            //array apariciones
            switch (caracteres[indice]) {
                case 'a' -> apariciones[0]=true;
                case 'e' -> apariciones[1]=true;
                case 'i' -> apariciones[2]=true;
                case 'o' -> apariciones[3]=true;
                case 'u' -> apariciones[4]=true;
            }
        }
        
        //devolver el resultado de verificar si las 5 vocales han aparecido
        //en la palabra
        return verificar(apariciones);
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
        
        public boolean litograma(){
        final char[]LETRAS={'a','e','i','o','u','b','c','d','f','g','h','j','q','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
        int [] apariciones=new int[27];
        int x=0;
         for (int indice=0;indice<apariciones.length;indice++) {
             apariciones[indice]=0;
         }
        //ACCIONES
        //bucle para detectar las apariciones de las vocales en la palabra
        for (int indice=0;indice<caracteres.length;indice++) {
            if (todosLosCaracteres(caracteres[indice])) {
                //asignar true en la componente corespondiente a la vocal
                apariciones[indiceVocal(LETRAS,caracteres[indice])]++;
            }
        }
            for (int i = 0; i < apariciones.length; i++) {
                if (apariciones[i]==0) {
                    x++;
                }
            }
            return (x!=1);
    }
        
        
             public boolean heterograma() {
        final char[]LETRAS={'a','e','i','o','u','b','c','d','f','g','h','j','q','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
        int [] apariciones=new int[27];
         for (int indice=0;indice<apariciones.length;indice++) {
             apariciones[indice]=0;
         }
        //ACCIONES
        //bucle para detectar las apariciones de las vocales en la palabra
        for (int indice=0;indice<caracteres.length;indice++) {
            if (todosLosCaracteres(caracteres[indice])) {
                //asignar true en la componente corespondiente a la vocal
                apariciones[indiceVocal(LETRAS,caracteres[indice])]++;
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
     private boolean todosLosCaracteres(char car){
         return((car=='b')||(car=='c')||(car=='d')||(car=='f')||(car=='g')
                ||(car=='h')||(car=='j')||(car=='k')||(car=='l')||(car=='m')||(car=='n')||(car=='p')||(car=='q')
                ||(car=='r')||(car=='s')||(car=='t')||(car=='v')||(car=='w')||(car=='x')||(car=='y')||(car=='z')
                 ||(car=='u')||(car=='o')||(car=='i')||(car=='e')||(car=='a'));
     }
     private boolean verificar(int [] datos) {
  
        for (int indice=0;indice<datos.length;indice++) {
            if (datos[indice]>=2){
                return false;
            }
        }
        
        return true;
    }
    

    //declaraciÃ³n mÃ©todo privado funciÃ³n verificar que lleva a cabo la verificaciÃ³n
    //de si el array booleano dado todas sus componentes son true
    private boolean verificar(boolean [] datos) {
        //bucle verificaciÃ³n por componentes
        for (int indice=0;indice<datos.length;indice++) {
            if (datos[indice]!=true) {
                return false;
            }
        }
        
        //devoluciÃ³n del valor true porque se ha comprobado que todas
        //las componentes del array dado son true
        return true;
    }
    
    //declaraciÃ³n mÃ©todo de objeto numerVocales que lleva a cabo la obtenciÃ³n
    //del nÃºmero de caracteres vocales que el objeto Palabra correspodiente
    //contiene
    public int numeroVocales() {
        //DECLARACIONES
        //declaraciÃ³n variable entera para almacenar el nÃºmero de vocales
        int numeroVocales=0;
        
        //ACCIONES
        //bucle para contar el nÃºmero de vocales
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //verificar si el caracter indice-Ã©simo del objeto Palabra
            //es vocal
            if (esVocal(caracteres[indice])) {
                //incrementar contador 
                numeroVocales++; 
            }
        }
        //DEVOLUCIÃ“N CONTADOR
        return numeroVocales;
    }
    
    //declaraciÃ³n mÃ©todo privado funciÃ³n esVocal que verifica si el caracter
    //dado por parÃ¡metro es una vocal
    
    //declaraciÃ³n mÃ©todo de objeto terminacionEn que verifica si el objeto Palabra
    //correspondiente termina con el caracter dado por teclado
    public boolean terminacionEn(char car) {
        return (caracteres[numeroCaracteres-1]==car);
    }
    
    //declaraciÃ³n mÃ©todo de objeto comienzoEn que verifica si el objeto Palabra
    //correspondiente comienza con el caracter dado por teclado
    public boolean comienzoEn(char car) {
        return (caracteres[0]==car);
    }

    public char getCaracteres(int i){
        return caracteres[i];
    }
}