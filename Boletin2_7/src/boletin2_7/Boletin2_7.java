/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;
import java.util.Scanner;
import java.math.MathContext;
/**
 *
 * @author Jose Barros
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         float n,i,t;
         System.out.println("Introduzca el nominal");
         n=teclado.nextFloat();
         System.out.println("Introduzca % de interes");
         i=teclado.nextFloat();
         System.out.println("Introduzca el numero de años");
         t=teclado.nextFloat();
         t=t*12;
         i=i/1200;
         double nMensual=(n*Math.pow((1+i),t)*i)/(Math.pow((1+i),t)-1);
         System.out.println("La renta mensual es"+nMensual);
       
        // TODO code application logic here
}
    
}
