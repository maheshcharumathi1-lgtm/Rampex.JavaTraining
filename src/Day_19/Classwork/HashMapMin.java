package Day_19.Classwork;

import java.util.*;

public class HashMapMin {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Sarumathi",90);
        hm.put("Sarvin",95);
        hm.put("kishore",80);
        hm.put("Sandhiya",85);
        int min=100;
        String name="";
        for(Map.Entry<String,Integer> e: hm.entrySet()){
            if(e.getValue()<min){
                min=e.getValue();
                name=e.getKey();
            }
        }
        System.out.println(min);
        System.out.println(name);
    }
}
