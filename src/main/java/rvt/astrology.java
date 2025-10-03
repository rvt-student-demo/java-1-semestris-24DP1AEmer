package rvt;

public class astrology {


    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }


    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // example
        printSpaces(5);
        printStars(3);
    }
}