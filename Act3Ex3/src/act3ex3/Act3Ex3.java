package act3ex3;

import java.util.Scanner;

public class Act3Ex3 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Número de UF a matricularte(Ex: 5) : ");
        int uf = lector.nextInt(); 
        calculMatricula(uf);

    }

    public static int calculMatricula(int uf) {

        int calcul = 0;

        if (uf > 0) {
            if (uf < 12) {
                calcul = uf * 30;
                System.out.println("El preu total és: " + calcul + " €");
            } else if (uf >= 12) {
                calcul = 380;
                System.out.println("Preu total és: " + calcul + " €");
            }
        } else {
            System.out.println("Tiene que ser mayor que 0.");
        }

        return calcul;
    }

}
