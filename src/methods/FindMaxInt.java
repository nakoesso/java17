package methods;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");

        String numbers = sc.nextLine();
        int [] intArray = Arrays.stream(numbers.trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxInt = findMaxIntInArray(intArray);

        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*** Max number in array ***");
        System.out.println(maxInt);
    }


    public static int findMaxIntInArray(int[] intArray) {
		return Arrays.stream(intArray).max().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }
}
