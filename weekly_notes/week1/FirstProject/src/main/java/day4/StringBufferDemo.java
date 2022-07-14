package day4;

public class StringBufferDemo {

    public static void main(String[] args) {
        //capacity method of stringbuffer
        //length vs capacity of stringbuffer
        //capacity = 16
        StringBuffer data = new StringBuffer(); //16 +initial length //21

        data.append("Hello");

        System.out.println(data);
        System.out.println(data.length());  //5
        System.out.println(data.capacity());        //16

        data.append("ppppppppppp");
        System.out.println(data.length());  //16
        System.out.println(data.capacity());        //16


        data.append("khh");
        System.out.println(data.length());  //19
        System.out.println(data.capacity());        //17*2 = 34

        data.append("ppppqqqqqqqqqqqTHHHHHHH");
        System.out.println(data.length());  //35
        System.out.println(data.capacity());        //35*2 = 70
    }
}
