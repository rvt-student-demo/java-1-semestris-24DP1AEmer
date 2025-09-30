package rvt;

import java.util.Scanner;

public class DivideByThree {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int start = Integer.valueOf(scanner.nextLine());
            int end = Integer.valueOf(scanner.nextLine());
            divisableByThreeInRange(start, end);
            scanner.close();
        }
        public static void divisableByThreeInRange(int start, int end) {
            for (int i = start; i <= end; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
    }
}
