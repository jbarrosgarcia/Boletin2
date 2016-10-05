/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_11_12;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin2_11_12 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // TODO code application logic here
        float sueldoF=0f,porVentas=0f,sueldoFinal=0f;
        int kmHechos,diasDesp;
        System.out.println("Introducir sueldo fijo");
        sueldoF=teclado.nextFloat();
        System.out.println("Introducir el total de ventas");
        porVentas=teclado.nextFloat();
        System.out.println("Introducir los km recorridos");
        kmHechos=teclado.nextInt();
        System.out.println("Introducir dias de desplazamiento");
        diasDesp=teclado.nextInt();
        porVentas=porVentas*0.05f;
        kmHechos=kmHechos*2;
        diasDesp=diasDesp*30;
        sueldoFinal=sueldoF+porVentas+kmHechos+diasDesp;
        float sueldoRecibido=0f;
        sueldoRecibido=(float) (sueldoFinal-36-(sueldoFinal*0.18));
        System.out.println("El salario a recibir es "+sueldoRecibido+" €");
}
    
}
