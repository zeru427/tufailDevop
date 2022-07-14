package day5;

import java.util.Scanner;

public class EvenOddSolution {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        int evenCount = 0;
        int oddCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter five numbers");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 0) {
                System.out.println("Negative numbers are not allowed");
                break;
            } else if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The count of even numbers: " + evenCount);
        System.out.println("The count of odd numbers: " + oddCount);

    }
}
