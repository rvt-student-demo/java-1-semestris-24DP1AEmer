package rvt;

import java.util.Scanner;

public class NumOfSum {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = num;
        int ni = 0;
        while (num != 0) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            sum = sum + num;   
            ni = ni + 1;
    
        }
        System.out.println("Number of numbers " + (ni));
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}