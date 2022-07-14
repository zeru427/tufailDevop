package collectionsdemo;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("Sameer");
        names.add("Attaputta");
        names.add("Tufail");
        names.add("Daniel");
        names.add("Attaputta");
        names.add("Richard");


        Iterator<String> i = names.iterator();

        while(i.hasNext()){
            String temp = i.next();
            System.out.println(temp);
        }

    }
}
