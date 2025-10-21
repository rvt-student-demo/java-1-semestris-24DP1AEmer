package rvt;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class list {
     public static void main(String[] args) {
        ListSize();
     }

    public static void OnlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        System.out.print("From where? ");
        int from = Integer.parseInt(scanner.nextLine());
        System.out.print("To where? ");
        int to = Integer.parseInt(scanner.nextLine());

        for (int i = from - 1; i <= to - 1; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
public static void ListSize() {
    ArrayList<String> names = new ArrayList<>();    
    Scanner scanner = new Scanner(System.in);
    String inpt = scanner.nextLine();

    while (inpt != "")  {
        names.add(inpt);
        inpt = scanner.nextLine();
    }

    System.out.println("In total: " + names.size());
}