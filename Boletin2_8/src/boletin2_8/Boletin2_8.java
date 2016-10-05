/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;
import java.util.Scanner;
/**
 *
 * @author Jose Barros
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // TODO code application logic here
        float gradosC,gradosK,gradosF;
        System.out.println("Introducir temperatura en grados centigrados");
        gradosC=teclado.nextFloat();
        gradosK=gradosC+273f;
        System.out.println("son "+gradosK+" grados Kelvin");
        gradosF=1.8f*gradosC+32f;
        System.out.println("son "+gradosF+" grados Farenheith");
        
}
    
}
