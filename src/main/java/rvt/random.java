package rvt;

import java.util.Scanner;
import java.util.Random;

public class random {
        public static void main(String[] args) {
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        int res = ran.nextInt(10) + 1;
        System.out.println("Es domaju skaitli no 1 lidz 10.");
        System.out.println("Tev tas jauzmin tris meiginajumos.");
        System.out.println("Ievadi minejumu:");
        int number = Integer.valueOf(scanner.nextLine());
        int num = 0;
        while(num < 3){
            if (number == res){
                System.out.println("Pareizi!");
                break;
            } else {
                System.out.println("Nepareizi!");
                num = num + 1;
                if (num == 3){
                    System.out.println("Parizais skaitlis bija:" + res);
                    System.out.println("Tu zaudeji speli!");
                } else {
                    number = Integer.valueOf(scanner.nextLine());
                }
            }
        }


}
}
