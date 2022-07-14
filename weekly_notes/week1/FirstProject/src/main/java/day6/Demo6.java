package day6;

public class Demo6 {

    public void display1() throws InterruptedException {
        System.out.println("Hello Display1");
        Thread.sleep(1000);
        System.out.println("Bye Display1");
    }

    public void display2() throws InterruptedException {
        System.out.println("Hello Display2");
        Thread.sleep(1000);
        System.out.println("Bye Display2");
    }

    public static void main(String[] args)  {        //JVM
        Demo6 d = new Demo6();
        try {
            d.display1();
            d.display2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
