package rvt;

import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());
        int start = 0;
        int end = num + 1;
         for (int i = start; i < end; i++) {
            System.out.println(i);
        scanner.close();
    }
}
}