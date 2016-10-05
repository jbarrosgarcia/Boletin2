/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int dinero=0;
        System.out.println("Introducir cantidad de dinero");
        dinero=teclado.nextInt();
        int cantidadCien=0,cantidadVeinte=0,cantidadCinco=0,cantidadUno;
        cantidadCien=dinero/100;
        dinero=dinero-(cantidadCien*100);
        cantidadVeinte=dinero/20;
        dinero=dinero-(cantidadVeinte*20);
        cantidadCinco=dinero/5;
        dinero=dinero-(cantidadCinco*5);
        System.out.println("Cantidad billetes de cien "+cantidadCien);
        System.out.println("Cantidad billetes de veinte "+cantidadVeinte);
        System.out.println("Cantidad billetes de cinco "+cantidadCinco);
        System.out.println("Cantidad monedas de un Euro " +dinero);
}
    
}
