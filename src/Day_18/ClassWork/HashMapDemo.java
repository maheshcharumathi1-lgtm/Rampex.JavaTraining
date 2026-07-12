package Day_18.ClassWork;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm =new HashMap<Integer,String>();
        hm.put(1,"Selvaraj");
        hm.put(2,"Maheshwari");
        hm.put(3,"Sarumathi");
        hm.put(4,"Sarvin");
        hm.put(5,"Raja");
        hm.put(null,null);
        System.out.println(hm);
        System.out.println(hm.get(5));
        hm.remove(null);
        System.out.println(hm);
        System.out.println(hm.containsKey(3));
        System.out.println(hm.get(5).length());
    }


}
