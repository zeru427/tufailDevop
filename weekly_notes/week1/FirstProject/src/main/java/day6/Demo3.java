package day6;

public class Demo3 {

    public void display(){
        System.out.println(1/0);                    //ArthimeticException
        System.out.println("Method completed");
    }
    public static void main(String[] args) {

        Demo3 d = new Demo3();
        d.display();

        System.out.println("Thanks for using my program");
    }
}
