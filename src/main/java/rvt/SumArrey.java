package rvt;
public class SumArrey {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
    }
    public static void sumOfNumbersInArray(int[] array){
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Sum is: " + sum);
    }   
}
