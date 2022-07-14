package day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        String name = null;
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name :");
        name = scanner.next();
        System.out.println("Please enter your age :");
        try {
            age = scanner.nextInt();                    //InputMismatchException
        }
        catch(InputMismatchException e){
            System.out.println("Please enter numbers only in age");
        }
        finally {
            //write the code here if you want to execute it 100%
            //closing
            System.out.println("FINALLY CALLED");
        }
        try {
            if(age<0){
                        throw new InvalidMinAgeException("Sorry age cannot be negative");
            }
            else if (age > 100){
                throw new InvalidMaxAgeException("Sorry age cannot be more than  100");
            }
            else {
                //store in persitent storage like files, db
                System.out.println("Welcome : " + name + " and your age is :" + age);
            }
        } catch (InvalidMinAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMaxAgeException e) {
            System.out.println(e.getMessage());
        } finally {
        }
        System.out.println("Thanks for using the program");
    }
}
