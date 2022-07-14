package day4;

public class StringNew {

    public static void main(String[] args) {
        //equals     - will check whether the two string values are same or not
        //==        - will check refernce of the two strings

        String name1 = "Daniel";
        String name2 = new String("Daniel");
        String name3 = "Richard";
        String name4 = "Daniel";

        System.out.println(name1 == name4);
        System.out.println(name1.equals(name2));
        System.out.println(name4 == name1);
        System.out.println(name3.equals(name2));
        System.out.println(name4.equals(name3));
        System.out.println(name4.equals(name1));
        System.out.println(name4==name3);


        System.out.println(name1.contains("is"));

    }
}
