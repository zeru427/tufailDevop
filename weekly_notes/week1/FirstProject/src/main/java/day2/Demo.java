package day2;

//QC : What is a constructor
//Ans :
/*
	- special method
            - gets called automatically whenever you create an object
            - it has same name as the class name
	- it not have any return type, not even void
            - it is used for initialization
            - can be overloaded
            -java provides default constructor in every class if no constructor is there
            */

public class Demo {

   private int num1=10;                //instance variable
   static int num2=20;          //class variable
    public Demo() {
        num1++;
        num2--;
    }
    public Demo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void display(){
        System.out.println("Num 1 : "+num1);
        System.out.println("Num 2 : "+num2);
    }
    public static void main(String[] args) {

        Demo d1 = new Demo();
        d1.display();       //11 19
        Demo d2 = new Demo(100,200);
        d2.display();      //100 200
    }
}
