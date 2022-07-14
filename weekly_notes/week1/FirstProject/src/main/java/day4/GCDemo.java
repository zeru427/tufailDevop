package day4;
class Employee {
            public void finalize(){
                //code here to save this in file
                System.out.println("EMPLOYEE finalize called");
            }
}
public class GCDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
       e1=e4;
        e4=e2;
        e2=e3;
        e3=null;
        System.gc();
        //How many objects are eligible for GC
        //1
    }
}
