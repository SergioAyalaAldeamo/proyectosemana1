
package poo;


public class Celular {

private String nombre,color;

    public Celular(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Celular(){
    }

    public void llamar(){
    System.out.println("Llamado de "+nombre+" Color: "+color);
    }

    public void detallecelular(Celular celular){
    System.out.println("------------------------------------------------------------");
    System.out.println("Nombre: "+ celular.nombre+"\nColor: "+celular.color);
    System.out.println("------------------------------------------------------------");
    }
    
}
