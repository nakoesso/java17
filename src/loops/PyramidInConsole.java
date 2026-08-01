package loops;

import java.util.Scanner;

public class PyramidInConsole {
    public static void main(String[] args) {
        // 1. Initialisation du Scanner
        Scanner sc = new Scanner(System.in);

        // 2. Demande de la hauteur à l'utilisateur
        System.out.print("Please, enter height of the pyramid: ");
        int height = sc.nextInt();

        // 3. Partie croissante de la pyramide
        for (int i = 1; i < height + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Passage à la ligne suivante
        }

        // 4. Partie décroissante de la pyramide
        for (int i = height - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Passage à la ligne suivante
        }

        // 5. Fermeture du Scanner
        sc.close();
    }
}