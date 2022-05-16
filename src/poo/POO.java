
package poo;


public class POO {


    public static void main(String[] args) {
       
    Celular celular1 = new Celular("Iphone","dorado");
    celular1.llamar();
    Celular celular2 = new Celular("Xiami","negro");
    celular2.llamar();

    Celular dt = new Celular();
    dt.detallecelular(celular2);
    dt.detallecelular(celular1);

 }
    
}
