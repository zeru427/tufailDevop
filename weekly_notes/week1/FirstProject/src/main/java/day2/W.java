package day2;

public class W {
    int i;          //instance
    static int j; //class
    public W() {
        int k;      //local
        System.out.println("W constructor");
    }
    static {
        System.out.println("static block W");
    }
    public void changeValue(){
        int num1;       //local variable

        {
                int num2; //block variable
        }

        for(int counter=0;counter<=5;counter++){

        }
    }
    public static void main(String[] args) {

    }
}

