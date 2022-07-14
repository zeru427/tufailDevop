package day6;

public class Demo4 {

    public void display1(){
        System.out.println("Hello Display1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye Display1");
    }
    public void display2(){
        System.out.println("Hello Display2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye Display2");
    }

    public static void main(String[] args) {
        Demo4 d = new Demo4();
        d.display1();
        d.display2();
    }
}
