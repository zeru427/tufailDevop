package collectionsdemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> datas = new TreeMap<String,Integer>();

        datas.put("Daniel",98000);
        datas.put("Richard",18000);
        datas.put("Sachin",58000);

        System.out.println(datas);

    }
}
