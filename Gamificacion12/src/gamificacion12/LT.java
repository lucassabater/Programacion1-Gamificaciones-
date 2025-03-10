
package gamificacion12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * La clase LT (Lectura del Teclat) simplifica el procÃ©s de llegir dades des
 * de l'entrada del programa.
 * 
 * _/Manual d'Ãºs\_______________________________________________________________
 * Aquesta classe proporciona mecanismes per llegir l'entrada a travÃ©s del
 * teclat en prÃ©mer la tecla de retorn (intro).
 * 
 * __/Lectura del teclat\_______________________________________________________
 *  - LT.readChar(): lectura de carÃ cters 
 *      Llegeix l'entrada, un carÃ cter cada vegada que es fa servir.
 *      El darrer carÃ cter que es pot llegir Ã©s el \n.
 *      DesprÃ©s d'aixÃ² espera una nova lÃ­nia de text.
 * 
 *  - LT.readDouble(): lectura de nombres reals (precisiÃ³ doble)
 *  - LT.readFloat(): lectura de nombres reals (precisiÃ³ simple)
 *  - LT.readInt(): lectura de nombres enters (32 bits)
 *  - LT.readLong(): lectura de nombres enters (64 bits)
 *      Llegeix els carÃ cters de la lÃ­nia actual
 *      (de la resta de la lÃ­nia si s'ha consumit parcialment amb readChar)
 *      i els retorna en el format numÃ¨ric desitjat.
 * 
 *  - LT.skipLine(): es bÃ³ta una lÃ­nia
 *      Llegeix els carÃ cters de la lÃ­nia actual
 *      (de la resta de la lÃ­nia si s'ha consumit parcialment amb readChar)
 *      i els ignora.
 * 
 *  - LT.readLine(): lectura d'una lÃ­nia
 *      Llegeix els carÃ cters de la lÃ­nia actual
 *      (de la resta de la lÃ­nia si s'ha consumit parcialment amb readChar)
 *      i els retorna un String.
 * 
 * __/ConfiguraciÃ³\_____________________________________________________________
 *  - setup(): (re)configuraciÃ³ estÃ ndard
 *      Es fa servir automÃ ticament si no s'ha configurat.
 *      Hauria de funcionar correctament sempre excepte en els segÃ¼ents casos.
 * 
 *  - setupWindowsCmd(): (re)configuraciÃ³ pel terminal de Windows
 *      Estableix la codificaciÃ³ necessÃ ria per llegir correctament des del
 *      cmd de Windows.
 * 
 *  - setupWindowsNetbeans(): (re)configuraciÃ³ per Netbeans a Windows
 *      Estableix la codificaciÃ³ necessÃ ria per llegir correctament des del
 *      terminal integrat a Netbeans executat a Windows.
 * 
 * _/Historial de versions\_____________________________________________________
 * versiÃ³ 2.2:
 *  - MÃ¨tode readLong.
 *  - Privatitzat read.
 *  - Afegit aquest manual d'Ãºs.
 * 
 * versiÃ³ 2.1:
 *  - Afegit suport per a codificacions de carÃ cters.
 *  - Afegit '\n' en omplir el buffer, respectant la lectura de lÃ­nies i nombres.
 * 
 * versiÃ³ 2.0:
 *  - Reescriptura de la classe.
 *  - Lectura de carÃ cters successius en una mateixa lÃ­nia.
 * 
 * @author Els professors de l'assignatura 22393 - ProgramaciÃ³ - InformÃ tica I
 * @version 2.2
 */
public class LT {
    
    private static char[] buffer;
    private static int index;
    private static BufferedReader br;
    
    // A Windows, els encodings estan malament.
    private static final String ENCODING_WINDOWS_NETBEANS = "Cp1252";
    private static final String ENCODING_WINDOWS_CMD = "Cp850";
    
    private static boolean setup = false;
    
    /**
     * Configura l'encoding dels carÃ cters amb la codificaciÃ³ per defecte.
     * Hauria de funcionar bÃ©, en teoria, excepte en els casos segÃ¼ents.
     */
    public static void setup() {
        br = new BufferedReader(new InputStreamReader(System.in));
        setup = true;
    }
    
    /**
     * Configura l'encoding dels carÃ cters per a funcionar dins el Netbeans a Windows.
     * Netbeans introdueix els carÃ cters amb Cp1252, perÃ² Java es pensa que ho fa en UTF-8.
     */
    public static void setupWindowsNetbeans() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in, ENCODING_WINDOWS_NETBEANS));
            setup = true;
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException(uee);
        }
    }
    
    /**
     * Configura l'encoding dels carÃ cters per a funcionar amb el CMD de Windows.
     * El CMD introdueix els carÃ cters amb Cp850, perÃ² Java es pensa que ho fa en Cp1252.
     */
    public static void setupWindowsCmd() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in, ENCODING_WINDOWS_CMD));
            setup = true;
        } catch (UnsupportedEncodingException uee) {
            throw new RuntimeException(uee);
        }
    }
    
    
    /**
     * Omple el buffer amb una lÃ­nia de l'entrada, reiniciant l'Ã­ndex.
     */
    private static void fillBuffer() {
        if (!setup) {
            setup();
        }
        try {
            String line = br.readLine() + '\n';
            buffer = line.toCharArray();
            index = 0;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    /**
     * Llegeix la resta del buffer, a partir de l'Ã­ndex actual, marcant-lo
     * com a llegit.
     * 
     * @return un String amb la resta del buffer
     */
    private static String readBuffer() {
        int offset = index;
        int count = buffer.length - index;
        index = buffer.length;
        return new String(buffer, offset, count);
    }
    
    /**
     * Retorna una lÃ­nia sense el darrer carÃ cter, que Ã©s el de newline.
     * 
     * @param line la lÃ­nia amb el \n al final
     * @return la lÃ­nia sense el \n al final
     */
    private static String removeNewline(String line) {
        return line.substring(0, line.length() - 1);
    }
    
    /**
     * Llegeix un sol carÃ cter. Executa readChar().
     * 
     * @return el carÃ cter que s'ha llegit
     */
    private static char read() {
        return readChar();
    }
    
    /**
     * Llegeix un sol carÃ cter.
     * 
     * @return el carÃ cter que s'ha llegit
     */
    public static char readChar() {
        if (!(buffer != null && index < buffer.length)) {
            fillBuffer();
        }
        return buffer[index++];
    }
    
    /**
     * Llegeix una lÃ­nia de text i la converteix en un nombre enter.
     * Una lÃ­nia acaba amb un line feed ('\n'), carriage return ('\r'), o un
     * carriage return seguit immediatament d'un line feed.
     * 
     * @return l'int creat a partir de la lÃ­nia de text llegida
     */
    public static int readInt() {
        if (!(buffer != null && index < buffer.length - 1)) {
            fillBuffer();
        }
        return Integer.parseInt(removeNewline(readBuffer()));
    }
    
    /**
     * Llegeix una lÃ­nia de text i la converteix en un nombre enter.
     * Una lÃ­nia acaba amb un line feed ('\n'), carriage return ('\r'), o un
     * carriage return seguit immediatament d'un line feed.
     * 
     * @return el long creat a partir de la lÃ­nia de text llegida
     */
    public static long readLong() {
        if (!(buffer != null && index < buffer.length - 1)) {
            fillBuffer();
        }
        return Long.parseLong(removeNewline(readBuffer()));
    }
    
    /**
     * Llegeix una lÃ­nia de text i la converteix en un nombre en punt flotant de
     * doble precisiÃ³.
     * Una lÃ­nia acaba amb un line feed ('\n'), carriage return ('\r'), o un
     * carriage return seguit immediatament d'un line feed.
     * 
     * @return el double creat a partir de la lÃ­nia de text llegida
     */
    public static double readDouble() {
        if (!(buffer != null && index < buffer.length - 1)) {
            fillBuffer();
        }
        return Double.parseDouble(removeNewline(readBuffer()));
    }
    
    /**
     * Llegeix una lÃ­nia de text i la converteix en un nombre en punt flotant.
     * Una lÃ­nia acaba amb un line feed ('\n'), carriage return ('\r'), o un
     * carriage return seguit immediatament d'un line feed.
     * 
     * @return el float creat a partir de la lÃ­nia de text llegida
     */
    public static float readFloat() {
        if (!(buffer != null && index < buffer.length - 1)) {
            fillBuffer();
        }
        return Float.parseFloat(removeNewline(readBuffer()));
    }
    
    /**
     * Llegeix una lÃ­nia de text i la converteix en un array de carÃ cters.
     * Una lÃ­nia acaba amb un line feed ('\n'), carriage return ('\r'), o un
     * carriage return seguit immediatament d'un line feed.
     * 
     * @return el char[] creat a partir de la lÃ­nia de text llegida
     */
    public static char[] readLineArray() {
        if (!(buffer != null && index < buffer.length - 1)) {
            fillBuffer();
        }
        return removeNewline(readBuffer()).toCharArray();
    }

    /**
     * Llegeix una lÃ­nia de text i la converteix en un array de carÃ cters.
     * Una lÃ­nia acaba amb un line feed ('\n'), carriage return ('\r'), o un
     * carriage return seguit immediatament d'un line feed.
     * 
     * @return el char[] creat a partir de la lÃ­nia de text llegida
     */
    public static String readLine() {
        if (!(buffer != null && index < buffer.length - 1)) {
            fillBuffer();
        }
        return removeNewline(readBuffer());
    }

    
    /**
     * Es salta una lÃ­nia de text.
     */
    public static void skipLine() {
        if (!(buffer != null && index < buffer.length)) {
            fillBuffer();
        }
        readBuffer();
    }
    
}