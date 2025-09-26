package rvt;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give Numbers:");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int ni = 0;
        double average = 0;
        int odd = 0;
        while (num != -1) {
            sum = sum + num;
            ni = ni + 1;
            if (num % 2 != 0){
                odd = odd + 1;
            }
            num = Integer.valueOf(scanner.nextLine());
            average = (double) sum / ni;
            

            continue;

        }
            System.out.println("thx! Bye!" );
            System.out.println("Sum is " + sum);
            System.out.println("Numbers " + ni);
            System.out.println("Average:" + average);
            System.out.println("Odd: " + (odd));
        scanner.close();
    }
}
