package loops;

import java.util.Scanner;

public class NewLineForDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any integer: ");
        String nb = sc.next();
        char[] nbArray = nb.toCharArray();
        for (char c : nbArray) {
            System.out.println(c);
        }
    }
}
