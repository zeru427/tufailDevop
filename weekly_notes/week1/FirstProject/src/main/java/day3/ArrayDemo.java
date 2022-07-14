package day3;

public class ArrayDemo {

    public static void main(String[] args) {
        int num1,num2,num3,num4,num5;

        int []num = new int[10];

       // -subscript starts from 0
        //num[0]

        int marks[] = { 23,78,91,87,65,87,871};

        System.out.println("Printing arrays - 1");
        for(int i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("Printing arrays - using arrays.length ");

        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("Printing arrays - using enhanced for loop "); //JDK1.5 - arrays

        for(int temp:marks)
        {
            System.out.println(temp);
        }

        String names[] = new String[5];

        names[0] = "Jay";
        names[1] = "Daniel";
        names[2] = "Richard";
        names[3] = "Tarun";
        names[4] = "Ahmed";

        for (String ename : names) {
            System.out.println(ename);
        }

    //TODo - Please print all the names  by using arrays.length and enhanced for loop
    }
}
