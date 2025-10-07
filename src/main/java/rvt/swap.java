package rvt;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Give two indices to swap: ");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
