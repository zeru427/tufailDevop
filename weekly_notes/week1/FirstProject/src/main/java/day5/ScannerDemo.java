package day5;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        String name = null;
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name :");
        name = scanner.next();
        System.out.println("Please enter your age :");
        age = scanner.nextInt();


        //store in persitent storage like files, db
        System.out.println("Welcome : "+name+ " and your age is :"+age);
    }
}
