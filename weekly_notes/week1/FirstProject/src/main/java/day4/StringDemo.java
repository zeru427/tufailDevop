package day4;

public class StringDemo {

    public static void main(String[] args) {

        String name="Daniel";
        name = "Richard";

        System.out.println(name);       //Richard
        name = name.concat(" Thomas");
        System.out.println(name.length());
        System.out.println(name);      // ?? Richard


    }
}
