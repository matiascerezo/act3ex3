/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3ex3;

import java.util.Scanner;

/**
 *
 * @author ALUMNEDAM
 */
public class Act3Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        System.out.println("Número de UF a matricularte(Ex: 5) : ");
        int uf = lector.nextInt();
        
        if (uf >0) {            
            if (uf < 12) {
                int calcul = uf * 30;
                System.out.println("El preu total és: " + calcul + " €");
            }
            else if (uf >= 12) {
                int preuMaxim = 380;
                System.out.println("Preu total és: " + preuMaxim + " €" );
            }            
        }
        else {
            System.out.println("Tiene que ser mayor que 0.");
        }
    }
    
}
