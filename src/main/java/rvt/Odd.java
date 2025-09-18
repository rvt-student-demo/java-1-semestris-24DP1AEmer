package rvt;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.println("number "+ number + " is even.");
        } else {
            System.out.println("number "+ number +" is odd.");
        }

        scanner.close();
    }
}
