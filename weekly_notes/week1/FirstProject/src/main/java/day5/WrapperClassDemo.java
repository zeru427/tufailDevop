package day5;

public class WrapperClassDemo {
    public static void main(String[] args) {
        //casting - converting one data type into another data type
        //implicit
			//A

        byte b = 10;
        int num1 = b;

        //explicit
        int num=65;
        char p = (char)num;
        System.out.println(p);

        int nn=12;
        byte bb1 = (byte) nn;

        byte grade1 = 121;
        byte grade2=121;
        byte sum = (byte) (grade1 + grade2);     //why   ? reason : any arithmetic calculation will return int

        System.out.println(sum);

        //    4               8
        float salary = 90.8f;


        String marks="98";
        int marks1 = Integer.valueOf(marks);
        System.out.println(marks1);

        int maxMarks=90;
        Integer maxMarks1 = Integer.valueOf(maxMarks);      //Boxing


        //> JDK1.5
        Integer maxMarks2 = maxMarks;                               //Auto Boxing

        Integer minMarks = 900;
        int minMarks1 = Integer.valueOf(minMarks);      //Unboxing
        int minMarks2 = minMarks;                               //Auto unboxing

    }
}
