/* *****************************************************************************
* FUNCIONALIDAD: Llevar a cabo la implementación de la clase Persona teniendo en cuenta los siguientes
puntos:
* ONJETIVO: Practica en la resolucion de problermas utilizando un array en Java utilizando Netbeans
* Fecha de creacion: 13.11.2022
* Fecha ultima de modificacion: 13.11.2022
* Autor: Lucas Sabater
***************************************************************************** */
package gamificacion12;

public class Persona{
    private String nombre;
    private int edad;
    private String nif;
    private int codigoPostal;
    private int altura;
    private double peso;
    
    public Persona(){}
    
    public Persona (String dato1,int dato2, String dato3, int dato4, int dato5, double dato6){
        nombre=dato1;
        edad=dato2;
        nif=dato3;
        codigoPostal=dato4;
        altura=dato5;
        peso=dato6;
    }
    
    public void lectura(){
        System.out.println("NOMBRE:");
        nombre=LT.readLine();
        System.out.println("EDAD:");
        edad=LT.readInt();
        System.out.println("NIF:");
        nif=LT.readLine();
        System.out.println("CODIGO POSTAL:");
        codigoPostal=LT.readInt();
        System.out.println("ALTURA:");
        altura=LT.readInt();
        System.out.println("PESO:");
        peso=LT.readInt();
}
    
    @Override
    public String toString(){
    return "Nombre: "+nombre+"\n"+"Edad: "+edad+"años \n"+
            "NIF: "+nif+"\n"+"Codigo Postal: "+codigoPostal+"\n"+
            "Altura: "+altura+"cms \n"+"Peso: "+peso+"kgs \n";
}
    public double IMC(){
    return peso/(altura/100);

}
    
    public boolean menorEdad(){
            return edad<18;
}
    
    public boolean terceraEdad(){
        return edad>65;
    }
    
    public boolean viveCodigoPostal(int codigo){
        return codigo==codigoPostal;
    }
    
   public String getNombre() {
        return nombre;
    }
    //método set del atributo autor
    public void setNombre(String dato) {
        nombre=dato;
    }

    //método get del atributo titulo
    public int getEdad() {
        return edad;
    }
    //método set del atributo titulo
    public void setEdad(int dato) {
        edad=dato;
    }

    //método get del atributo genero
    public double getPeso() {
        return peso;
    }
    //método set del atributo genero
    public void setPeso(double dato) {
        peso=dato;
    }

    //método get del atributo editorial
    public int getAltura() {
        return altura;
    }
    //método set del atributo editorial
    public void setAltura(int dato) {
        altura=dato;
    }

    //método get del atributo añoEdicion
    public int getCodigoPostal() {
        return codigoPostal;
    }
    //método set del atributo añoEdicion
    public void setCodigoPostal(int dato) {
        codigoPostal=dato;
    } 
        public String getNif() {
        return nif;
    }
    //método set del atributo autor
    public void setNif(String dato) {
        nif=dato;
    }
}
