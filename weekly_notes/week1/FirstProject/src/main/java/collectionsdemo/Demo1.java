package collectionsdemo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        Set names = new LinkedHashSet();

        names.add("Sameer");
        names.add("Attaputta");
        names.add("Tufail");
        names.add("Daniel");
        names.add("Attaputta");
        names.add("Richard");

        names.remove("Tufail");

        System.out.println(names);
    }
}
