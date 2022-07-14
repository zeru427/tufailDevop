package day4;

public class StringAssignmentSolution {

    public static void main(String[] args) {

        String string = "The quick brown fox jumps over the lazy dog";

        //print char at index 12
        System.out.println(string.charAt(12));
        //add string "and killed it" to existing string
        String string1 = string.concat(" and killed it");
        System.out.println(string1);
        //check weather string is equal to "The quick brown fox jumps over the lazy Dog"
        System.out.println(string.equals("The quick brown fox jumps over the lazy Dog"));
        //check weather string is equal to "THE QUICK BROWN..."
        System.out.println(string.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        //find length of string
        System.out.println(string.length());
        //check weather string matches "The quick.... Dog"
        System.out.println(string=="the quick brown fox jumps over the lazy Dog");
        //replace word "The" with the word "A"
        String string2 = string.replace("The", "A");
        System.out.println(string2);
        //split string into two so
        String[] stringparts = string.split("j");
        String string3 = stringparts[0];
        String string4 = stringparts[1];
        System.out.println(string3 + " - " + string4);
        //print animal names alone
        String string5 = string.substring(15,19);
        String string6 = string.substring(39,43);
        System.out.println(string5 +" - "+ string6);
        //print above string in lower case
        String string7 = string6.toLowerCase();
        System.out.println(string7);
        //print above string in upper case
        String string8 = string7.toUpperCase();
        System.out.println(string8);
        //find index of character a
        System.out.println(string.indexOf('a'));
        //find index of character e
        System.out.println(string.indexOf('e'));
    }
}
