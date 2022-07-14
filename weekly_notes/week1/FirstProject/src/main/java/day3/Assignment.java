package day3;

public class Assignment {
    int num1=10;
    int num2=20;

    public void display(){
        System.out.println("Num1 :"+num1);
        System.out.println("Num2 :"+num2);
    }
    public void change(int num1,Assignment assignment){
        num1--;
        this.num1--;
        assignment.num1++;
        num2=99;
    }

    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        int num1=100;
        assignment.change(num1,assignment);
        assignment.display();
    }
}
