package loops;

public class PrintMatrixToConsole {
    public static void main(String[] args) {
        // 1. Initialisation de la matrice avec des lignes de longueurs différentes
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7},
                {8, 9, 10}
        };

        // 2. Boucle externe pour parcourir chaque ligne
        for (int i = 0; i < matrix.length; i++) {

            // 3. Boucle interne pour parcourir les éléments de la ligne actuelle
            // matrix[i].length gère dynamiquement la taille de chaque ligne
            for (int j = 0; j < matrix[i].length; j++) {
                // Affichage de l'élément suivi d'une tabulation
                System.out.print(matrix[i][j] + "\t");
            }

            // 4. Passage à la ligne suivante après la fin de la boucle interne
            System.out.println();
        }
    }
}
