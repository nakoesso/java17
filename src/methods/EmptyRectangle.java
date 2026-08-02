package methods;

import java.util.Scanner;

public class EmptyRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);
    }

    public static void drawRectangle(int height, int width) {
        if (height <= 0 || width <= 0) {
            System.out.println("La hauteur et la largeur doivent être supérieures à 0.");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Affiche une étoile pour les bordures (première/dernière ligne ou première/dernière colonne)
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Passage à la ligne suivante
            System.out.println();
        }

    }
}
