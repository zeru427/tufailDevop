package day2;
//QC : static keyword in java :
//Ans :The static keyword in Java is used to share the same variable or method of a given class
//The static keyword belongs to the class rather than an instance of the class.
//Real Time Scenario : count number of objects created
public class StaticDemo {
    int num1=10;
    static int counter=0;
    static int num2=20;
    public void changevalue(){
        num1--;
        num2++;
    }
    public static void changeValueAgain(){
          num2++;
    }
    public static void main(String[] args) {

            StaticDemo d1 = new StaticDemo();
            d1.counter++;
            d1.changevalue();
            StaticDemo d2 = new StaticDemo();
              d2.counter++;
            d2.changevalue();
            StaticDemo.changeValueAgain();
            System.out.println("D1 num1 :"+d1.num1);
            System.out.println("D1 num2 :"+d1.num2);

            System.out.println("D2 num1 :"+d2.num1);
            System.out.println("D2 num2 :"+d2.num2);
            //9 23 9 23

        System.out.println("No of objects created :"+d1.counter);
    }
}
