package day2;

public class Z {


    {
        System.out.println("instance block - Z");
    }

    static {
        System.out.println("static block - Z");
    }

    public Z() {
        System.out.println("Z constructor");
    }

    public static void main(String st[]) {
        System.out.println("In main");
        Z z1 = new Z();
        Z z2 = new Z();
    }
}

