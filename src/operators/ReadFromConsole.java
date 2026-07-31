package operators;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
        sc.close();

    }
}
