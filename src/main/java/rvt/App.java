package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);   
    
            int start = Integer.valueOf(scanner.nextLine());
            int end = Integer.valueOf(scanner.nextLine());
            divisableByThreeInRange(start, end);
        }
    
        public static void divisableByThreeInRange(int start, int end) {
            for (int i = start; i <= end; i+++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }

        ///int age = Integer.valueOf(scanner.nextLine());
        //scanner.close();
        //if (age > 18) {
       //     System.out.println("Tu esi pilngadīgs"); 
       // }
       //if(value >= start)
    }
}
