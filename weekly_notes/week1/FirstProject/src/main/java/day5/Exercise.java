package day5;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
       int numbers[]= new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int countNegative=0;
        System.out.println("Please enter five numbers  :");

            for(int i=0;i<numbers.length;i++){
                numbers[i] = scanner.nextInt();
                if(numbers[i]<0) {
                    countNegative++;
                    continue;                           //it skips the below line
                }
                else if (numbers[i] > 100000)
                {
                    System.out.println(("Sorry exiting the loop, because you have entered more than 100000"));
                    break;
                }

                sum += numbers[i];
            }

        System.out.println("Sum of all the positive numbers are : "+sum);
        System.out.println("You have entered "+countNegative+" negative numbers");

    }
}
