package day2;

public class DemoLocalVariable {
    int  num1=0;
    public void display(){
        int num2=0;
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
        DemoLocalVariable d1 = new DemoLocalVariable();
        d1.display();
    }
}
