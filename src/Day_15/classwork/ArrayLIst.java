package Day_15.classwork;

import java.util.ArrayList;

public class ArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Selvaraj");
        names.add("Maheshwari");
        names.add("Sarumathi");
        names.add("Sarvin");
        for (int i=0;i<names.size();i++) {
            System.out.println(names.get(i));
        }
        for(String i:names){
            System.out.println(i+" "+i.length());
        }
    }
}
