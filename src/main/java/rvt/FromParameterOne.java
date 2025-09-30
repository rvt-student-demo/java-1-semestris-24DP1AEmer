package rvt;
import java.util.Scanner;
public class FromParameterOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(num-1);
        scanner.close();
    }

    public static void printFromNumberToOne(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
