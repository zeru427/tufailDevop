package day2;

public class InitializerDemo {

    int num=10;
    //initializer/anonymous block
    {
            num++;
            System.out.println("3. INITIALZER CALLED");
    }
   public  InitializerDemo(){
       num++;
       System.out.println("4. InitializerDemo cons CALLED");
    }
    //static block
    static {
        System.out.println("1. STATIC INITIALZER CALLED");
    }
    public static void main(String[] args) {
        System.out.println("2.MAIN CALLED");
        InitializerDemo i1 = new InitializerDemo();
        new InitializerDemo();
        System.out.print(i1.num);       //12

    }
}
