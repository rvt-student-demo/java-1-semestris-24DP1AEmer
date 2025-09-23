package rvt;

import java.util.Scanner;

public class BobsBolts {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Šādas cenas:");
        System.out.println("1. skruv: 5 centi");
        System.out.println("2. uzgriezni: 3 centi");
        System.out.println("3. paplaksni: 1 centi");

        System.out.println("Cik skruves velaties:");
        int skruves = Integer.valueOf(scanner.nextLine());

        System.out.println("Cik uzgrieznus velaties:");
        int uzgriezni = Integer.valueOf(scanner.nextLine());

        System.out.println("Cik paplaksnes velaties:");
        int paplaksnes = Integer.valueOf(scanner.nextLine());

        if (skruves > uzgriezni){
            System.out.println("Parbaudi pasūtījumu: par maz uzgrieznu.");
            int cena = (skruves * 5) + (uzgriezni * 3) + (paplaksnes * 1);
                System.out.println("Kopeja cena " + cena);
        }
        else if (skruves < uzgriezni){
            System.out.println("Pārbaudi pasutijumu: par maz skruves.");
            int cena = (skruves * 5) + (uzgriezni * 3) + (paplaksnes * 1);
                System.out.println("Kopeja cena " + cena);
        }
        else if (skruves == uzgriezni){
            if ((skruves*2) < paplaksnes){
                System.out.println("Parbaudi pasutijumu: par maz paplaksnes.");
                int cena = (skruves * 5) + (uzgriezni * 3) + (paplaksnes * 1);
                System.out.println("Kopeja cena " + cena);
            }
            else{
                int cena = (skruves * 5) + (uzgriezni * 3) + (paplaksnes * 1);
                System.out.println("Kopeja cena " + cena);
            }   
        }

        scanner.close();
    }
}
