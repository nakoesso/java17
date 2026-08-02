package methods;

import java.util.Scanner;

public class AmountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");

        String text = sc.nextLine();
        int amountOfWords = getWordsAmount(text);
        System.out.println("Amount of words in your text: " + amountOfWords);
    }

    public static int getWordsAmount(String text) {
        int count = 0;
        String[] words = text.trim().split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
