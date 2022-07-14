package day2;

public class ControlFlowDemo {

    int num=10;
    int age=188;
   int num1=981;
   int num2=8675;
   int  num3=9312;
    public void displayHighestNumber(){
        int highestNumber=num1;
        //Print the highest number
        if(num1<num2){
            highestNumber=num2;
        }
        if(num2<num3){
            highestNumber=num3;
        }
        else{
            System.out.println("The highest number is: " + highestNumber);
        }
    }

    public void display(){
        if(age< 0){
            System.out.println("Age is negative");
        }
        else if( age > 120) {
            System.out.println("You are over aged");
        }
        else {
            System.out.println("Age is correct");
        }
    }
    public static void main(String[] args) {
     ControlFlowDemo demo = new ControlFlowDemo();
     demo.display();
     demo.displayHighestNumber();
     Customer customer = new Customer();
    }
}
