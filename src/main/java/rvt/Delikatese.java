package rvt;
import java.util.Scanner;
public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi preci:");
        String name = scanner.nextLine();
        System.out.println("Ievadi cenu:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Express piegade (0 == ne, 1 == ja):");
        int express = Integer.valueOf(scanner.nextLine());
        System.out.println("Rekins:");
        if (number < 10) {
            System.out.println(name +" "+ number);
            if (express == 1) {
                System.out.println("Piegade " + 5);
                System.out.println("Kopa "+ (number + 5));
            }
            else {
                System.out.println("Piegade " + 2);
                System.out.println("Kopa " + (number + 2));
            }
        
        }
        else {
            System.out.println(name+" " + number);
            if (express == 1) {
                System.out.println("Piegade " + 3);
                System.out.println("Kopa "+ number + 3);
            }
            else {
                System.out.println("Piegade " + 0);
                System.out.println("Kopa " + number + 0);
            }
        }

        scanner.close();
    }
}