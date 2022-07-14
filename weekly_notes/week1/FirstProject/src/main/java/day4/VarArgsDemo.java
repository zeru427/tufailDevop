package day4;

//I have to add the numbers by using a function
public class VarArgsDemo {
    int sum=0;
    public int addNumbers(int id,int...marks){
            sum=0;
            for(int temp:marks){
                sum+= temp;
            }
            return sum;
    }

    public static void main(String[] args) {
            VarArgsDemo v = new VarArgsDemo();
        System.out.println(v.addNumbers(89,67,77));
        System.out.println(v.addNumbers(2,2));
        System.out.println(v.addNumbers(12));
    }
}
